package SingleLinkedList;

public class LinkedListDriver {

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insertAtBeginning(4);
		linkedList.insertAtBeginning(3);
		linkedList.insertAtBeginning(2);
		linkedList.insertAtBeginning(21);
		linkedList.insertAtEnd(5);
		linkedList.insertAtEnd(6);
		linkedList.insertAtPos(77, 1);
		//linkedList.deleteFirstNode();
		//linkedList.deleteLastNode();
		//linkedList.deleteAtPos(1);
		//linkedList.deleteAtPos(4);
		//linkedList.deleteAtPos(3);
		//linkedList.deleteAtPos(2);
		//linkedList.deleteAtPos(1);
		linkedList.reverseLinkedList();
		linkedList.reverseLinkedList();
		System.out.println("Before Sort");
		linkedList.displayLinkedListElements();
		linkedList.sortLinkedLinkExData();
		linkedList.displayLinkedListElements();
		
		int numOfnodes = linkedList.countLinkedListNodes();
		System.out.println("\nTotal Nodes: " + numOfnodes);

	}

}
