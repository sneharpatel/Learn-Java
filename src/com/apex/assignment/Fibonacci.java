package com.apex.assignment;

/**
 * Created by sneha on 2/27/19.
 */
public class Fibonacci {
     private int a = 0;
     private int b = 1;
     private int c;
   public void getFibonacci(int n){
        if (n == 0) {
            System.out.println("Fibonacci series of " +n+ " is: " +a);
        }
        for (int i=2; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Fibonacci series of " +n+ " is: " +b);
    }

    public void getFibonacciSeries(int n){
       if (n <= 1) {
            System.out.println(n);
        } else {
            System.out.print("Fibonacci series of " +n+ " is:" +a+ " " +b);
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(" " +c);
            }
        }
   }
}
