package com.collectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class P05_OccurrenceOfWordsInString {

	public static void main(String[] args) {
		// Split the given string and store the words into a String array.
		String str = "The girl is Deepa and the boy is Deepu.";
		
		str = str.replace(".", "").toLowerCase();
		String[] words = str.split(" ");
		
		System.out.print("words in string: ");
		for (String w: words) {
			System.out.print(w + ", ");
		}
		System.out.println();
		// words in string: the, girl, is, deepa, and, the, boy, is, deepu, 


//		// Declare a HashMap in Java of <String, Integer> -> word, count
//		HashMap<String, Integer> hm = new HashMap<>();
		// to maintain order use LinkedHashMap
		HashMap<String, Integer> hm = new LinkedHashMap<>();
		
		// Traversing the string array, check if the word is in the HashMap or not.
		 
		for (String w: words) {
			// If it is not in the HashMap, then store the word as key and 1 as the initial value
			if (!hm.containsKey(w)) {
				hm.put(w, 1);
			}
			// if the word is present in the HashMap then increase the value against the word.
			else {
				hm.put(w, hm.get(w)+1);
			}
		}
		
		// print the value of HashMap
		System.out.println("\nCount of words in the string:");
		for (String w: hm.keySet()) {
			System.out.println(w + ": " + hm.get(w));
		}
		/*
		 * 
		Count of words in the string:
		the: 2
		deepa: 1
		and: 1
		deepu: 1
		is: 2
		girl: 1
		boy: 1
		 */
	}

}
