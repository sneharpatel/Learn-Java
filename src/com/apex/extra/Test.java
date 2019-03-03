package com.apex.extra;

/**
 * Created by sneha on 3/1/19.
 */
public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        DisplayServiceI displayServiceI = null;
        displayServiceI = new PrinterDisplayService();
        displayServiceI.display();
        displayServiceI.echo();
        DisplayServiceI displayServiceI2 = new MonitorDisplayService();
        displayServiceI2.display();
        displayServiceI2.echo();
    }
}
