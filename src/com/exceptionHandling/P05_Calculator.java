package com.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

// class Calculator with divison method
class Calculator{
    public static double division(int n1, int n2){
        double result = n1/n2;
        return result;
    }
}

// inherit the Calculator class and call the divion method
// handle exceptions incase of non-integer input, division by zero, etc.
class P05_Calculator extends Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
        
            double quotient = division(n1, n2);
            System.out.println("Result: " + quotient);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: Input must be an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            sc.close();
        }
        
    }
}