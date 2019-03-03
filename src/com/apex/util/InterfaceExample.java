package com.apex.util;

/**
 * Created by sneha on 3/1/19.
 */
public class InterfaceExample {
    public InterfaceExample(){

    }

    public static void main(String[] args) {
        A a = new A();
        a.display();
        C c = new C();
        c.display();
        c.echo();
        System.out.println("Constant : 23");
    }
}
