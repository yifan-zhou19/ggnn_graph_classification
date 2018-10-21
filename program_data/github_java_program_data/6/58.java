package graph;

import java.util.*;

public class BellmanFordJava {

    Set<Vertex> graph;

    static class Vertex implements Comparable<Vertex> {
        String id;
        int distance; // current shortest path
        Map<Vertex, Integer> adjacents; // Map<adjacent vertex, distance to this adjacent vertex>
        Vertex previous;

        public Vertex(String id) {
            this.id = id;
            this.distance = Integer.MAX_VALUE;
            this.previous = null;
            this.adjacents = new HashMap<Vertex, Integer>();
        }

        public void addAdjacent(Vertex adjacent, Integer distance) {
            if (this.adjacents == null) this.adjacents = new HashMap<Vertex, Integer>();
            // puting the distance as a value on the map of adjacent vertices
            this.adjacents.put(adjacent, distance);
        }

        @Override
        public String toString() {
            StringBuffer adj = new StringBuffer();
            for (Map.Entry<Vertex, Integer> v : adjacents.entrySet()) {
                adj.append(v.getKey().id + "-");
            }
            return "Vertex{" +
                    "id='" + id + '\'' +
                    ", distance=" + distance +
                    ", adjacents=" + (adjacents != null ? adj.toString() : "null") +
                    // ", previous=" + (previous != null ? "null" : previous) +
                    '}';
        }

        /**
         * comparator to use PriorityQueue and keep the distance of the vertex on the first position of the queue.
         *
         * @param vertex
         * @return
         */
        @Override
        public int compareTo(Vertex vertex) {
            if (this.distance < vertex.distance) return -1;
            if (this.distance > vertex.distance) return 1;
            return 0;
        }
    }

    public BellmanFordJava(Set<Vertex> graph) {
        this.graph = graph;
    }

    public void printGraph() {
        for (Vertex v : this.graph) {
            System.out.println(v);
        }
    }

    public void findShortestPath(Vertex source) {
        source.distance = 0;

        for (int i = 0; i < this.graph.size() - 1; i++) {

            // this data structure will contain only those nodes which are not in the known region.
            // So it will contain initially node 'Source' and all the nodes, but then after we make the first
            // iteration we will extract node 'Source' from this data structure Queue
            PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
            queue.add(source);

            while (!queue.isEmpty()) {
                Vertex u = queue.remove();
                for (Map.Entry<Vertex, Integer> v : u.adjacents.entrySet()) {
                    // check if the distance is infinite or
                    // greater than distance of the current Vertex + the current adjacent in the loop
                    if (v.getKey().distance > (u.distance + v.getValue())) {
                        // update the distance value until the Vertex V.
                        // v.setValue(u.distance + v.getValue());
                        v.getKey().distance = u.distance + v.getValue();

                        v.getKey().previous = u;

                        // change the priority of the vertex V
                        if (queue.contains(v.getKey())) queue.remove(v.getKey());
                        queue.add(v.getKey());
                        graph.add(v.getKey());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Vertex d = new Vertex("d");
        Vertex c = new Vertex("c");
        Vertex b = new Vertex("b");
        Vertex a = new Vertex("a");
        Vertex s = new Vertex("s");

        s.addAdjacent(a, 4);
        s.addAdjacent(b, 3);
        a.addAdjacent(b, -2);
        a.addAdjacent(c, 4);
        b.addAdjacent(c, -3);
        b.addAdjacent(d, 1);
        c.addAdjacent(d, 2);

        Set<Vertex> graph = new HashSet<Vertex>();
        graph.add(s);
        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);

        BellmanFordJava bfa = new BellmanFordJava(graph);
        bfa.printGraph();
        System.out.println("Bellman-Ford algorithm path: ");
        bfa.findShortestPath(s);
        bfa.printGraph();
    }
}
