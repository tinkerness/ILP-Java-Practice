package com.collectionsDemo;

import java.util.*;

class Textile {
    private int number;
	private String name;
    private int sales;
    private String address;
    
    public Textile(int a, String b, int c, String d) {
        this.number = a;
        this.name = b;
        this.sales = c;
        this.address = d;
    }
    
    public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}

class P08_ArrayList_withGettersSetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Textile> t = new ArrayList<>();
        
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            
            t.add(new Textile(a, b, c, d));
            
            choice = sc.nextLine();
        }
        
        String address = sc.nextLine();
        
        int numOfTextiles = countTextileInAddress(t, address);
        if (numOfTextiles == 0) {
            System.out.println("No textiles found in the speciified address.");
        } else {
            System.out.println("Number of textiles in the specified address: " + numOfTextiles);
        }
        
        int highestSales = countHighestSales(t);
        // if (highestSales == 0) {
        //     System.out.println("No Textiles found in the specified address.");
        // } else {
            System.out.println("The highest sales achieved by a textile is: " + highestSales);
        // }
        
        sc.close();
    }
    
    public static int countTextileInAddress(ArrayList<Textile> textiles, String address) {
        int count = 0;
        for (Textile t: textiles) {
            if (t.getAddress().equals(address)) {
                count++;
            }
        }
        return count;
    }
    
    public static int countHighestSales(ArrayList<Textile> textiles) {
        int max = 0;
        for (Textile t: textiles) {
            if (t.getSales() > max) {
                max = t.getSales();
            }
        }
        return max;
    }
}

