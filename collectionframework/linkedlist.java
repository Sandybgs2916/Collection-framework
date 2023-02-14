package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// All the methods of linkedlist is same as arraylist methods
		LinkedList<Integer> l1 = new  LinkedList<>();
		// new keyword is used to allocates memory to the given object
		// created object l1 of class LinkedList which is type of Integer
		l1.add(4);
		l1.add(7);
		l1.add(5);
		l1.add(9);
		System.out.println(l1);
		// insertion at certain index: l1.add(index, integer)
		l1.add(2,6); // 2 is index and 6 will be inserted at index 2
		System.out.println(l1);
		// removing element
		l1.remove(2);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		for(int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
		System.out.println();
		System.out.println("Size of LinkedList is: " + l1.size());
		// searching element
		boolean b1 = l1.contains(7);
		System.out.println(b1);
	}
}
