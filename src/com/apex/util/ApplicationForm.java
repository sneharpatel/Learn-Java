package com.apex.util;

/**
 * Created by sneha on 2/24/19.
 */
public class ApplicationForm {
    // static
    private static String companyName = "Google";
    //non-static (or) instance
    private String firstName, lastName;
    private int year;

    public ApplicationForm(){
        firstName = "apex";
        lastName = "nmk";
        year = 1980;
    }

    public ApplicationForm(String fName, String lName, int y){
        this.firstName = fName; // this => currentObject, this keyword used when calling instant variable
        this.lastName = lName;
        this.year = y;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //non-static (or) instance
    public int getAge() {
        int CURRENT_AGE = 2019;  // local variable
        return (CURRENT_AGE - year);
    }

    public static void echo(){
        System.out.println("Static Method");
        System.out.println("Static content - company name: " +ApplicationForm.companyName);
    }

    public void display() {
        System.out.println("firstname : " +firstName);
        System.out.println("lastname : " +lastName);
        System.out.println("year : " +year);
        System.out.println("Age : " +getAge());
    }

}

