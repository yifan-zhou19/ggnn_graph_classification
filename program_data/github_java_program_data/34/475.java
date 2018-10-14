package ll.arrays;

import java.util.AbstractList;

public class LinkedListList<T> extends AbstractList<T> {

	public Node head;

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Node current = head;
		System.out.println("toString" + current.next.val);
		String returnS = null;
		while(current != null){
			returnS += " [ " + current.val +" ] -> ";
			current = current.next;
		}
		
		return returnS;
	}


	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}