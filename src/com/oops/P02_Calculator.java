package com.oops;

public class P02_Calculator {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 3;
		
		P02_Calculator c = new P02_Calculator();
		int sum = c.calcSum(n1, n2);
		int diff = c.calcDiff(n1, n2);
		System.out.println("sum : " + sum);
		System.out.println("diff : " + diff);
	}
	
	public int calcSum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int calcDiff(int num1, int num2) {
		return num1 - num2;
	}

}
