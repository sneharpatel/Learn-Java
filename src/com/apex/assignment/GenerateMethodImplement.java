package com.apex.assignment;
import java.util.ArrayList;

/**
 * Created by sneha on 3/1/19.
 */
public class GenerateMethodImplement {

    public ArrayList<Integer> generateNumbers(int n) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            x.add(i);
        }
        return x;
    }

    public ArrayList<Integer> GenerateMultipleOfFive(int n){

        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            if (i%5 == 0) {
                y.add(i);
            }
        }
        return y;
    }

    public ArrayList<Integer> generateOddNumbers(int n){
        ArrayList<Integer> z = new ArrayList<Integer>();
        for (int i=0; i<n; i++){
            if (i%3 == 0){
                z.add(i);
            }
        }
        return z;
    }
}
