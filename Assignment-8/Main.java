//! Wap in java to enter java program to define a class "Item" with member variables name, quantity, price as string, int, double variables. Define a method getData() to take input using the Buffer reader in all the variables. Define a method showData() to display the record of the item. Define a method calPrice() to find the total price of three items taken input from user

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Item {
    String name;
    int quantity;
    double price;

    void getData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the name of the item: ");
            name = br.readLine();
            System.out.print("Enter the quantity of the item: ");
            quantity = Integer.parseInt(br.readLine());
            System.out.print("Enter the price of the item: ");
            price = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    void showData() {
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    double calPrice() {
        return quantity * price;
    }
}

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        item1.getData();
        item2.getData();
        item3.getData();

        item1.showData();
        item2.showData();
        item3.showData();

        System.out.println("Total price of all items: " + (item1.calPrice() + item2.calPrice() + item3.calPrice()));
    }
}


// ?  To compile the program, run the following command:
// ?  javac Main.java
//?   To run the program, run the following command:
//?   java Main