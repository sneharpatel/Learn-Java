package com.apex.util;

import java.util.Scanner;

/**
 * Created by sneha on 2/27/19.
 */
public class Example1 {
    public static void main(String[] args){
        final int START_VALUE = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value >> 5: ");
        int endValue = input.nextInt();
        print(START_VALUE,endValue);
        input.close();
    }


    public static void print(int startValue, int endValue){
        System.out.println("output");
        for (int index = startValue; index <= endValue; index++){
            System.out.println(index);
        }

    }
}
