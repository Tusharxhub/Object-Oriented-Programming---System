//! wap in java Define a base class Animal, with type as member variable that imply domestic or wild animal. Initialize the variable with get() method. Define a derived class Cat which has two member variables breed and colour. Initialize the variables with set() method. Define show() method in Cat class that show the attributes of a Cat. Define a Main class and create two objects of the Cat class

class Animal {
    String type;

    void get(String type) {
        this.type = type;
    }
}

class Cat extends Animal {
    String breed;
    String color;

    void set(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    void show(String catNumber) {
        System.out.println(catNumber + " Details:");
        System.out.println("Cat type : " + type);
        System.out.println("Breed : " + breed);
        System.out.println("Colour : " + color);
        System.out.println();
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.get("Domestic");
        cat1.set("Persian", "White");

        Cat cat2 = new Cat();
        cat2.get("Wild");
        cat2.set("Lion", "Golden");

        cat1.show("Cat 1");
        cat2.show("Cat 2");
    }
}
