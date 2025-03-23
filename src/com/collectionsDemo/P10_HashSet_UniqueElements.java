package com.collectionsDemo;

import java.util.*;

public class P10_HashSet_UniqueElements {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Set<Integer> nums = new HashSet<>();
        
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            nums.add(num);
        }
        
        for (int j: nums) {
            System.out.print(j + " ");
        }
        sc.close();
    }
}