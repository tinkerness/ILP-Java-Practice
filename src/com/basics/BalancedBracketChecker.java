package com.basics;
import java.util.*;
import java.util.Scanner;

public class BalancedBracketChecker 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		boolean flag = true;
		Stack<Character> stack = new Stack<>();
		if (str.length() % 2 != 0) 
		{
//			System.out.println("Not Balanced");
			flag = false;		}
		for (int i=0; i<str.length(); i++) 
		{
			System.out.println(str.charAt(i));
			
			if (str.charAt(i) == '(') 
			{
				stack.push(str.charAt(i));
				System.out.println("1" + stack);
				continue;
			}
			else 
			{
				if (stack.isEmpty()) 
				{
//					System.out.println("Not Balanced");
					System.out.println("2" + stack);
					flag = false;
					break;
				}
				else 
				{
					stack.pop();
//					flag = true;
					System.out.println("3" + stack);
					continue;
				}
			}
		}
//		if(stack.isEmpty())
//			flag = true;
		if (flag == true) 
		{
			System.out.print("Balanced");
		}
		else 
		{
			System.out.print("Not Balanced");
		}
		
		sc.close();
	}

}
