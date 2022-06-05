// A106 Siddhesh Ballal
// 6 May 2022

// Assignment 5
// Design a base class shape with two double type values and member functions to input the data and
// compute_area() for calculating area of figure. Derive two classes’ triangle and rectangle. Make
// compute_area() as abstract function and redefine this function in the derived class to suit their
// requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area.
// Implement dynamic binding for given case study

import java.util.Scanner;
import java.math.*;

abstract class Shape {
    abstract public void PrintArea();
}

class Rectangle extends Shape {
    double length, breadth, Rectangle_Area;

    public void PrintArea() {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        length = S.nextInt();

        System.out.println("Enter the breadth of the Rectangle: ");
        breadth = S.nextDouble();

        Rectangle_Area = length * breadth;
        System.out.println("The Area of the Rectangle is: " + Rectangle_Area);
    }
}

class Triangle extends Shape {
    double base, height, Triangle_Area;

    public void PrintArea() {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the base of the Triangle: ");
        base = S.nextInt();

        System.out.println("Enter the height of the Triangle: ");
        height = S.nextInt();

        Triangle_Area = 0.5 * base * height;
        System.out.println("The Area of the Triangle is: " + Triangle_Area);
    }
}

class Circle extends Shape {
    double radius, Circle_Area;

    public void PrintArea() {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius of the Triangle: ");
        radius = S.nextInt();

        Circle_Area = Math.PI * Math.pow(radius, 2);
        System.out.println("The Area of the Circle is: " + Circle_Area);
    }
}

public class Assignment_5 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        rectangle.PrintArea();
        triangle.PrintArea();
        circle.PrintArea();
    }
}
