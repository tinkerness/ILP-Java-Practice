package com.oops;

// create an interface named Stud
interface stud {
	void study();
	void practice();
	void fees();
}

//implement interface in the abstract class student
abstract class student implements stud {
	@Override
	public void study() {
		System.out.println("Study well to have a good career.");
	}
	@Override
	public void practice() {
		System.out.println("Practice makes perfect.");
	}
}

//create a class collegeStudent which extends the abstract class, student.
//We can’t create an instance of our abstract class therefore we need to make a non-abstract class.
class collegeStudent extends student{
	@Override
	public void fees() {
		System.out.println("Student needs to pay fees.");
	}	
}

public class P09_AbstractClass_Implementing_Interface {
	public static void main(String[] args) {
//		create object for collegeStudent
		collegeStudent s = new collegeStudent();
		s.study();
		s.practice();
		s.fees();
	}
}
