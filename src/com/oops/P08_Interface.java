package com.oops;

interface in1 {
	void display(int n);
}

class P08_Interface implements in1
{
    public void display(int k)
    {   
        int count =0;
        for (int n=2; n<=k; n++){
            if (isPrime(n)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public boolean isPrime(int n) {
        boolean flag = true;
        for (int i=2; i<=n/2; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
            }
        }
        return flag;
    }
}