// stores data as key-value pairs
	
//	Key Features:
//	- unique keys
//	- values can be duplicated
//	- uses hashing technique for lookups
//	- unordered - doesn't maintain insertion order

package com.collectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class P03_HashMap {
	public static void main(String[] args) {
//		Integer not int
		HashMap<Integer, String> students = new HashMap<>();
		System.out.println("Empty Hashmap : " + students);
		// Empty Hashmap : {}

		
//		1. adding key-value pairs using put
		students.put(1, "Ann");
		students.put(3, "Cindy");
		students.put(2, "Bob");
		System.out.println("Students HashMap : " + students);
		// Students HashMap : {1=Ann, 2=Bob, 3=Cindy}

		
//		2. retrieving values for a given key - (null if not present)
		System.out.println("student with id 2 : " + students.get(2));
		// student with id 2 : Bob

		
//		Iterating through HashMap
//		method 1:
		for (Integer id: students.keySet()) {
			System.out.println("Id : " + id + ", name: " + students.get(id));
		}
		/** Id : 1, name: Ann
		 * Id : 2, name: Bob
		 * Id : 3, name: Cindy */

//		method 2: entrySet() returns all the entries in a map:
		for (Map.Entry s: students.entrySet()) {
			System.out.println(s.getKey() + "=" + s.getValue()); // or System.out.println(s);
		}
		/** 1=Ann
		 * 2=Bob
		 * 3=Cindy */
		
//		method 3: to print every entry in the map:
		students.forEach( (k,v) -> { System.out.println(k + "->" + v); });
		/** 1->Ann
		 * 2->Bob
		 * 3->Cindy */
		
		
//		3. Removing a key-value pair using key
		students.remove(2);
		System.out.println("Updated HashMap : " + students);
		// Updated HashMap : {1=Ann, 3=Cindy}

		
//		4. check if key exists
		System.out.println("Student with id 4 present ? " + students.containsKey(4));
		// Student with id 4 present ? false

		
//		5. check if value exists
		System.out.println("Student with name Ann present ? " + students.containsValue("Ann"));
		// Student with name Ann present ? true

		
//		6. number of elements
		System.out.println("Number of elements : " + students.size());
		// Number of elements : 2

		
//		7. get all keys
		System.out.println("Keys in students HashMap : " + students.keySet());
		// Keys in students HashMap : [1, 3]

		
//		8. get all values
		System.out.println("Values in students HashMap : " + students.values());
		// Values in students HashMap : [Ann, Cindy]

		
//		9. Add values from other map
		HashMap<Integer, String> extra = new HashMap<Integer, String>();
		extra.put(5, "Arti");
		extra.put(7, "Deepa");
		System.out.println("Extra HashMap : " + extra);
		// Extra HashMap : {5=Arti, 7=Deepa}
		students.putAll(extra);
		System.out.println("New students HashMap" + students);
		// New students HashMap{1=Ann, 3=Cindy, 5=Arti, 7=Deepa}

		
//		10. To remove all item
		extra.clear();
		System.out.println("After clear() extra : " + extra);
		// After clear() extra : {}

	}
}
