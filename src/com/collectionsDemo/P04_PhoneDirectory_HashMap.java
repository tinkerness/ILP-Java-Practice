package com.collectionsDemo;

import java.util.HashMap;

public class P04_PhoneDirectory_HashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> phoneBook = new HashMap<>();
		
//		add contact names and numbers
		phoneBook.put("Amala", "1234512345");
		phoneBook.put("Hanna", "1231234564");
		phoneBook.put("Salwa", "1237891239");
		
//		retrieve number
		System.out.println("Amala's number : " + phoneBook.get("Amala"));
		
//		iterate through phoneBook
		for (String name: phoneBook.keySet()) {
			System.out.println("name : " + name + ", number : " + phoneBook.get(name));
		}

	}

}
