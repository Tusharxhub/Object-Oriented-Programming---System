//! Wap in java to define the classes add, sub, division, mod are child classes of the thread class. All the classes have two member variables which are initialized using constructor of respective classes. Priority of each class has to be set based on user choice. Depending on the priority the run method of each classes will be invoked and print the respective result of operation.

import java.util.Scanner;

class Operation extends Thread {
    int a, b;
    String type;

    Operation(int a, int b, String type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }

    public void run() {
        switch (type) {
            case "Add": System.out.println("Addition: " + (a + b)); break;
            case "Sub": System.out.println("Subtraction: " + (a - b)); break;
            case "Div": System.out.println(b != 0 ? "Division: " + ((double) a / b) : "Division by zero is not allowed."); break;
            case "Mod": System.out.println("Modulus: " + (b != 0 ? a % b : "Undefined")); break;
        }
    }
}

public class MainY {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        Operation add = new Operation(a, b, "Add");
        Operation sub = new Operation(a, b, "Sub");
        Operation div = new Operation(a, b, "Div");
        Operation mod = new Operation(a, b, "Mod");

        System.out.print("Enter priority for Addition (1-10): "); add.setPriority(sc.nextInt());
        System.out.print("Enter priority for Subtraction (1-10): "); sub.setPriority(sc.nextInt());
        System.out.print("Enter priority for Division (1-10): "); div.setPriority(sc.nextInt());
        System.out.print("Enter priority for Modulus (1-10): "); mod.setPriority(sc.nextInt());

        add.start(); sub.start(); div.start(); mod.start();
    }
}
