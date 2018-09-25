package uk.co.kyleharrison.datastructures.linkedlist;

import java.util.*;

public class LinkedListDemo {

   public static void main(String args[]) {
      // create a linked list
      LinkedList  linkedList = new LinkedList();
      // add elements to the linked list
      linkedList.add("F");
      linkedList.add("B");
      linkedList.add("D");
      linkedList.add("E");
      linkedList.add("C");
      linkedList.addLast("Z");
      linkedList.addFirst("A");
      linkedList.add(1, "A2");
      System.out.println("Original contents of linkedList: " + linkedList);

      // remove elements from the linked list
      linkedList.remove("F");
      linkedList.remove(2);
      System.out.println("Contents of linkedList after deletion: "
       + linkedList);
      
      // remove first and last elements
      linkedList.removeFirst();
      linkedList.removeLast();
      System.out.println("linkedList after deleting first and last: "
       + linkedList);

      // get and set a value
      Object val = linkedList.get(2);
      linkedList.set(2, (String) val + " Changed");
      System.out.println("linkedList after change: " + linkedList);
   }
}