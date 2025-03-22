package com.collectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class P06_OccurrenceOfEachCharacter {

	public static void main(String[] args) {
		String word = "Hello World!";
		// convert to char array
		char[] letters = word.toLowerCase().replace(" ","").toCharArray();
		
//		HashMap<Character, Integer> hm = new HashMap<>();
		// use LinkedHashMap to preserve order
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		
		// traverse through each character to check if it is present in the hashmap
		for (char c: letters) {
			if (!hm.containsKey(c)) {
				hm.put(c, 1);
			} else {
				int value = hm.get(c) + 1;
				hm.put(c, value);
			}
		}
		
		// print the result
		for (Character ch: hm.keySet()) {
			System.out.println(ch + ": " + hm.get(ch));
		}
	}

}
