package com.Feb;

import java.util.*;

public class BellmanFord {
	public static void bell(Graph g, Vertex vs) {
		ArrayList<Vertex> vertexs = g.vertex;
		ArrayList<Edge> edges = g.edges;
		vs.value = 0;
		Edge e;
		Vertex v1, v2;
		for (int i = 0; i < vertexs.size(); i++) {
			for (int j = 0; j < edges.size(); j++) {
				e = edges.get(j);
				v1 = e.from;
				v2 = e.to;
				if (v1.value + e.cost < v2.value) {
					v2.value = v1.value + e.cost;
					v2.prev = v1;
				}
			}
			System.out.println("Number "+i);
			for (int k = 0; k < vertexs.size(); k++) {

				System.out.print(vertexs.get(k).label + " " + vertexs.get(k).value
						);

				System.out.println();

			}
		}
		for (int i = 0; i < vertexs.size(); i++) {
			for (int j = 0; j < edges.size(); j++) {
				e = edges.get(j);
				v1 = e.from;
				v2 = e.to;
				if (v1.value + e.cost < v2.value) {
					System.err.println("error");
				}
			}}
	}

	public static void init_1() {
		Vertex s = new Vertex('S');
		Vertex a = new Vertex('A');
		Vertex b = new Vertex('B');
		Vertex c = new Vertex('C');
		Vertex d = new Vertex('D');
		Vertex e = new Vertex('E');
		Vertex f = new Vertex('F');
		Vertex g = new Vertex('G');
		Edge e1 = new Edge(s, a, 10);
		Edge e2 = new Edge(s, g, 8);
		Edge e3 = new Edge(a, e, 2);
		Edge e4 = new Edge(b, c, 1);
		Edge e10 = new Edge(b, a, 1);
		Edge e5 = new Edge(c, d, 3);
		Edge e6 = new Edge(d, e, -1);
		Edge e7 = new Edge(e, b, -2);
		Edge e8 = new Edge(f, e, -1);
		Edge e9 = new Edge(g, f, 1);
		Edge e11 = new Edge(f, a, -4);
		ArrayList<Vertex> v = new ArrayList<Vertex>();
		v.add(s);
		v.add(a);
		v.add(b);
		v.add(c);
		v.add(d);
		v.add(e);
		v.add(f);
		v.add(g);
		ArrayList<Edge> edges = new ArrayList<Edge>();
		edges.add(e1);
		edges.add(e2);
		edges.add(e3);
		edges.add(e4);
		edges.add(e5);
		edges.add(e6);
		edges.add(e7);
		edges.add(e8);
		edges.add(e9);
		edges.add(e10);
		edges.add(e11);
		Graph graph = new Graph(v, edges);
		bell(graph, s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertex v1 = new Vertex(1);
		Vertex v2 = new Vertex(2);
		Vertex v3 = new Vertex(3);
		Vertex v4 = new Vertex(4);
		Vertex v5 = new Vertex(5);
		Vertex v6 = new Vertex(6);
		Vertex v7 = new Vertex(7);
		Vertex v8 = new Vertex(8);

		Edge e1 = new Edge(v1, v2, -2);
		Edge e2 = new Edge(v1, v5, -2);
		Edge e3 = new Edge(v1, v6, -3);
		Edge e4 = new Edge(v1, v8, -1);
		//
		Edge e5 = new Edge(v2, v6, 7);
		Edge e6 = new Edge(v2, v8, 4);
		Edge e7 = new Edge(v3, v2, 2);
		Edge e8 = new Edge(v3, v4, 5);
		//
		Edge e9 = new Edge(v3, v7, 9);
		Edge e10 = new Edge(v4, v7, 4);
		//
		Edge e11 = new Edge(v5, v7, 5);
		Edge e12 = new Edge(v7, v8, -1);
		Edge e13 = new Edge(v8, v2, 2);
		Edge e14 = new Edge(v8, v5, 8);
		//
		Edge e15 = new Edge(v8, v6, 3);
		Edge e16 = new Edge(v8, v7, 7);
		ArrayList<Vertex> v = new ArrayList<Vertex>();
		v.add(v1);
		v.add(v2);
		v.add(v3);
		v.add(v4);
		v.add(v5);
		v.add(v6);
		v.add(v7);
		v.add(v8);
		ArrayList<Edge> e = new ArrayList<Edge>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		e.add(e7);
		e.add(e8);
		e.add(e9);
		e.add(e10);
		e.add(e11);
		e.add(e12);
		e.add(e13);
		e.add(e14);
		e.add(e15);
		e.add(e16);
		Graph g = new Graph(v, e);
		bell(g, v3);
		//init_1();
		Math.random();
	}

}
