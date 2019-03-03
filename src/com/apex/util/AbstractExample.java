package com.apex.util;

/**
 * Created by sneha on 2/24/19.
 */
public class AbstractExample {
    public static void main(String[] args) {
//        Circle circle = new Circle(10);
//        System.out.println(circle.area());
//        Square square = new Square(10);
//        System.out.println(circle.area());
        Shape shape = null;

        shape = new Circle(10, "Red");  // parent object can point to child object memory
        System.out.println("Area : "+shape.area());
        shape.display();
        System.out.println(shape);
//        display(shape);

        shape = new Square(10);  // parent object can point to child object memory
        System.out.println("Area : "+shape.area());
        shape.display();
        System.out.println(shape);
//        display(shape);

    }

//    public static void display(Shape shape) {
//        System.out.println("Area : "+shape.area());
//        System.out.println(shape);   // memory location
//    }

}


abstract class Shape { //no object creation

    String color;

    public Shape(String color) {
        this.color = color;
    }
    public Shape() {
        this.color = "black";
    }
    abstract double area();  // child class has implementation

    void display() {
        System.out.println("Color : "+ color);
    }

}

class Circle extends Shape {  // data + method - constructor
    double r;
    public  Circle() { }

    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    public Circle(double r) {
        super("Blue"); // 'super constructor' must be first line of constructor
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }


}

class Square extends Shape {
    double a;
    public Square() { }
    public Square(double a) {
        this.a = a;
    }

    double area() {
        return a * a;
    }
}
