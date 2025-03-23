package com.collectionsDemo;

import java.util.*;

public class P07_ArrayList_whileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> nums = new ArrayList<>();
        
        int n = 0;
        while (true) {
            n = sc.nextInt();
            
            if (n == -1) {
                break;
            } else {
                nums.add(n);
            }
            // System.out.println("n:"+n);
        }
        System.out.println(nums);
        
        sc.close();
    }
}