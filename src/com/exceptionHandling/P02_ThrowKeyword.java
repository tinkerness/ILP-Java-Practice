package com.exceptionHandling;

public class P02_ThrowKeyword {
	
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Invalid age !\nAge must be >= 18.");
		}else {
			System.out.println("Valid age : "+age);
		}
	}

	public static void main(String[] args) {
		try {
			checkAge(17);
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}		
	}
}