package graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Breadth first Search O(V+E)
 * Created by dwaipaya on 1/29/16.
 */
public class BFS extends GraphAlgo{
    BFS(int nodes){
        super(nodes);
    }
    public void bfs(int startNode){

        boolean[] visited = new boolean[graph.nodes];

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(startNode);
        visited[startNode]=true;
        while(!q.isEmpty()){
            int nodeX = q.poll();
            System.out.print(nodeX+"-->");
            if(graph.arr[nodeX]!=null) {
                for (Edge neighbour : graph.arr[nodeX]) {

                    if (!visited[neighbour.dest]) {
                        visited[neighbour.dest] = true;
                        q.add(neighbour.dest);
                    }

                }
            }
        }
    }
    public static void main(String args[]) {
        BFS bfs = new BFS(5);
        bfs.bfs(0);
    }
}
