package com.san.java.basics.collections;

import java.util.*;

public class List_LinkedList {

    public static void main(String[] args) {
        //LinkedList is indexed
        //Duplicates allowed
        //Null allowed
        //We can store any type of elements
        //Stored in insertion order
        //We can retrieve LinkedList elements using       Index/foreach/Iterator/ListIterator/Enumeration

        LinkedList llt = new LinkedList();
        llt.add(78);
        llt.add(78);
        llt.add(34.5);
        llt.add(null);
        llt.add(null);
        llt.add("Santu");
        llt.add('A');
//        We can insert an elements in between
//        llt.add(4, 67);   at 4th index 67 is added, rest all moves right


        //Retrieve LinkedList elements using its index
        System.out.println("Retrieve LinkedList elements using its Index...");
        for (int i = 0; i < llt.size(); i++) {
            System.out.print(llt.get(i) + "\t");
        }
        System.out.println("");

        //Retrieve LinkedList elements using for each loop
        System.out.println("Retrieve LinkedList elements using for-each loop");
        for (Object obj : llt) {
            System.out.print(obj + "\t");
        }
        System.out.println("");

        //Retrieve LinkedList Elements using Iterator
        System.out.println("Retrieve LinkedList elements using iterator");
        Iterator itr = llt.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + "\t");
        }
        System.out.println("");

        //Retrieve LinkedList elements using ListIterator
        System.out.println("Retrieve LinkedList elements using ListIterator...");
        ListIterator lit = llt.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + "\t");
        }
        System.out.println("");

//        Retrieve LinkedList elements using Enumeration
        System.out.println("Retrieve LinkedList elements using Enumeration...");
        Enumeration ea = Collections.enumeration(llt);
        while (ea.hasMoreElements()) {
            System.out.print(ea.nextElement() + "\t");
        }
        System.out.println("");
    }

}
