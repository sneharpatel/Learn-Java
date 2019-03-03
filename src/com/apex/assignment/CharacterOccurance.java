//  Read a contents of text file and count how many times letter “a” is available

package com.apex.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.Scanner;


/**
 * Created by sneha on 3/1/19.
 */
public class CharacterOccurance {

    public static void main(String[] args) throws FileNotFoundException {
        final int a;
        CharacterOccurance numberOfTimes = new CharacterOccurance();
        String str = "a";
        a = numberOfTimes.CharacterOccurance(str);
        System.out.println(str + " is available for " +a+ " times");

    }

    public int CharacterOccurance(String l) throws FileNotFoundException {

        int total = 0;
        File file = new File("/Users/sneha/Desktop/javatest.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()){
            String tmp = inputFile.next();
            String tmp1 = tmp.toLowerCase();

            for (int i=0; i<tmp1.length(); i++){
                char c = tmp1.charAt(i);
                if (c == l.charAt(0)) {
                    total += 1;
                }
            }
        }
        inputFile.close();
        return total;
    }

}
