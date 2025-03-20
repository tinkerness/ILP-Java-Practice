package com.oops;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P05_Fabric {
    public static void main(String args[] ) throws Exception {      
        
   //code to read input
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   
   Fabric[] f = new Fabric[n];
   for (int i=0; i<n; i++) {
        int a = sc.nextInt(); sc.nextLine();
        String b = sc.nextLine();
        int c = sc.nextInt(); sc.nextLine();
        double d = sc.nextDouble(); sc.nextLine();
        
        f[i] = new Fabric(a, b, c, d);
   }
        String name = sc.nextLine();
        
        //code to call methods
        Fabric costliestFabric = findFabricWithMaximumPrice(f);
        Fabric searched = searchFabricByName(f, name);
        
        //code for printing
        if (costliestFabric != null) {
            System.out.println("id-" + costliestFabric.id + "\nname-" + costliestFabric.name + "\navailableStock-" + costliestFabric.stock + "\nprice-" + costliestFabric.price);
        } else {
            System.out.println("No Fabric found with mentioned attribute.");
        }  
        
        if (searched != null) {
            System.out.println("id-" + searched.id + "\nname-" + searched.name + "\navailableStock-" + searched.stock + "\nprice-" + searched.price);
        } else {
            System.out.println("No Fabric found with mentioned attribute.");
        }   
                         
    }
    
   
    public static Fabric findFabricWithMaximumPrice(Fabric[] fabrics)
    {
        Fabric costliest = null;
        double max = 0.0;
        for (Fabric f: fabrics) {
            if (f.price > max) {
                max = f.price;
                costliest = f;
            }
        }
        return costliest;
    }
    
     
    public static Fabric searchFabricByName(Fabric[] fabrics, String sname)
    {
        Fabric result = null;
        for (Fabric f: fabrics) {
            if (f.name.equals(sname)) {
                result = f;
            }
        }
        return result;
    }
}

class Fabric
{
    int id;
    String name;
    int stock;
    double price;
    
    public Fabric(int a, String b, int c, double d) {
        this.id = a;
        this.name = b;
        this.stock = c;
        this.price = d;
    }
}