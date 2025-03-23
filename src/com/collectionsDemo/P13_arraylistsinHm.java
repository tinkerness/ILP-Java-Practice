package com.collectionsDemo;

import java.util.*;

public class P13_arraylistsinHm {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        
        ArrayList<String> attractions = new ArrayList<>();
        ArrayList<Integer> ratings = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            String place = sc.nextLine();
            attractions.add(place);
            int rating = sc.nextInt();
            ratings.add(rating);
        }
        
        Map<String, List<String>> result = categorize(attractions, ratings);
        System.out.println(result);
    }
    
    public static Map<String, List<String>> categorize(ArrayList<String> attractions, ArrayList<Integer> ratings) {
        Map<String, List<String>> hm = new HashMap<>();
        // add ratings as key
        hm.put("High", new ArrayList<>());
        hm.put("Medium", new ArrayList<>());
        hm.put("Low", new ArrayList<>());
        
        for (int i=0; i<attractions.size(); i++) {
            String p = attractions.get(i);
            int r = ratings.get(i);
            
            if (r>=8 && r<=10) {
                hm.get("High").add(p);
            } else if (r>=4 && r<=7) {
                hm.get("Medium").add(p);
            } else if (r>=1 && r<=3) {
                hm.get("Low").add(p);
            }
        }
        
        return hm;
    }
}