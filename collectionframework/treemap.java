package collectionframework;

import java.util.*;

public class treemap {

	public static void main(String[] args) {
		// TreeMap implement concept of both HashMap and Binary search tree as it print output
		// in sorted order irrespective of order user input
		TreeMap<String, Integer> map = new TreeMap<>(); // String represents keys and Integer value
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
	}
}