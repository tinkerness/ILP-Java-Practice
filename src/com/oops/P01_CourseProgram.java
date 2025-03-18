package com.oops;
import java.util.*;

public class P01_CourseProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Course[] c1 = new Course[n];
		
		for(int i=0; i<4; i++) {
			int a = sc.nextInt();sc.nextLine();
			String b = sc.nextLine();
			String c = sc.nextLine();
			int d = sc.nextInt();
			int e = sc.nextInt();sc.nextLine();
			
			c1[i] = new Course(a,b,c,d,e);
		}
		
//		first method call
		String admin = sc.nextLine();
		int avg = findAvgOfQuizByAdmin(c1, admin);
		if (avg == 0) {
			System.out.println("No course found.");
		}
		else {
			System.out.println(avg);
		}
		
//		second method call
		int num = sc.nextInt();
		Course[] handson = setCourseByHandsOn(c1, num);
		for (Course cs: handson) {
			System.out.println(cs.name);
		}
		
		sc.close();;
	}
	
	public static int findAvgOfQuizByAdmin(Course[] c, String str) {
		int count = 0, sum = 0, avg = 0;
		for(int i=0; i<c.length; i++) {
			if ((c[i].admin).equals(str)) {
				sum += c[i].quiz;
				count += 1;
			}
		}
		if (count >= 1) {
			avg = sum / count;
		} else {
			avg = 0;
		}		
		return avg;
	}
	
	public static Course[] setCourseByHandsOn(Course[] c, int num) {
//		find count (size of required array)
		int count = 0;
		for(int i=0; i<c.length; i++) {
			if (c[i].handson < num) {
				count++;
			}
		}
		
//		add values to array
		Course[] arr = new Course[count];
		int index = 0;
		for (Course cs: c) {
			if (cs.handson < num) {
				arr[index++] = cs;
			}
		}
		
//		sort using bubble sort
		for (int i=0; i<count-1; i++) {
			for (int j=0; j<count-i-1; j++) {
				if (arr[j].handson > arr[j+1].handson) {
					Course temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		if(arr.length <= 0) {
			return null;
		} else {
			return arr;
		}
	}

}

// define class Course with required fields
class Course{
	int id;
	String name;
	String admin;
	int quiz;
	int handson;
	public Course(int id, String name, String admin, int quiz, int handson) {
		this.id = id;
		this.name = name;
		this.admin = admin;
		this.quiz = quiz;
		this.handson = handson;
	}
}