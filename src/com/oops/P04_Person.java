package com.oops;

import java.util.*;

public class P04_Person {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Person[] p = new Person[n];
        for (int i=0; i<n; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            
            p[i] = new Person(a, b, c, d);
        }
        
        String nameToFind = sc.nextLine();
        
        Person oldPerson = findOldestPerson(p);  
        if (oldPerson != null) {
            System.out.println("id-"+oldPerson.p_id + "\nname-"+oldPerson.p_name + "\nage-" + oldPerson.p_age + "\nmobile-" +oldPerson.p_mob);
        } else {
            System.out.println("No oldest person found.");
        }        
        
        Person namedPerson = searchPersonByName(p, nameToFind);
        if (namedPerson != null) {
            System.out.println("id-"+namedPerson.p_id + "\nname-"+namedPerson.p_name + "\nage-" + namedPerson.p_age + "\nmobile-" +namedPerson.p_mob);
        } else {
            System.out.println("No person found with the mentioned name.");
        } 
        
        sc.close();
    }
    
    public static Person findOldestPerson(Person[] person){
       Person oldest = null;
       int max_age = 0;
       for (Person p: person) {
            if (p.p_age > max_age) {
                max_age = p.p_age;
                oldest = p;
            }
       }
       return oldest;
    }
    
    public static Person searchPersonByName(Person[] person, String name){
       Person result = null;
       for (Person p: person) {
            if (p.p_name.equals(name)){
                result = p;
            }
       }
       return result;
    }
}

class Person{  
    int p_id;
    String p_name;
    int p_age;
    String p_mob;
    
    public Person(int p_id, String p_name, int p_age, String p_mob) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_age = p_age;
        this.p_mob = p_mob;
    }
}