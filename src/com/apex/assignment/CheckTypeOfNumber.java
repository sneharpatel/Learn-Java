//Write a java program with following methods:
//public Boolean IsInteger(String str)
//public Boolean IsOddNumber(String str)
//public Boolean IsEvenNumber(String str)
//public Boolean IsPrimeNumber(String str)

package com.apex.assignment;

/**
 * Created by sneha on 2/28/19.
 */
public class CheckTypeOfNumber {
    public static void main(String[] args){
        PrimeAndParityCheck number = new PrimeAndParityCheck();
        System.out.println("Check number is integer or not: "+number.IsInteger(" "));
        System.out.println("Check number is Odd or not: "+number.IsOddNumber("701"));
        System.out.println("Check number is Even or not: "+number.IsEvenNumber("81"));
        System.out.println("Check number is Prime or not: "+number.IsPrimeNumber("50"));
    }

}
