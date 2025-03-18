package com.oops;

public class P03_BigAndSmall {
	private int[] num;
	
	public P03_BigAndSmall(int[] arr) {
		this.num = arr;
	}
	
	public void display() {
		if (num == null || num.length == 0) {
			System.out.println("Array is empty!");
			return;
		}
		
		int l = num[0];
		int s = num[0];
		for (int n: num) {
			if (n > l) {
				l = n;
			}
			if (n < s) {
				s = n;
			}
		}
		System.out.println("The largest num is : " + l);
		System.out.println("The smallest num is : " + s);
	}

	public static void main(String[] args) {
		int[] arr = {1, -99, 0, 23, 43};
		P03_BigAndSmall bs = new P03_BigAndSmall(arr);
		bs.display();
	}

}
