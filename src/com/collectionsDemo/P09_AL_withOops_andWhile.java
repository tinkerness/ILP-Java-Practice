package com.collectionsDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class P09_AL_withOops_andWhile {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Person> p = new ArrayList<>();
        
        boolean ch = true;
        while (ch) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            
            p.add(new Person(a, b, c, d));
            
            ch = sc.nextBoolean(); sc.nextLine();
            
            // System.out.println(a + b + c + d + ch);
        }
        
        String country = sc.nextLine();
        // System.out.println(country);
        
        Person highScorer = findPersonWithMostPoints(p);
        System.out.println(highScorer.getId());
        System.out.println(highScorer.getName());
        System.out.println(highScorer.getCountry());
        System.out.println(highScorer.getPoints());
        
        Person searched = findPersonBasedOnCountry(p, country);
        if (searched == null) {
            System.out.println("No Person Found");
        } else {
            System.out.println(searched.getId());
            System.out.println(searched.getName());
            System.out.println(searched.getCountry());
            System.out.println(searched.getPoints());
        }
        
        sc.close();
    }
    
    public static Person findPersonWithMostPoints(ArrayList<Person> Persons){
        Person result = null;
        int max = 0;
        
        for (Person p: Persons) {
            if (p.getPoints() > max) {
                max = p.getPoints();
                result = p;
            }
        }
        return result;        
    } 
    
    public static Person findPersonBasedOnCountry(ArrayList<Person> Persons, String country){
        Person result = null;
        
        for (Person p: Persons) {
            if (p.getCountry().equals(country)) {
                result = p;
            }
        }
        return result;
    }
}

class Person{
    int id;
	String name;
	String country;
	int points;
    
    public Person (int a, String b, String c, int d) {
        this.id = a;
        this.name = b;
        this.country = c;
        this.points = d;
    }
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
}