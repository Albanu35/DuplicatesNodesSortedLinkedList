package linkedlist;

import java.util.ListIterator;

public class LinkedList {

	public static void main(String[] args) {
		LinkedList<String> towns = new LinkedList<>();

		// populate list with towns:
		towns.add("Cluj");
		towns.add("Targu Jiu");
		towns.add("Suceava");
		towns.add("Bucuresti");
		towns.add("Brasov");

		// iterate list towns
		for (int i = 0; i < towns.size(); i++) {
			System.out.println("Current town is: " + towns.get(i));
		}
		System.out.println();
		
		//
		ListIterator<String> listIt = towns.listIterator();
		
		// I. forward
		while (listIt.hasNext()) {
		  System.out.println("Current town is: " + listIt.next());
		}
		System.out.println();
		 
		// II. backward
		while (listIt.hasPrevious()) {
		  System.out.println("Current town is: " + listIt.previous());
		}
		System.out.println();

	}

}
