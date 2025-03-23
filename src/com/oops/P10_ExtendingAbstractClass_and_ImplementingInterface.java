package com.oops;

import java.util.*;

abstract class Activity  {
    static int countOfInstances = 0;
    String eventName;
    int yearOfEvent;
    
    public Activity(String eventName, int yearOfEvent){
        this.eventName = eventName;
        this.yearOfEvent = yearOfEvent;
        countOfInstances++;
    }
    
    public String getEventName(){
        return this.eventName;
    }
    
    public int getYearOfEvent(){
        return this.yearOfEvent;
    }    
    
    static int getCountOfInstace(){
        return countOfInstances;
    }
    
} 

// create interfaces for indoor and outdoor activities
interface Indoor {
    void indoorGame();
}
interface Outdoor {
    void outdoorGame();
}

// Create the Carroms, Football and Badminton classes here.
// they should extend the activity class and implement the respective interfaces
class Carroms extends Activity implements Indoor {
	public Carroms(String eventName, int yearOfEvent) {
		super(eventName, yearOfEvent);
	}
	@Override
	public void indoorGame() {
	} 
}

class Football extends Activity implements Outdoor  {
	public Football(String eventName, int yearOfEvent) {
		super(eventName, yearOfEvent);
	}
	@Override
	public void outdoorGame() {}
}

class Badminton extends Activity implements Indoor  {
	public Badminton(String eventName, int yearOfEvent) {
		super(eventName, yearOfEvent);
	}
	@Override
	public void indoorGame() {}
}

public class P10_ExtendingAbstractClass_and_ImplementingInterface {

    public static void main(String[] args) {
        
        // Enter your code for the main method here. 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        
        // String[] arr = new String[n];
        
        // for (int i=0; i<n; i++) {
        //     arr[i] = sc.nextLine();
        // }
        
        // for (String entry: arr) {
        //     String[] details = entry.split(" ");
        //     System.out.println(details[1] + " " + details[2]);
        // }
        
        ArrayList<Activity> a = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            String[] input = sc.nextLine().split(" ", 3);
            
            // check the activity type
            // based on type, add the details to respective class object
            String activityType = input[0];
            String eventName = input[1];
            int yearOfEvent = Integer.parseInt(input[2]);
            
            switch (activityType) {
                case "Carroms": 
                    a.add(new Carroms(eventName, yearOfEvent));
                    break;
                case "Football": 
                    a.add(new Football(eventName, yearOfEvent));
                    break;
                case "Badminton": 
                    a.add(new Badminton(eventName, yearOfEvent));
                    break;
            }
        }
        
        // print the details
        for (Activity act: a) {
            System.out.println(act.eventName + " " + act.yearOfEvent);
        }
        
        sc.close();
    }
}