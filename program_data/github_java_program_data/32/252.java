import java.util.*;
import java.io.*;
public class Kruskal {
	public static void main (String args[]) {
		SimpleGraph G;
        G = new SimpleGraph();
        GraphInput gi = new GraphInput();
        G= LoadSimpleGraph(G, "C:\\Users\\soumak\\Desktop\\a.txt");
        Comparator<Edge> comparator = new EdgeComparator();
        //initialize priority queue of edges
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>(G.numEdges(),comparator);
        Iterator i;
        Vertex v,v1,v2;
        Edge e;
        List<Edge> elist = new ArrayList<Edge>();
        
            
            for (Object e1 : G.edgeList) {
               Edge e2 = (Edge) e1;
                System.out.println("  found edge " + e2.getData());
                pq.add(e2);
            }
        
        /* Create the disjoint-set data structure */
        DisjSets d = new DisjSets(G.vertexList);

        /* Create a list of edges */
        ArrayList<Edge> tree = new ArrayList<Edge>();
        double totalWeight = 0;
        int edgeCount =0;
        int count = 0;
        System.out.println(" Minimal spanning tree: ");
        while(count<G.numEdges())

        {
        	Edge e1 = pq.poll();
        	v1 = e1.getFirstEndpoint();
        	v2 = e1.getSecondEndpoint();
        	
        	// checks if they belong to the same set
        	if(d.find(v1.getData()) != d.find(v2.getData()))
        	 // renames the root
        		{
        		d.union(v1.getData(), v2.getData());
        		
        		System.out.print("  Vertex " + v1.getName());
        		System.out.print("  ----- " + e1.getData() + "  ----- " );
        		System.out.print("  Vertex " + v2.getName());
        		System.out.println("  ");
        		totalWeight = totalWeight + (double) e1.getData();
        		edgeCount++;
        		}
        	count++;
        	
        }
        System.out.println(" Total Weight: " + totalWeight);
        
  }
	 public static SimpleGraph LoadSimpleGraph(SimpleGraph newgraph) {
	        System.out.print("Please enter the full path and file name for the input data: ");
	        String userinput;
	        userinput = KeyboardReader.readString();
	        return LoadSimpleGraph(newgraph, userinput);
	    }
	 public static SimpleGraph LoadSimpleGraph(SimpleGraph newgraph, String pathandfilename){
	        BufferedReader  inbuf = InputLib.fopen(pathandfilename);
	        System.out.println("Opened " + pathandfilename + " for input.");
	        String  line = InputLib.getLine(inbuf); // get first line
	        StringTokenizer sTok;
	        int n, linenum = 0;
	        Hashtable table = new Hashtable();
	        SimpleGraph sg = newgraph;

	        while (line != null) {
	            linenum++;
	            sTok = new StringTokenizer(line);
	            n = sTok.countTokens();
	            if (n==3) {
	                Double edgedata;
	                Vertex v1, v2;
	                String v1name, v2name;

	                v1name = sTok.nextToken();
	                v2name = sTok.nextToken();
	                edgedata = new Double(Double.parseDouble(sTok.nextToken()));
	                v1 = (Vertex) table.get(v1name);
	                if (v1 == null) {
//	                      System.out.println("New vertex " + v1name);
	                        v1 = sg.insertVertex(null, v1name);
	                        table.put(v1name, v1);
	                }
	                v2 = (Vertex) table.get(v2name);
	                if (v2 == null) {
//	                      System.out.println("New vertex " + v2name);
	                    v2 = sg.insertVertex(null, v2name);
	                    table.put(v2name, v2);
	                }
//	              System.out.println("Inserting edge (" + v1name + "," + v2name + ")" + edgedata);
	                sg.insertEdge(v1,v2,edgedata, null);
	            }
	            else {
	                System.err.println("Error:invalid number of tokens found on line " +linenum+ "!");
	                return null;
	            }
	            line = InputLib.getLine(inbuf);
	        }

	        InputLib.fclose(inbuf);
	        System.out.println("Successfully loaded "+ linenum + " lines. ");
	        return sg;
	    }

}

/*
 * Implementation of a node, to be used with the DisjointSet tree
 * structure.
 */
class Node {
  int size;      // the approximate count of nodes below this node
  int index;     // a unique index for each node in the tree
  Node parent;

  public Node(int r, int i, Node p) {
    this.size = r;
    this.index = i;
    this.parent = p;
  }
}


/*
 * implementation of the disjoint-set data structure.
 * A "union by size" is used i.e to attach a smaller tree to the
 * root of the larger tree.
 */
class DisjSets {
  private int nodeCount = 0;
  private int setCount = 0;

  ArrayList<Node> rootNodes;

  /*
   * Returns the index of the set that o is currently in, which is
    used to determine whether two elements are in the
    same set.
   */
  public int find(Object o) {
    Node current = (Node)o;

    /* iterate up to the root node */
    while (current.parent != null)
      current = current.parent;

    Node root = current;

    /*
     * path compression
     */
    current = (Node)o;
    while (current != root) {
      Node temp = current.parent;
      current.parent = root;
      current = temp;
    }

    return root.index;
  }


  /*
   * Combines the sets containing nodes i and j.
   */
  public void union(Object i, Object j) {
    int index1 = find(i);
    int index2 = find(j);

    /* Are these nodes already part of the same set? */
    if (index1 == index2) return;

    /* Get the root nodes of each set (this will run in constant time) */
    Node a = this.rootNodes.get(index1);
    Node b = this.rootNodes.get(index2);

    /* Attach the smaller tree to the root of the larger tree */
    if (a.size < b.size) {
      a.parent = b;
    } else if (a.size > b.size) {
      b.parent = a;
    } else {
      b.parent = a;
      a.size++;
    }
    
    this.setCount--;
  }


  /*
   * Takes a list of n vertices and creates n disjoint singleton sets.
   */
  public void makeSets(List<Vertex> vertices) {
    for (Vertex v : vertices)
      makeSet(v);
  }


  /*
   * Creates a singleton set containing one vertex.
   */
  public void makeSet(Vertex vertex) {
    Node n = new Node(0, rootNodes.size(), null);
    vertex.setData(n);
    this.rootNodes.add(n);
    this.setCount++;
    this.nodeCount++;
  }


  public DisjSets(List<Vertex> vertices) {
    this.rootNodes = new ArrayList<Node>(vertices.size());
    makeSets(vertices);
  }
}
