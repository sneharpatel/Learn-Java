//  Define a arrary with 10 integers and print all the elements with its index number.
package com.apex.assignment;

/**
 * Created by sneha on 2/28/19.
 */
public class PrintArrayElementWithIndex {
    public static void main(String[] args){
        PrintArrayElementWithIndex array = new PrintArrayElementWithIndex();
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        array.createAnArray(intArray);
    }


    public void createAnArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element at index " +i+ " is " + array[i]);
        }
    }
}
