package collectionframework;
import java.util.*;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>(); // String represents keys and Integer value
		// Insertion
		map.put("India", 140);
		map.put("US", 40);
		map.put("China", 150);
		map.put("UK", 50);
		System.out.println(map);
		// Search
		System.out.println(map.containsKey("China"));
		System.out.println(map.get("China")); // if key exists then it value will be output
		System.out.println(map.get("Brazil")); // if key doesn't exist then null will be output
		System.out.println(map.isEmpty());
		
		/* two ways of traversing array elements 
		int [] arr = {65, 43, 78};
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int val : arr) { // one by one array element will be stored to val variable
			System.out.print(val + " ");
		}
		System.out.println();  */
		
		// Traversing
		for(Map.Entry<String, Integer> e : map.entrySet()) { // entrySet() means set version of map
				System.out.print(e.getKey() + " "); // Map.Entry will store value of set map
				System.out.print(e.getValue() + " ");
		}
		System.out.println();
		
		// method for getting only keys
		for(String c : map.keySet()) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// method for getting only values
				for(Integer d : map.values()) {
					System.out.print(d + " ");
				}
				System.out.println();
		
		// Delete operation
		map.remove("China");
		System.out.println(map);
	}
}