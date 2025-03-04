// stores data as key-value pairs
	
//	Key Features:
//	- unique keys
//	- values can be duplicated
//	- uses hashing technique for lookups
//	- unordered - doesn't maintain insertion order

package com.collectionsDemo;

import java.util.HashMap;

public class P03_HashMap {
	public static void main(String[] args) {
//		Integer not int
		HashMap<Integer, String> students = new HashMap<>();
		System.out.println("Empty Hashmap : " + students);
		
//		1. adding key-value pairs using put
		students.put(1, "Ann");
		students.put(3, "Cindy");
		students.put(2, "Bob");
		System.out.println("Students HashMap : " + students);
		
//		2. retrieving values for a given key - (null if not present)
		System.out.println("student with id 2 : " + students.get(2));
		
//		Iterating through HashMap
		for (Integer id: students.keySet()) {
			System.out.println("Id : " + id + ", name: " + students.get(id));
		}
		
//		3. Removing a key-value pair
		students.remove(2);
		System.out.println("Updated HashMap : " + students);
		
//		4. check if key exists
		System.out.println("Student with id 4 present ? " + students.containsKey(4));
		
//		5. check if value exists
		System.out.println("Student with name Ann present ? " + students.containsValue("Ann"));
		
//		6. number of elements
		System.out.println("Number of elements : " + students.size());
		
//		7. get all keys
		System.out.println("Keys in students HashMap : " + students.keySet());
		
//		8. get all values
		System.out.println("Values in students HashMap : " + students.values());
	}
}
