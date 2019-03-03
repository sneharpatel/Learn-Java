package com.apex.assignment;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by sneha on 3/1/19.
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input: ");
        System.out.println("Select a character (r)ock, (p)aper, (s)cissors :");
        String userInput = input.next().toLowerCase();


        String[] arr = new String[] {"r", "p", "s"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);

        String compGenerate = arr[randomIndex];

        System.out.println("Computer has selected: ");
        System.out.println(compGenerate);


        if (userInput.equals(compGenerate)) {
            System.out.println("It's tie");
        } else if (userInput.equals("s")){
            if (compGenerate.equals("p")) {
                System.out.println("User wins");
            } else{
                System.out.println("Computer wins");
            }

        } else if (userInput.equals("p")) {
            if (compGenerate.equals("s")) {
                System.out.println("Computer Wins");
            }else {
                System.out.println("User wins");
            }

        } else if (userInput.equals("r")){
            if (compGenerate.equals("s")) {
                System.out.println("User wins");
            } else {
                System.out.println("Computer wins");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
