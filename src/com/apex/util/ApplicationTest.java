package com.apex.util;

/**
 * Created by sneha on 2/24/19.
 */
public class ApplicationTest {
    public static void main(String[] agrs) {
        ApplicationForm applicationForm1 = new ApplicationForm();
        applicationForm1.display();
//        System.out.println(ApplicationForm.companyName);
//        System.out.println(applicationForm1);

        ApplicationForm applictionForm2 = new ApplicationForm("abd", "xyz", 1990);
//        qpplictionForm2.firstName = "abc";
//        qpplictionForm2.lastName = "xyz";
//        qpplictionForm2.year = 1990;
        applictionForm2.display();
//        System.out.println(ApplicationForm.companyName);
//        System.out.println(applictionForm2);
        ApplicationForm.echo();

    }
}