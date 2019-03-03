//Write a program to a specified number of generate fibonacci series.
//        Note: Read the required count from the keyboard

package com.apex.assignment;
import java.util.Scanner;
/**
 * Created by sneha on 2/27/19.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = input.nextInt();

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.getFibonacci(number);

        Fibonacci fibonacciSeries = new Fibonacci();
        fibonacciSeries.getFibonacciSeries(number);

    }

}








