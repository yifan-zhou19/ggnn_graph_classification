package data_structures.linkedlist;

import java.util.LinkedList;

public class JavaLinkedList {
	
	// Java Linked List is a Doubly Linked List

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>(); 
		
		ll.add("NameOne");
		ll.add("NameTwo");
		ll.add("NameThree");
		
		System.out.println(ll);
		
		ll.addFirst("First_Node");
		
		ll.addLast("Last_Node");
		
		System.out.println(ll);
		
		System.out.println(ll.indexOf("AddingFirst")); // 0
		
		System.out.println(ll.getFirst()); // First_Node
		
		System.out.println(ll.getLast()); // Last_Node
		
		for(String s : ll) { // Part of Collection framework, Iterable
			System.out.println(s);
		}
		
		ll.removeLast();
		
		ll.removeFirst();
		
		System.out.println(ll);
	}

}
