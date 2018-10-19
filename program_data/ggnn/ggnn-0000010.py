#!/usr/bin/env python3
import argparse
import os
import os.path
import json
import pickle
import time
import sys
import flatbuffers
from tqdm import tqdm
sys.path.insert(0, '/usr/share/_ggnn')
sys.path.insert(0, '/usr/share/_ggnn/_Graph')
sys.path.insert(0, '/usr/local/share/_ggnn')
sys.path.insert(0, '/usr/local/share/_ggnn/_Graph')
from Graph import *
from Unit import *
from ContextGraph import *
from ContextEdges import *
from Edge import *
from SymbolCandidate import *
from NodeLabel import *
from NodeType import *
import traceback
import pdb
import tqdm

parser = argparse.ArgumentParser()
parser.add_argument('--maps', action='store_true', default=True, help='maps node type to a consequetive number')
parser.add_argument('--localmaps', action='store_true', default=False, help='use local maps instead of global one')
parser.add_argument('--dup', action='store_true', default=False, help='keep duplicated edges of the nodetypes')
parser.add_argument('--bidirect', type=bool, default=False, help='make edges bidirectional')
parser.add_argument('--mixing', type=bool, default=False, help='make semantic edges syntactical to allow for propagation')
parser.add_argument('--syntaxonly', type=bool, default=False, help='output only syntactical edges')
parser.add_argument('--occurrence', type=bool, default=True, help='associate node types with node occurrence on the AST')
parser.add_argument('--noedgetype', type=bool, default=False, help='associate node types with node occurrence on the AST')
parser.add_argument('--noposition', type=bool, default=True, help='ignoring position node types')
parser.add_argument('--lastuse', type=bool, default=True, help='add lastuse edges from node occurrences of the same node type')
parser.add_argument('--mod', type=int, default=8, help='add lastuse edges from node occurrences of the same node type')
parser.add_argument('argv', nargs="+", help='filenames')
opt = parser.parse_args()
print(opt)

def fbsEdges(builder, edges, type):
    typed_edges = edges[type]
    fbs_edges = []
    for e in typed_edges:
        EdgeStart(builder)
        EdgeAddNode1(builder, e[0])
        EdgeAddNode2(builder, e[1])
        fbs_edges.append(EdgeEnd(builder))
    N = len(fbs_edges)
    if type == "NextToken":
        ContextEdgesStartNextTokenVector(builder, N)
    elif type == "Child":
        ContextEdgesStartChildVector(builder, N)
    elif type == "LastWrite":
        ContextEdgesStartLastWriteVector(builder, N)
    elif type == "ReturnsTo":
        ContextEdgesStartReturnsToVector(builder, N)
    elif type == "LastUse":
        ContextEdgesStartLastUseVector(builder, N)
    elif type == "LastLexicalUse":
        ContextEdgesStartLastLexicalUseVector(builder, N)
    for i in reversed(range(0, N)):
       builder.PrependUOffsetTRelative(fbs_edges[i])
    fbs_nodeTypes = builder.EndVector(N)
    return fbs_nodeTypes

def fbsContextEdges(builder, edges):
    #print(edges)
    if 'NextToken' in edges:
        nextToken = fbsEdges(builder, edges, 'NextToken')
    if 'Child' in edges:
        child = fbsEdges(builder, edges, 'Child')
    if 'LastLexicalUse' in edges:
        lastLexicalUse = fbsEdges(builder, edges, 'LastLexicalUse')
    if 'LastUse' in edges:
        lastUse = fbsEdges(builder, edges, 'LastUse')
    if 'LastWrite' in edges:
        lastWrite = fbsEdges(builder, edges, 'LastWrite')
    if 'ReturnsTo' in edges:
        returnsTo = fbsEdges(builder, edges, 'ReturnsTo')
    ContextEdgesStart(builder)
    if 'NextToken' in edges:
        ContextEdgesAddNextToken(builder, nextToken)
    if 'Child' in edges:
        ContextEdgesAddChild(builder, child)
    if 'LastLexicalUse' in edges:
        ContextEdgesAddLastLexicalUse(builder, lastLexicalUse)
    if 'LastUse' in edges:
        ContextEdgesAddLastUse(builder, lastUse)
    if 'LastWrite' in edges:
        ContextEdgesAddLastWrite(builder, lastWrite)
    if 'ReturnsTo' in edges:
         ContextEdgesAddReturnsTo(builder, returnsTo)
    return ContextEdgesEnd(builder)

def fbsNodeType(builder, key, value):
    fbs_key = int(key)
    fbs_value = builder.CreateString(value)
    NodeTypeStart(builder)
    NodeTypeAddNode(builder, fbs_key)
    NodeTypeAddType(builder, fbs_value)
    return NodeTypeEnd(builder)

def fbsNodeTypes(builder, node_types):
    nodeTypes = []
    for k in node_types.keys():
        nodeTypes.append(fbsNodeType(builder, k, node_types[k]))
    N = len(nodeTypes)
    ContextGraphStartNodeTypeVector(builder, N)
    for i in reversed(range(0, N)):
       builder.PrependUOffsetTRelative(nodeTypes[i])
    fbs_nodeTypes = builder.EndVector(N)
    return fbs_nodeTypes

def fbsNodeLabel(builder, key, value):
    fbs_key = int(key)
    fbs_value = builder.CreateString(value)
    NodeLabelStart(builder)
    NodeLabelAddNode(builder, fbs_key)
    NodeLabelAddLabel(builder, fbs_value)
    return NodeLabelEnd(builder)

def fbsNodeLabels(builder, node_labels):
    nodeLabels = []
    for k in node_labels.keys():
        nodeLabels.append(fbsNodeLabel(builder, k, node_labels[k]))
    N = len(nodeLabels)
    ContextGraphStartNodeLabelVector(builder, N)
    for i in reversed(range(0, N)):
       builder.PrependUOffsetTRelative(nodeLabels[i])
    fbs_nodeLabels = builder.EndVector(N)
    return fbs_nodeLabels

def fbsGraph(builder, graph):
    fbs_edges = fbsContextEdges(builder, graph["Edges"])
    fbs_nodeLabels = fbsNodeLabels(builder, graph["NodeLabels"])
    fbs_nodeTypes = fbsNodeTypes(builder, graph["NodeTypes"])

    ContextGraphStart(builder)
    ContextGraphAddEdges(builder, fbs_edges)
    ContextGraphAddNodeLabel(builder, fbs_nodeLabels)
    ContextGraphAddNodeType(builder, fbs_nodeTypes)
    fbs_graph = ContextGraphEnd(builder)
    return fbs_graph

def fbsSymbolCandidate(builder, symbolCandidate):
    symbolName = builder.CreateString(symbolCandidate['SymbolName'])
    SymbolCandidateStart(builder)
    SymbolCandidateAddSymbolDummyNode(builder, symbolCandidate["SymbolDummyNode"])
    SymbolCandidateAddSymbolName(builder, symbolName)
    SymbolCandidateAddIsCorrect(builder, symbolCandidate["IsCorrect"])
    symbolCandidates = SymbolCandidateEnd(builder)
    return symbolCandidates

def fbsSymbolCandidates(builder, symbolCandidates):
    candidates = []
    for s in symbolCandidates:
        candidates.append(fbsSymbolCandidate(builder, s))
    N = len(candidates)
    UnitStartSymbolCandidateVector(builder, N)
    for i in reversed(range(0, N)):
       builder.PrependUOffsetTRelative(candidates[i])
    fbs_candidates = builder.EndVector(N)
    return fbs_candidates

def fbsGatedGraph(builder, data):
    units = []
    for g in tqdm(data):
        fbs_filename = builder.CreateString(g['filename'])
        fbs_slotTokenIdx = g['slotTokenIdx']
        fbs_SlotDummyNode = g['SlotDummyNode']
        fbs_Graph = fbsGraph(builder, g['ContextGraph'])
        fbs_SymbolCandidate = fbsSymbolCandidates(builder, g['SymbolCandidates'])
        UnitStart(builder)
        UnitAddFilename(builder, fbs_filename)
        UnitAddSlotTokenIdx(builder, fbs_slotTokenIdx)
        UnitAddGraph(builder, fbs_Graph)
        UnitAddSlotDummyNode(builder, fbs_SlotDummyNode)
        UnitAddSymbolCandidate(builder, fbs_SymbolCandidate)
        unit = UnitEnd(builder)
        units.append(unit)
    N = len(units)
    GraphStartUnitVector(builder, N)
    for i in tqdm(reversed(range(0, N))):
        builder.PrependUOffsetTRelative(units[i])
    fbs_unit = builder.EndVector(N)
    GraphStart(builder)
    GraphAddUnit(builder, fbs_unit)
    graph = GraphEnd(builder)
    return graph

def jdefault(o):
    if o is None:
        return ' '
    if isinstance(o, set):
        return list(o)
    elif isinstance(o, Graph):
        obj = []
        for i in range(0, o.UnitLength()):
            obj.append(jdefault(o.Unit(i)))
        return obj
    elif isinstance(o, Unit):
        obj = {}
        obj['filename'] = o.Filename()
        obj['slotTokenIdx'] = o.SlotTokenIdx()
        obj['ContextGraph'] = o.Graph()
        obj['SlotDummyNode'] = o.SlotDummyNode()
        vec = []
        for i in range(0, o.SymbolCandidateLength()):
            vec.append(jdefault(o.SymbolCandidate(i)))
        obj['SymbolCandidates'] = vec
        return obj
    elif isinstance(o, SymbolCandidate):
        obj = {}
        obj['SymbolDummyNode'] = o.SymbolDummyNode()
        obj['SymbolName'] = o.SymbolName()
        obj['IsCorrect'] = o.IsCorrect()
        return obj
    elif isinstance(o, ContextGraph):
        obj = {}
        obj['Edges'] = o.Edges()
        array = {}
        for i in range(0, o.NodeLabelLength()):
            nl = o.NodeLabel(i)
            array[nl.Node()] = nl.Label()
        obj['NodeLabels'] = array
        array = {}
        for i in range(0, o.NodeTypeLength()):
            nl = o.NodeType(i)
            array[nl.Node()] = nl.Type()
        obj['NodeTypes'] = array
        return obj
    elif isinstance(o, ContextEdges):
        obj = {}
        vec = []
        for i in range(0, o.NextTokenLength()):
            vec.append(jdefault(o.NextToken(i)))
        obj['NextToken'] = vec
        vec = []
        for i in range(0, o.ChildLength()):
            vec.append(jdefault(o.Child(i)))
        obj['Child'] = vec
        vec = []
        for i in range(0, o.LastLexicalUseLength()):
            vec.append(jdefault(o.LastLexicalUse(i)))
        obj['LastLexicalUse'] = vec
        vec = []
        for i in range(0, o.LastUseLength()):
            vec.append(jdefault(o.LastUse(i)))
        obj['LastUse'] = vec
        vec = []
        for i in range(0, o.LastWriteLength()):
            vec.append(jdefault(o.LastWrite(i)))
        obj['LastWrite'] = vec
        vec = []
        for i in range(0, o.ReturnsToLength()):
            vec.append(jdefault(o.ReturnsTo(i)))
        obj['ReturnsTo'] = vec
        return obj
    elif isinstance(o, Edge):
        obj = [o.Node1(), o.Node2()]
        return obj
    elif isinstance(o, bytes):
        return str(o)
    elif isinstance(o, str):
        return o
    return o.__dict__

def ggnn2txt(graph, train, test):
    if opt.maps:
        maps = {}
    algorithms = []
    node2type = True
    for i in range(0, graph.UnitLength()):
        if (i % 3 != 0 and train != test):
            out = train
        else:
            out = test
        unit = graph.Unit(i)
        p = unit.Filename()
        # print("====%d %s %d" % (i, p, i % 3 != 0))
        t = os.path.dirname(p);
        t = os.path.dirname(t);
        if t in algorithms:
            i = algorithms.index(t)
        else:
            i = len(algorithms)
            algorithms.append(t)
        if opt.maps and not opt.localmaps:
            input_basename, input_extension = os.path.splitext(p)
            maps_filename = "maps%s.pkl" % input_extension.decode('ASCII')
            if os.path.exists(maps_filename):
              with open(maps_filename, 'rb') as f:
                 maps = pickle.load(f)
        g = unit.Graph()
        edges = g.Edges()
        array = {}
        NT = g.NodeTypeLength()
        dict = {}
        if opt.occurrence:
            occurrence = {}
        if not opt.dup:
            uniq_edges = {}
        if opt.lastuse:
            lastindex = {}
            lastuses = {}
            for j in range(0, g.NodeLabelLength()):
                nl = g.NodeLabel(j)
                t = nl.Label()
                if t != b'' and t != b'int':
                   if t in lastindex.keys():
                      lastuses[str(j+1)] = lastindex[t]
                   lastindex[t] = str(j + 1)
        for j in range(0, g.NodeTypeLength()):
            nl = g.NodeType(j)
            t = str(nl.Type().decode('ASCII')) 
            if not opt.occurrence:
               if t != 'POSITION' and t != 'COMMENT' and t != '271' and t != '6':
                  dict[str(j+1)] = t
                  if opt.maps:
                      if not t in maps:
                         maps[t] = str(1 + len(maps))
               else:
                  dict[str(j+1)] = 0
            else:
               if t != 'POSITION' and t != 'COMMENT' and t != '271' and t != '6':
                  if not t in occurrence.keys():
                      occurrence[t] = 1 
                  else:
                      occurrence[t] = occurrence[t] + 1
                  to = "%s:%d" % (t, occurrence[t] % opt.mod)
                  dict[str(j+1)] = to
                  t = to
                  if opt.maps:
                     if not t in maps:
                        maps[t] = str(1 + len(maps))
               else:
                  dict[str(j+1)] = 0
        for edgetype in range(1, 6):
            if edgetype == 1:
                n = edges.ChildLength()
            elif edgetype == 2:
                n = edges.NextTokenLength()
            elif edgetype == 3:
                n = edges.LastLexicalUseLength()
            elif edgetype == 4:
                n = edges.LastUseLength()
            elif edgetype == 5:
                n = edges.LastWriteLength()
            elif edgetype == 6:
                n = edges.ReturnsToLength()
            for j in range(0, n):
                if edgetype == 1:
                    e = edges.Child(j)
                elif edgetype == 2:
                    e = edges.NextToken(j)
                elif edgetype == 3:
                    e = edges.LastLexicalUse(j)
                elif edgetype == 4:
                    e = edges.LastUse(j)
                elif edgetype == 5:
                    e = edges.LastWrite(j)
                elif edgetype == 6:
                    e = edges.ReturnsTo(j)
                if dict[str(e.Node1())] != 0 and dict[str(e.Node2())] != 0:
                    if opt.maps:
                        s1 = maps[dict[str(e.Node1())]]
                    else:
                        s1 = dict[str(e.Node1())]
                    if opt.noedgetype:
                        s2 = '1'
                    else:
                        s2 = str(edgetype)
                    if opt.maps:
                        s3 = maps[dict[str(e.Node2())]]
                    else:
                        s3 = dict[str(e.Node2())]
                    if s2 == '1' or not opt.syntaxonly:
                       e1="%s %s %s\n" % (s1, s2, s3)
                       if opt.dup:
                          out.write(e1)
                       else:
                          uniq_edges[e1] = 1
                    if opt.bidirect and s2 != "1" and not opt.syntaxonly:
                        e2="%s %s %s\n" % (s3, s2, s1)
                        if opt.dup:
                           out.write(e2)
                        else:
                           uniq_edges[e2] = 1
                    if opt.mixing and s2 != "1" and not opt.syntaxonly:
                        e3="%s %s %s\n" % (s1, '1', s3)
                        if opt.dup:
                           out.write(e3)
                        else:
                           uniq_edges[e3] = 1
                    if opt.occurrence and dict[str(e.Node1())] != 0 and dict[str(e.Node2())] != 0:
                        if opt.maps:
                            s4 = maps[dict[str(e.Node1())]]
                        else:
                            s4 = dict[str(e.Node1())]
                        if opt.noedgetype:
                            e4="%s %s %s\n" % (s1, '1', s4)
                        else:
                            e4="%s %s %s\n" % (s1, '7', s4)
                        if opt.dup:
                           out.write(e4)
                        else:
                           uniq_edges[e4] = 1
                        if opt.maps:
                            s5 = maps[dict[str(e.Node2())]]
                        else:
                            s5 = dict[str(e.Node2())]
                        if opt.noedgetype:
                            e5="%s %s %s\n" % (s1, '1', s4)
                        else:
                            e5="%s %s %s\n" % (s3, '7', s5)
                        if opt.dup:
                           out.write(e5)
                        else:
                           uniq_edges[e5] = 1
        if opt.lastuse and opt.maps:
           for k, v in lastuses.items():
               t1 = dict[k]
               t2 = dict[v]
               if t1 != '0' and t2 != '0' and t1 != 0 and t2 != 0:
                  e6 = "%s 3 %s\n" % (maps[t2], maps[t1])
                  if opt.dup:
                     out.write(e6)
                  else:
                     uniq_edges[e6] = 1
        if not opt.dup:
           for e in uniq_edges.keys():
               out.write(e)
        out.write("? %d %s\n\n" % (i+1, p.decode('ASCII')))
        if opt.maps and not opt.localmaps:
            # Don't assume the files in the same dataset are of the same language
            with open(maps_filename, 'wb') as f:
                pickle.dump(maps, f, pickle.HIGHEST_PROTOCOL)

def get_descendants(child, node):
    descendants = [node]
    for i in range(0, len(child)):
        edge = child[i]
        if edge[0] == int(node):
            descendants.extend(get_descendants(child, str(edge[1])))
    return descendants

def get_subgraph(graph, subnodes):
    idx = {}
    for i in range(0, len(subnodes)):
        idx[subnodes[i]] = i + 1
    subgraph = {}
    edges = graph["Edges"]
    subedges = {}
    child = edges["Child"]
    subchild = []
    nexttoken = edges["NextToken"]
    subnexttoken = []
    lastlexicaluse = edges["LastLexicalUse"]
    sublastlexicaluse = []
    lastuse = edges["LastUse"]
    sublastuse = []
    lastwrite = edges["LastWrite"]
    sublastwrite = []
    returnsto = edges["ReturnsTo"]
    subreturnsto = []
    nodetypes = graph["NodeTypes"]
    subnodetypes = {}
    nodelabels = graph["NodeLabels"]
    subnodelabels = {}
    for i in range(0, len(child)):
        edge = child[i]
        if str(edge[0]) in subnodes and str(edge[1]) in subnodes:
            subedge = []
            subedge.append(idx[str(edge[0])])
            subedge.append(idx[str(edge[1])])
            subchild.append(subedge)
    for i in range(0, len(nexttoken)):
        edge = nexttoken[i]
        if str(edge[0]) in subnodes and str(edge[1]) in subnodes:
            subedge = []
            subedge.append(idx[str(edge[0])])
            subedge.append(idx[str(edge[1])])
            subnexttoken.append(subedge)
    for i in range(0, len(lastlexicaluse)):
        edge = lastlexicaluse[i]
        if str(edge[0]) in subnodes and str(edge[1]) in subnodes:
            subedge = []
            subedge.append(idx[str(edge[0])])
            subedge.append(idx[str(edge[1])])
            sublastlexicaluse.append(subedge)
    for i in range(0, len(lastuse)):
        edge = lastuse[i]
        if str(edge[0]) in subnodes and str(edge[1]) in subnodes:
            subedge = []
            subedge.append(idx[str(edge[0])])
            subedge.append(idx[str(edge[1])])
            sublastuse.append(subedge)
    for i in range(0, len(lastwrite)):
        edge = lastwrite[i]
        if str(edge[0]) in subnodes and str(edge[1]) in subnodes:
            subedge = []
            subedge.append(idx[str(edge[0])])
            subedge.append(idx[str(edge[1])])
            sublastwrite.append(subedge)
    for i in range(0, len(returnsto)):
        edge = returnsto[i]
        if str(edge[0]) in subnodes and str(edge[1]) in subnodes:
            subedge = []
            subedge.append(idx[str(edge[0])])
            subedge.append(idx[str(edge[1])])
            subreturnsto.append(subedge)
    for k, v in nodetypes.items():
        if k in subnodes:
            subnodetypes[str(idx[k])] = v
    for k, v in nodelabels.items():
        if k in subnodes:
            subnodelabels[str(idx[k])] = v
    subedges["Child"] = subchild
    subedges["NextToken"] = subnexttoken
    subedges["LastLexicalUse"] = sublastlexicaluse
    subedges["LastUse"] = sublastuse
    subedges["LastWrite"] = sublastwrite
    subedges["ReturnsTo"] = subreturnsto
    subgraph["Edges"] = subedges
    subgraph["NodeTypes"] = subnodetypes
    subgraph["NodeLabels"] = subnodelabels
    return subgraph

def get_subgraphs(filename, graph):
    data = []
    edges = graph["Edges"]
    child = edges["Child"]
    nodelabels=graph["NodeLabels"]
    for k, v in nodelabels.items():
        subnodes = get_descendants(child, k)
        #
        # Each candidate should have at least 10 nodes
        #
        if len(subnodes) > 10:
            subgraph = get_subgraph(graph, subnodes)
            subdata = {}
            input_basename, input_extension = os.path.splitext(filename)
            subdata["filename"] = '%s-%s%s' % (input_basename.decode('ASCII'), k, input_extension.decode('ASCII'))
            subdata["ContextGraph"] = subgraph
            subdata["slotTokenIdx"] = 0
            subdata["SlotDummyNode"] = 0
            subdata["SymbolCandidates"] = []
            data.append(subdata)
    return data
  
def generate_subgraphs(filename, graph, out):
    with open('/tmp/t.json', 'w') as json_out:
        json.dump(graph, json_out, default=jdefault)
        json_out.close()
    with open('/tmp/t.json', 'r') as json_in:
        graph_data = json.load(json_in)
        json_in.close()
    data = get_subgraphs(filename, graph_data)
    #json.dump(data, json_out)
    builder = flatbuffers.Builder(0)
    fbs_graph = fbsGatedGraph(builder, data)
    builder.Finish(fbs_graph)
    with open('/tmp/tt.fbs', 'wb') as fbs_out:
        buf = builder.Output()
        fbs_out.write(buf)
        fbs_out.close()
    with open('/tmp/tt.fbs', 'rb') as fbs_in:
        buf = fbs_in.read()
        buf = bytearray(buf)
        fbs_graph = Graph.GetRootAsGraph(buf, 0)
        fbs_in.close()
    ggnn2txt(fbs_graph, out, out)

#
# generate a graph for the AST of each node
#
def ggnn2txt_test(graph, test):
    if opt.maps and not opt.localmaps:
        maps = {}
        if os.path.exists('maps.pkl'):
            with open('maps.pkl', 'rb') as f:
                 maps = pickle.load(f)
    algorithms = []
    node2type = True
    for i in trange(0, graph.UnitLength()):
        out = test
        unit = graph.Unit(i)
        p = unit.Filename()
        t = os.path.dirname(p);
        t = os.path.dirname(t);
        if t in algorithms:
            i = algorithms.index(t)
        else:
            i = len(algorithms)
            algorithms.append(t)
        g = unit.Graph()
        edges = g.Edges()
        array = {}
        NT = g.NodeTypeLength()
        dict = {}
        for j in range(0, g.NodeTypeLength()):
            nl = g.NodeType(j)
            dict[str(j+1)] = str(nl.Type())
            if opt.maps:
                if not str(nl.Type()) in maps:
                    maps[str(nl.Type())] = str(1 + len(maps))
        generate_subgraphs(p, g, out)
    if not opt.localmaps:
        with open('maps.pkl', 'wb') as f:
            pickle.dump(maps, f, pickle.HIGHEST_PROTOCOL)

if __name__ == "__main__":
    try:
        if len(opt.argv) > 0:
            input_basename, input_extension = os.path.splitext(opt.argv[0])
            start = time.time()
            if input_extension == ".json":
                with open(opt.argv[0], 'r') as f:
                    data = json.load(f)
            elif input_extension == ".pkl" or input_extension == ".pickle":
                with open(opt.argv[0], 'rb') as f:
                    data = pickle.load(f)
            elif input_extension == ".fbs":
                with open(opt.argv[0], 'rb') as f:
                    buf = f.read()
                    buf = bytearray(buf)
                    data = Graph.GetRootAsGraph(buf, 0)
            end = time.time()
            print(end - start)
        else:
            print("Please provide an input file")
            sys.exit(0)
        if len(opt.argv) > 1:
            output_basename, output_extension = os.path.splitext(opt.argv[1])
            start = time.time()
            if output_extension == ".pkl" or output_extension == ".pickle": 
                with open(opt.argv[1], 'wb') as out:
                    pickle.dump(data, out, pickle.HIGHEST_PROTOCOL)
            elif output_extension == ".json": 
                with open(opt.argv[1], 'w') as out:
                    json.dump(data, out, default=jdefault)
            elif output_extension == ".txt" and len(opt.argv) > 2: 
                with open(opt.argv[1], 'w') as train:
                  with open(opt.argv[2], 'w') as test:
                    ggnn2txt(data, train, test)
            elif output_extension == ".txt": 
                with open(opt.argv[1], 'w') as test:
                    ggnn2txt_test(data, test)
            elif output_extension == ".fbs":
                with open(opt.argv[1], 'wb') as out:
                    builder = flatbuffers.Builder(0)
                    graph = fbsGatedGraph(builder, data)
                    builder.Finish(graph)
                    buf = builder.Output()
                    out.write(buf)
                    out.close()
            end = time.time()
            print(end - start)
    except:
        typ, value, tb = sys.exc_info()
        traceback.print_exc()
        pdb.post_mortem(tb)
