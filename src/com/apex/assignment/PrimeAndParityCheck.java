package com.apex.assignment;

/**
 * Created by sneha on 2/28/19.
 */
public class PrimeAndParityCheck {
    public Boolean IsInteger(String str) { // need to fix for float numbers

        if (str == "") return false;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == '-') continue;
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public Boolean IsOddNumber(String str) {
        int num = Integer.parseInt(str);
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

    public Boolean IsEvenNumber(String str) {
        int num = Integer.parseInt(str);
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public Boolean IsPrimeNumber(String str) {
        int num = Integer.parseInt(str);
        if (num <= 1) {
            return false;
        }
        double last_num = Math.sqrt(num);
        for (int i = 2; i < last_num; i++) {
            if (num % i == 0) {
                return false;
            }
        } return true;
    }
}
