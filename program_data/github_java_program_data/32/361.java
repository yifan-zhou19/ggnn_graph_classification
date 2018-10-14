package algorithms.graph.kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kruskal {


    public void spanningTree(List<Vertex> vertexList, List<Edge> edgeList) {
        DisjointSet disjointSet = new DisjointSet(vertexList);
        List<Edge> mst = new ArrayList<>();
        System.out.println("edges: "  + edgeList);
        Collections.sort(edgeList);

        for (Edge edge : edgeList) {
            Vertex startVertex = edge.getStartVertex();

            Vertex targetVertex = edge.getTargetVertex();

            //they belong to a differents sets
            System.out.println("start: " + startVertex.getNode());
            System.out.println("targer: " + targetVertex.getNode());

            if (disjointSet.find(startVertex.getNode()) != disjointSet.find(targetVertex.getNode())) {
                mst.add(edge);
                disjointSet.union(startVertex.getNode(), targetVertex.getNode());
            }
        }

        for (Edge edge : mst) {
            System.out.println(edge.getStartVertex() + " - " + edge.getTargetVertex() + " -- ");
        }

        System.out.println("END");
    }
}
