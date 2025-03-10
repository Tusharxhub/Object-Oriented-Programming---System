//! Define a class transport with variable transport and name define the class road transport water transport air transport that are the children of class transport which distinct single variable in each class define the show method in each of the child classes to display the record of each type of transport

class Transport {
    String transport;
    String name;

    Transport(String transport, String name) {
        this.transport = transport;
        this.name = name;
    }
}

class Road extends Transport {
    int wheels;

    Road(String transport, String name, int wheels) {
        super(transport, name);
        this.wheels = wheels;
    }

    void show() {
        System.out.println("Road Transport: " + name + ", Wheels: " + wheels);
    }
}

class Water extends Transport {
    int capacity;

    Water(String transport, String name, int capacity) {
        super(transport, name);
        this.capacity = capacity;
    }

    void show() {
        System.out.println("Water Transport: " + name + ", Capacity: " + capacity + " tons");
    }
}

class Air extends Transport {
    int maxAltitude;

    Air(String transport, String name, int maxAltitude) {
        super(transport, name);
        this.maxAltitude = maxAltitude;
    }

    void show() {
        System.out.println("Air Transport: " + name + ", Max Altitude: " + maxAltitude + " feets");
    }
}

public class TransportTest {
    public static void main(String[] args) {
        Road road1 = new Road("Road", "Car", 4);
        Water water1 = new Water("Water", "Ship", 500);
        Air air1 = new Air("Air", "Aeroplane", 35000);

        road1.show();
        water1.show();
        air1.show();
    }
}