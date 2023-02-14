package collectionframework;
import java.util.*;

public class treeset {

	public static void main(String[] args) {
		// Tree set maintain the properties of set as well as binary search tree
		TreeSet<Integer> t = new TreeSet<>();
		t.add(6);
		t.add(5);
		t.add(8);
		t.add(9);
		System.out.println(t);
		// search using contains() method
		System.out.println(t.contains(6));
		// delete using remove() methods
		t.remove(8);
		// t.clear(); clear will remove all element of set
		System.out.println(t);
		// size of set
		System.out.println(t.size());
	}
}