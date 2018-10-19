#!/usr/bin/env python3
import os
import json
import pickle
import time
import sys
import flatbuffers
from tqdm import tqdm
sys.path.insert(0, '_ggnn')
sys.path.insert(0, '_ggnn/_Graph')
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


def fbsEdges(builder, edges, type):
    typed_edges = edges[type]
    fbs_edges = []
    for e in typed_edges:
        EdgeStart(builder)
        EdgeAddNode1(builder, e[0])
        EdgeAddNode1(builder, e[1])
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

if __name__ == "__main__":
    try:
        if len(sys.argv) > 1:
            input_basename, input_extension = os.path.splitext(sys.argv[1])
            start = time.time()
            if input_extension == ".json":
                with open(sys.argv[1], 'r') as f:
                    data = json.load(f)
            elif input_extension == ".pkl" or input_extension == ".pickle":
                with open(sys.argv[1], 'rb') as f:
                    data = pickle.load(f)
            elif input_extension == ".fbs":
                with open(sys.argv[1], 'rb') as f:
                    buf = f.read()
                    buf = bytearray(buf)
                    data = Graph.GetRootAsGraph(buf, 0)
            end = time.time()
            print(end - start)
        else:
            print("Please provide an input file")
            sys.exit(0)
        if len(sys.argv) > 2:
            output_basename, output_extension = os.path.splitext(sys.argv[2])
            start = time.time()
            if output_extension == ".pkl" or output_extension == ".pickle": 
                with open(sys.argv[2], 'wb') as out:
                    pickle.dump(data, out, 2)
            elif output_extension == ".json": 
                with open(sys.argv[2], 'w') as out:
                    json.dump(data, out, default=jdefault)
            elif output_extension == ".fbs":
                with open(sys.argv[2], 'wb') as out:
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
