package com.exceptionHandling;

//Custom Unchecked Exception
class InvalidAgeException2 extends ArithmeticException {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException2(String m) {
        super(m);   //message
    }
}

public class P04_CustomException_Unchecked {
	// Using the Custom Exception without throws keyword
	static void checkAge(int age) {
		if (age < 18) {
			throw new InvalidAgeException2("Invalid age !\nAge must be >= 18.");
		}else {
			System.out.println("Valid age : " + age);
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