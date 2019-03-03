//Generate following
//    Generate 1000 numbers
//    Generate multiple of 5 and less than 1000
//    Generate odd numbers up to 1000

package com.apex.assignment;

import java.util.ArrayList;

/**
 * Created by sneha on 3/1/19.
 */
public class GenerateMethods {
    public static void main(String[] args){
        GenerateMethodImplement methodCall = new GenerateMethodImplement();
        int i = 100;
        int m = 5;
        ArrayList generateNumbers = methodCall.generateNumbers(i);
        ArrayList multiOfFive =  methodCall.GenerateMultipleOfFive(i);
        ArrayList oddNumbers = methodCall.generateOddNumbers(i);

        System.out.println("Generate" +i+ "numbers :" +generateNumbers);
        System.out.println("Multiple of " +m+ " ans less than " +i+ ": " +multiOfFive);
        System.out.println("Odd numbers up to" +i+ ":" +oddNumbers);

    }




}
