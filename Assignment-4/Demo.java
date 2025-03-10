//! wap in java to implement a single interface, named "Vehicle" in three classes, define abstract methods, and create a main class to create objects and call their methods.

public class Demo {
    interface Vehicle {
        void displayDetails();
    }

    interface Drivable {
        void drive();
    }

    static class Car implements Vehicle, Drivable {
        String name;
        int year;
        double price;

        Car(String name, int year, double price) {
            this.name = name;
            this.year = year;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Car: " + name + ", " + year + ", " + price);
        }

        public void drive() {
            System.out.println("Driving car...");
        }
    }

    static class Bike implements Vehicle, Drivable {
        String name;
        int year;
        double price;

        Bike(String name, int year, double price) {
            this.name = name;
            this.year = year;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Bike: " + name + ", " + year + ", " + price);
        }

        public void drive() {
            System.out.println("Riding bike...");
        }
    }

    static class Truck implements Vehicle, Drivable {
        String name;
        int year;
        double price;

        Truck(String name, int year, double price) {
            this.name = name;
            this.year = year;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Truck: " + name + ", " + year + ", " + price);
        }

        public void drive() {
            System.out.println("Driving truck...");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota Camry", 2020, 30000);
        Bike bike = new Bike("Yamaha R15", 2019, 15000);
        Truck truck = new Truck("Ford F-150", 2021, 50000);

        car.displayDetails();
        car.drive();

        bike.displayDetails();
        bike.drive();

        truck.displayDetails();
        truck.drive();
    }
}