package collectionframework;
import java.util.*;

public class queueusinglinkedlistclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> c = new LinkedList<>();
		c.offer(20);
		c.offer(70);
		c.offer(50);
		c.offer(80);
		c.offer(90);
		System.out.println(c.peek());
		c.poll(); // poll method used to delete the data
		System.out.println(c);
	}
}