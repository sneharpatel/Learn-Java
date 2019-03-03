package com.apex.extra;

/**
 * Created by sneha on 3/1/19.
 */
public interface DisplayServiceI {
    void display();
    default void echo() {
        System.out.println("Face-login doesn't support");
    }
}
