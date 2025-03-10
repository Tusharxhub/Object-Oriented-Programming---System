//! Define a class vehicle with one member variable type initialize the variable with constructor define a class car with the number variable model and price initialize thevariable with constructor define a method display() in car class to show the record of a car

class Vehicle {
    String type;

    Vehicle(String type) {
        this.type = type;
    }
}

class Car extends Vehicle {
    String model;
    int price;

    Car(String type, String model, int price) {
        super(type);
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Type: " + type + ", Model: " + model + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Sedan", "Toyota Camry", 30000);
        car.display();
    }
}
