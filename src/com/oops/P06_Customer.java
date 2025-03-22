package com.oops;

import java.util.*;

public class P06_Customer {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Customer[] cust = new Customer[n];
        for (int i=0;i<n; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            
            cust[i] = new Customer(a, b, c, d);
        }
        
        int s = sc.nextInt();
        
        double avg = findAverageSalaryOfCustomer(cust);
        if (avg != 0){
            System.out.println("Average of salary "+avg);
        } else{
            System.out.println("Average of salary ");
        }
        Customer res = searchCustomerBySalary(cust, s);
        if (res != null) {
            System.out.println("id-" + res.id);
            System.out.println("name-" + res.name);
            System.out.println("salary-" + res.salary);
            System.out.println("age-" + res.age);
        } else {
            System.out.println("No Customer found with mentioned attribute");
        }
        sc.close();
    }
    
    private static Customer searchCustomerBySalary(Customer[] c, int salary)
    {
         // Enter your code here
        Customer result = null;
        
        for (Customer cust: c) {
            if (cust.salary == salary){
                result = cust;
            }
        } 
        return result;
    }
    private static double findAverageSalaryOfCustomer(Customer[] c)
    {
        // Enter your code here
        double avgSal = 0;
        int sum =0, count =0;
        
        for (Customer cust: c){
            sum = sum + cust.salary;
            count ++;
        }
        avgSal = sum/count;
        return avgSal;
    }
    
    
}

 class Customer {
   
    // Enter your code here
    int id;
    String name;
    int salary;
    int age;
    
    public Customer (int a, String b, int c, int d){
        this.id = a;
        this.name = b;
        this.salary = c;
        this.age = d;
    }
     
    }
    

    
    