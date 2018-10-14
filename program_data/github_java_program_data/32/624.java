
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Radu Toma
 */
public class kruskal {

    ArrayList<ArrayList<Integer>> seturi;

    //muchiile sortate descrescator in functie de costuri 
    ArrayList<edge> sorted_edges;
    //lista muchiilor pe care o va contine arborele minim de acoperire
    ArrayList<HashMap<Integer, Long>> acoperire;
    int indexi_seturi[];//indexii multimilor in care se regaseste fiecare nod 
    long cost = 0;

    public kruskal(ArrayList<edge> edges, int nr_nodes) {

        sorted_edges = (ArrayList<edge>) edges.clone();
        indexi_seturi = new int[nr_nodes];
        acoperire = new ArrayList<>();
        seturi = new ArrayList<>();
        //multimile in care se regasesc nodurile

        //initializare multimi
        for (int i = 0; i < nr_nodes; i++) {

            HashMap<Integer, Long> nou2 = new HashMap<>();
            acoperire.add(nou2);

            ArrayList<Integer> nou = new ArrayList<>();
            nou.add(i);
            seturi.add(nou);
            indexi_seturi[i] = i;
        }

    }

    public void sort_edges() {
        Collections.sort(sorted_edges, new Comparator<edge>() {
            @Override
            public int compare(edge o1, edge o2) {
                if (o1.getCost() - o2.getCost() < 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });

    }

    public void union(int index1, int index2) {

        //adaug elementele multimii cu mai putine elemente in multimea cu mai multe elemente
        if (seturi.get(index1).size() > seturi.get(index2).size()) {
            for (Integer e : seturi.get(index2)) {
                indexi_seturi[e] = index1;
            }
            
            seturi.get(index1).addAll(seturi.get(index2));

        } else {

            for (Integer e : seturi.get(index1)) {
                indexi_seturi[e] = index2;
            }

            seturi.get(index2).addAll(seturi.get(index1));

        }

    }

    public void doKruskal() {
        sort_edges();
        for (edge e : sorted_edges) {
            int index1 = indexi_seturi[e.getNod1()];
            int index2 = indexi_seturi[e.getNod2()];
            
            if (index1 != index2) {//daca nu s-ar face ciclu prin reuniune
                union(index1, index2);
                acoperire.get(e.getNod1()).put(e.getNod2(), e.getCost());
                acoperire.get(e.getNod2()).put(e.getNod1(), e.getCost());
                cost += e.getCost();
            }

        }
    }

}
