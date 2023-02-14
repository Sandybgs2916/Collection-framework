package collectionframework;
import java.util.*;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>();
		// Insert using add() method
		set.add(6);
		set.add(5);
		set.add(8);
		set.add(9);
		System.out.println(set);
		// search using contains() method
		System.out.println(set.contains(6));
		// delete using remove() methods
		set.remove(8);
		System.out.println(set);
		// size of set
		System.out.println(set.size());
		// iterator method: Iterator is a variable that traverse the element of set using iterator method
	    // next() method returns the next element in the iteration
		// hasNext() method returns true if the iteration has more elements
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
}
}