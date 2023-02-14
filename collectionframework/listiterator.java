package collectionframework;
import java.util.*;

public class listiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(45);
		l1.add(75);
		l1.add(41);
		l1.add(87);
		
		ListIterator<Integer> d = l1.listIterator();
		while(d.hasNext()) {
			System.out.print(d.next() + " ");
		}
		System.out.println();
		// iterator method: Iterator is a variable that traverse the element of set using iterator method
	    // next() method returns the next element in the iteration
		// hasNext() method returns true if the iteration has more elements
		// previous() method returns the previous element in the iteration
		// hasPrevious() method returns true if the iteration has present previous elements
		while(d.hasPrevious()) {
			System.out.print(d.previous() + " ");
		}
	}
}