//Exercise-2
//        write a rock, paper , scissors game code
//        https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors#/media/File:Rock-paper-scissors.svg
//
//        step 1: ask usr to enter a character (r)ock, (p)aper , (s)cissors
//        step 2: computer has to select a random character from ['r','p','s']
//        step 3: use the below game logic and if-else statements and display the result who win
//        https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors#/media/File:Rock-paper-scissors.svg
//
//        e.g:
//        input :
//        select a character (r)ock, (p)aper , (s)cissors
//        s
//        computer has selected
//        p
//        User win

package com.apex.util;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by sneha on 2/25/19.
 */
public class RockPaperScissorGame {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("input: ");
//        System.out.println("Select a character (r)ock, (p)aper, (s)cissors :");
//        String userInput = input.next().toLowerCase();
//
//
//        String[] arr = new String[] {"r", "p", "s"};
//        Random rand = new Random();
//        int randomIndex = rand.nextInt(arr.length);
//
//        String compGenerate = arr[randomIndex];
//
//        System.out.println("Computer has selected: ");
//        System.out.println(compGenerate);
//
//
//        if (userInput.equals(compGenerate)) {
//            System.out.println("It's tie");
//        } else if (userInput.equals("s")){
//            if (compGenerate.equals("p")) {
//                System.out.println("User wins");
//            } else{
//                System.out.println("Computer wins");
//            }
//
//        } else if (userInput.equals("p")) {
//            if (compGenerate.equals("s")) {
//                System.out.println("Computer Wins");
//            }else {
//                System.out.println("User wins");
//            }
//
//        } else if (userInput.equals("r")){
//            if (compGenerate.equals("s")) {
//                System.out.println("User wins");
//            } else {
//                System.out.println("Computer wins");
//            }
//        } else {
//            System.out.println("Invalid input");
//        }
//    }
}
