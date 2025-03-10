//!Write a Java program to define a class `Arithmetic` with 2 member variables and the following methods:  
//! - `add()`: To sum 2 numbers and print the result.  
//! - `sub()`: To subtract 2 numbers and print the result.  
//! - `multiply()`: To multiply 2 numbers and print the result.  
//! - `division()`: To divide 2 numbers and print the result.  
//! - `get(int, int)`: To set the values of the variables.


public class Arithmatic {
    int a, b;

    public void get(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
    }

    public void sub() {
        System.out.println("Subtraction of " + a + " and " + b + " is " + (a - b));
    }

    public void multiply() {
        System.out.println("Multiplication of " + a + " and " + b + " is " + (a * b));
    }

    public void division() {
        System.out.println("Division of " + a + " and " + b + " is " + (a / b));
    }

    public static void main(String[] args) {
        Arithmatic obj = new Arithmatic();
        obj.get(10, 5);
        obj.add();
        obj.sub();
        obj.multiply();
        obj.division();
    }
}