// Siddhesh Ballal 
// 11 March 2022

//Assignment 1
// Design a class ‘Complex’ with data members for real and imaginary part. Provide default and
// Parameterized constructors. Write a program to perform arithmetic operations of two complex numbers.

import java.util.Scanner;
import java.lang.Math;

class Complex {
    double real, imaginary;

    Complex() {
        imaginary = real = 0;
    }

    Complex(int r, int i) {
        real = r;
        imaginary = i;
    }

    public 
    
    static Complex Add(Complex n1, Complex n2) {
        Complex temp = new Complex();
        temp.real = n1.real + n2.real;
        temp.imaginary = n1.imaginary + n2.imaginary;
        return temp;
    }

    static Complex Subtract(Complex n1, Complex n2) {
        Complex temp = new Complex();
        temp.real = n1.real - n2.real;
        temp.imaginary = n1.imaginary - n2.imaginary;
        return temp;
    }

    static Complex Multiply(Complex n1, Complex n2) {
        Complex temp = new Complex();
        temp.real = ((n1.real * n2.real) - (n1.imaginary * n2.imaginary));
        temp.imaginary = ((n1.real * n2.imaginary) + (n2.real * n1.imaginary));
        return temp;
    }

    static Complex Divide(Complex n1, Complex n2) {
        Complex temp = new Complex();
        temp.real = ((n1.real * n2.real)+(n1.imaginary * n2.imaginary))/(Math.pow(n2.real, 2) + Math.pow(n2.imaginary, 2));
        temp.imaginary = ((n1.imaginary * n2.real)-(n1.real * n2.imaginary))/(Math.pow(n2.real, 2) + Math.pow(n2.imaginary, 2));
        return temp;    
    }

    void printdata() {
        System.out.println(real + " + " + imaginary + " i\n");
    }
}

public class Assignment_1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int x, y;
        System.out.println("Enter real and imaginary values of first complex number: ");
        x = S.nextInt();
        y = S.nextInt();
        Complex c1 = new Complex(x,y);
        System.out.println("Enter real and imaginary values of second complex number: ");
        x = S.nextInt();
        y = S.nextInt();
        Complex c2 = new Complex(x,y);

        System.out.println("The Complex numbers are: ");
        c1.printdata();
        c2.printdata();

        //Sum:
        Complex Sum = new Complex();
        Sum = Complex.Add(c1, c2);
        System.out.println("Sum of the complex numbers is: ");
        Sum.printdata();  
        
        //Difference:
        Complex Difference = new Complex();
        Difference = Complex.Subtract(c1, c2);
        System.out.println("Difference of the complex numbers is: ");
        Difference.printdata();  
        
        //Multiplication:
        Complex Product = new Complex();
        Product = Complex.Multiply(c1, c2);
        System.out.println("Product of the complex numbers is: ");
        Product.printdata();  

        //Division
        Complex Quotient = new Complex();
        Quotient = Complex.Divide(c1, c2);
        System.out.println("Quotient of the complex numbers is: ");
        Quotient.printdata();  

        S.close();
    }
}