package com.automation.naveenAutomation.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LIST_LinkedList {

	// Linked List
	
	 /* Linked List Methods
	  * add()
	  * addAll()
	  * set()
	  * get()
	  * removeFirst()
	  * removeLast()
	  * addFirst()
	  * addLast()
	  * 
	  * 
	  * */
	
	public static void main(String[] args) {
		
		
		LinkedList<String> li = new LinkedList<String>();
		li.add("Test");
		li.add("Selenium");
		li.add("QTP");
		li.add("RFT");
		System.out.println("********************************");
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		System.out.println("********************************");
		for(String lit:li) {
			
			System.out.println(lit);
		}
		System.out.println("********************************");
		
		Iterator<String> itr = li.iterator();
		while(itr.hasNext()) {
			String all = itr.next();
			System.out.println(all);
		}
		
		System.out.println("********************************");
		
		int num=0;
		while(li.size()>num) {
			System.out.println(li.get(num));
			num++;
		}
		
		System.out.println("********************************");
		System.out.println(li);
		li.addFirst("Praneeth");
		li.addLast("Kumar");
		System.out.println(li);
		System.out.println(li.get(1));
		System.out.println(li.set(0, "MB"));
		System.out.println(li);
		System.out.println(li.removeFirst());
		System.out.println(li.removeLast());
		System.out.println(li);
		li.remove(2);
		System.out.println(li);
	}
	
}
