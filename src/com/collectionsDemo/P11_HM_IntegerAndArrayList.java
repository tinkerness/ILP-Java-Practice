package com.collectionsDemo;

import java.util.*;

public class P11_HM_IntegerAndArrayList {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        
        ArrayList<String> str = new ArrayList<>();
        
        for (int i=0; i<n; i++) {
            String word = sc.nextLine();
            str.add(word);
        }
        
        HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
        for (String s: str) {
            int l = s.length();
            if (!hm.containsKey(l)) {
                ArrayList<String> entry = new ArrayList<>();
                entry.add(s);
                hm.put(l, entry);
            }
            else {
                ArrayList<String> entry = hm.get(l);
                entry.add(s);
                hm.put(l, entry);
            }
        }
        
        for (int k: hm.keySet()) {
            System.out.print(k + ": ");
            for (String w: hm.get(k)) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}