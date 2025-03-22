package com.exceptionHandling;

public class P01_ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
//		System.out.println("arr : " + arr[4]);  // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		
		try {
			System.out.println("arr : " + arr[4]);
		} catch (Exception e) {
//			e.printStackTrace();  // java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
			System.out.println("Exception Handled: " + e.getMessage());  // Exception Handled: Index 4 out of bounds for length 4

		} finally {
			System.out.println("Completed till end!");
		}
		
	}

}
