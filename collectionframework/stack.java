package collectionframework;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		/* if we want input from user
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s1 = new Stack<Integer>();
		for(int i = 0; i < 5; i++) {
			int value = sc.nextInt();
			s1.push(value);
		}
		System.out.print(s1); */
		Stack<Integer> s1 = new Stack<>(); 
		// inserting element on Stack
		s1.push(22);
		s1.push(4);
		s1.push(19);
		s1.push(12);
		System.out.println(s1);
		// delete operation on Stack
		s1.pop(); // it will remove last inserted element
		System.out.println(s1);
		// peek operation
		System.out.println(s1.peek());
		// empty operation
		boolean status = s1.empty();
		System.out.println(status);
		// search operation its return type would be int as it gives index number
		int index = s1.search(4);
		System.out.println(index);
		// how to iterate over a stack
		Iterator it = s1.iterator(); // it is an object of Iterator class
		// Iterator is class which will take stack we want to iterate using iterator() method
		while(it.hasNext()) { // hasNext method check is there any next element in stack class
			Object s2 = it.next(); // next method will fetch value nd store new value in to s2 Object
			System.out.print(s2 + " ");
		}
		// check size of stack
		System.out.println();
		System.out.println(s1.size());
		// sort stack
		s1.sort(null);
		System.out.println(s1);
	}
}