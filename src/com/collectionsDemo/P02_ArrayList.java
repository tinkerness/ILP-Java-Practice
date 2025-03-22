// no need to mention size, grows dynamically

package com.collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class P02_ArrayList {
	
	public static void main(String[] args) { 
	// syntax
    ArrayList<String> cars = new ArrayList<String>();
    
    // Add Items
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    // Print the list
    System.out.println("cars: " + cars); // cars: [Volvo, BMW, Ford, Mazda]
    
    // Access an item
    System.out.println(cars.get(0)); // Volvo

    // Change an Item
    cars.set(0, "Opel");
    System.out.println(cars.get(0)); // Opel
    
    // Add items from one list into another:
    ArrayList<String> brands = new ArrayList<String>();
    brands.addAll(cars);
    System.out.println("brands: " + brands); // brands: [Opel, BMW, Ford, Mazda]
    
    // Remove an Item
    brands.remove(0);
    System.out.println(brands); // [BMW, Ford, Mazda]
    
    // To remove all the elements in the ArrayList
    brands.clear(); // also -     
    System.out.println(brands); // []
    
    // To find out how many elements an ArrayList has
    System.out.println(cars.size()); // 4
    
    // Loop Through an ArrayList
    //method 1: for loop
    for (int i = 0; i < cars.size(); i++) {
        System.out.print("car " + (int)(i+1) + ": " + cars.get(i) + ", ");
    }
    // car 1: Opel, car 2: BMW, car 3: Ford, car 4: Mazda, 
    System.out.println();

    // method 2: for each loop
    for (String c: cars) {
    	System.out.print(c + "|");
    }
    // Opel|BMW|Ford|Mazda|
    System.out.println();

    // Sorting
    Collections.sort(cars);
    System.out.println(cars); // [BMW, Ford, Mazda, Opel]
    
    // Check if an item exists in a list:
    System.out.println(cars.contains("BMW")); // true
    System.out.println(cars.contains("Toyota")); // false
    
    // Find the position of an item in a list:
    System.out.println(cars.indexOf("Ford")); // 1

    // to add elements from a collection
    brands.addAll(cars);
    System.out.println(brands); // [BMW, Ford, Mazda, Opel]

    // to remove all items which belong to a specified collection.
    brands.removeAll(cars);
    System.out.println(brands); // []

    // Check if a list is empty:
    System.out.println(cars.isEmpty()); // false
    System.out.println(brands.isEmpty()); // true

    // Get an array from an ArrayList:
    // method 1: 
    Object[] carsArray = cars.toArray();
    for(Object item : carsArray) {
        System.out.print(item + ", ");
     } System.out.println(); // BMW, Ford, Mazda, Opel, 

    
    // method 2:
    String[] carsArray2 = new String[4];
//    carsArray2 = (String[]) cars.toArray();
    carsArray2 = cars.toArray(carsArray2);
    for (String c: carsArray2) {
        System.out.print(c + ", ");    	
    } System.out.println(); // BMW, Ford, Mazda, Opel, 

    // Get a sublist from a list:
    System.out.println( cars.subList(1, 3) ); // [Ford, Mazda]

    System.out.println();

    
    
    // Integer ArrayList
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(10);
    nums.add(8);
    nums.add(15);
    System.out.println("nums: " + nums); // nums: [10, 8, 15]

    nums.set(0, 2);
    System.out.println(nums.get(0)); // 2
    
    Collections.sort(nums);
    System.out.println(nums); // [2, 8, 15]
    
    // Use a lambda expression in the ArrayList's forEach() method to print every item in the list:
    nums.forEach( (n) -> { System.out.print(n + ", "); } ); // 2, 8, 15, 
  } 
}
