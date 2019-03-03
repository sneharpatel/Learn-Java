//3. Write a class BasicCalulator.java to provide basic mathematical operation like additional, subtractions,
// multiplications, and division for two numbers. Write a client to use above class and call its operations.

package com.apex.assignment;

/**
 * Created by sneha on 2/27/19.
 */
public class BasicCalculator {


    public double performOperation(double num1, double num2, String operation) {
        double ans = 0;
        switch (operation) {
            case "+":
                ans = num1 + num2;
                System.out.println("Addition of two numbers " +num1+" and "+num2+ " is : " +ans);
                break;
            case "-":
                ans = num1 - num2;
                System.out.println("Subtraction of two numbers " +num1+" and "+num2+ " is : " +ans);
                break;

            case "*":
                ans = num1 * num2;
                System.out.println("Multiplication of two numbers " +num1+" and "+num2+ " is : " +ans);
                break;
            case "/":
                ans = num1 / num2;
                System.out.println("Division of two numbers " +num1+" and "+num2+ " is : " +ans);
                break;
            case "%":
                ans = num1 % num2;
                System.out.println("Modulo of two numbers " +num1+" and "+num2+ " is : " +ans);
                break;
            default:
                System.out.println("Invalid operator");
        }
        return ans;

    }

}
