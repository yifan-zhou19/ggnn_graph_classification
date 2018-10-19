package com.automation.bhanuprathap.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LIST_LinkedList {

	public static void main(String[] args) {

             LinkedList<Object> llist = new LinkedList<>();
             
             llist.add("Test1");
             llist.add("Test2");
             llist.add("Test3");
             
             
             ListIterator<Object> itr = llist.listIterator();
             while(itr.hasNext()) {
            	 System.out.println(itr.next());
             }
             
             System.out.println("***************************");
             
             while(itr.hasPrevious()) {
            	 System.out.println(itr.previous());
            	 
             }
             
             /*System.out.println(llist.indexOf("Test2"));
             
             System.out.println(llist.indexOf("Test1"));
             
             System.out.println(llist.indexOf("Test3")); //gives -1
             System.out.println(llist.indexOf("Test4")); //gives -1
*/
	}

}
