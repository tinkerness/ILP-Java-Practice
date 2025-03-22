package com.exceptionHandling;

//Custom Checked Exception
class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String m) {
        super(m);   //message
    }
}

public class P03_CustomException_Checked {
//	add throws keyword
	static void checkAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Invalid age !\nAge must be >= 18.");
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