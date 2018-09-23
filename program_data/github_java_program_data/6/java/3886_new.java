package com.Amit;

import java.util.LinkedList;

/**
 * Created by Amit on 24/11/13.
 */
public class Iterator {
    public static void main(String[] args) {

        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Item 0");
        linkedlist.add("Item 1");
        linkedlist.add("Item 2");
        linkedlist.add("Item 9");
        linkedlist.add("Item 3");
        linkedlist.add("Item 5");
        linkedlist.add("Item 354545");

        java.util.Iterator<String> iterator;
        iterator = linkedlist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }


    }
}
