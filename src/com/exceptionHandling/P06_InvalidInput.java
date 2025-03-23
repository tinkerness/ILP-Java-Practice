package com.exceptionHandling;

import java.io.*;
import java.util.*;

public class P06_InvalidInput {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        try {
            while (true) {
                int n = sc.nextInt();
                System.out.println("The number is: " + n);
            }
        } catch (InputMismatchException e) {
            System.out.println(e + " Please Try Again!"); // java.util.InputMismatchException Please Try Again!

            // e.printStackTrace();
        }
    }
}