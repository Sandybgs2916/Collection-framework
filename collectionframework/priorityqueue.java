package collectionframework;

import java.util.*;
import java.util.Queue;

public class priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> c = new PriorityQueue<>();
		/* Queue<Integer> c = new PriorityQueue<>(comparator.reverseOrder());
		this way we can create maximum heap using PriorityQueue */
		c.offer(20);
		c.offer(70);
		c.offer(50);
		c.offer(80);
		c.offer(90);
		System.out.println(c);
		c.poll(); 
		System.out.println(c);
	} 
}