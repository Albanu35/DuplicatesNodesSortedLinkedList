package duplicatex2;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
		RemoveDuplicate myList = new RemoveDuplicate();
		
		myList.addNode(5);
		myList.addNode(6);
		myList.addNode(6);
		myList.addNode(9);
		myList.addNode(11);
		myList.addNode(11);
		myList.addNode(22);
		
		System.out.println("Original doubly linked list is:");
		myList.printList();
		
		//remove dupplicate nodes
		myList.removeDuplicates();
		
		System.out.println("List after nodes was removes:");
		myList.printList();
		
		//remove all duplicate nodes
		myList.removeAllDuplicate();
		
		System.out.println("List after all nodes duplicates was remove");
		myList.printList();
		
	}

}
