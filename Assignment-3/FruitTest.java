//! Write a Java program to define a fruit with member variable name and member methods get name show name define a child class orange of fruit class with member variables season and prize and member methods get data and display create object of orange class and display the records

class Fruit {
    String name;
    double price;

    void setDetails(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Fruit Price: " + price);
    }
}

class Orange extends Fruit {
    String variety;

    void setVariety(String variety) {
        this.variety = variety;
    }

    void display() {
        super.display();
        System.out.println("Orange Variety: " + variety);
    }
}

public class FruitTest {
    public static void main(String[] args) {
        Orange obj = new Orange();
        obj.setDetails("Orange", 50.0);
        obj.setVariety("Nagpur");
        obj.display();
    }
}