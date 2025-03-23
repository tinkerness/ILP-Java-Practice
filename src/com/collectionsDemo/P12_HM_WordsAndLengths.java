package com.collectionsDemo;

import java.util.*;

public class P12_HM_WordsAndLengths {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> districts = new HashMap<>();
        
        String input = sc.nextLine();
        
        districts = countDistrictnames(input);
        System.out.println(districts);
        
        sc.close();
    }
    
    public static Map<String, Integer> countDistrictnames(String input) {
        Map<String, Integer> d = new LinkedHashMap<>();
        
        String[] str = input.toLowerCase().split(" ");
        for (String s: str) {
            d.put(s, s.length());
        }
        return d;
    }
}