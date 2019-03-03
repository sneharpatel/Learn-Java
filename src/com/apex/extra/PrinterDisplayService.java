package com.apex.extra;

/**
 * Created by sneha on 3/1/19.
 */
public class PrinterDisplayService implements DisplayServiceI {
    public PrinterDisplayService() {
    }

    public void echo() {
        System.out.println("welcome in");
    }

    public void display() {
        System.out.println("inside PrinterDisplayService");
    }
}
