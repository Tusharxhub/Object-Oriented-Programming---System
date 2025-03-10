//! To create of two classes, Mammal and Reptile, and two child classes, Cat and Tiger, each with a single variable, the constructor is used to initialize the variables and a display method is defined to display the variables. The methods are used to display in class.

class Animal {
    String type;

    Animal(String type) {
        this.type = type;
    }

    void display() {
        System.out.println("Type: " + type);
    }
}

class Mammal extends Animal {
    Mammal(String type) {
        super(type);
    }
}

class Reptile extends Animal {
    Reptile(String type) {
        super(type);
    }
}

class Cat extends Mammal {
    int feet;

    Cat(String type, int feet) {
        super(type);
        this.feet = feet;
    }

    void display() {
        super.display();
        System.out.println("Cat has " + feet + " feet");
    }
}

class Tiger extends Mammal {
    int feet;

    Tiger(String type, int feet) {
        super(type);
        this.feet = feet;
    }

    void display() {
        super.display();
        System.out.println("Tiger has " + feet + " feet");
    }
}

class Lizard extends Reptile {
    double length;

    Lizard(String type, double length) {
        super(type);
        this.length = length;
    }

    void display() {
        super.display();
        System.out.println("Lizard length: " + length + " meters");
    }
}

class Crocodile extends Reptile {
    double length;

    Crocodile(String type, double length) {
        super(type);
        this.length = length;
    }

    void display() {
        super.display();
        System.out.println("Crocodile length: " + length + " meters");
    }
}

public class AnimalY {
    public static void main(String[] args) {
        Cat cat = new Cat("Mammal", 4);
        Tiger tiger = new Tiger("Mammal", 4);
        Lizard lizard = new Lizard("Reptile", 0.5);
        Crocodile crocodile = new Crocodile("Reptile", 3.5);

        cat.display();
        System.out.println();
        tiger.display();
        System.out.println();
        lizard.display();
        System.out.println();
        crocodile.display();
    }
}


