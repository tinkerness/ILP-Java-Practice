package com.basics;
import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int copy = num;
		int rev = 0;
		while(num>0) {
			rev = rev*10 + num % 10;
			num = num / 10;
		}
		
		if (rev == copy) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}

}
