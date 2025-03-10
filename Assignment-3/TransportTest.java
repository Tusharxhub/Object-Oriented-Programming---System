//! wap in java to define a class Transport with child class of roadT.Both the classes have a single variable. Use constructor to initialize all the variables and constructor.RoadT has two children Bus and car with single veriable in each class.Bus and car contain constructor to initialize the object and show method to display the record of Bus and car.

class Transport {
    String mode;

    Transport(String mode) {
        this.mode = mode;
    }
}

class RoadT extends Transport {
    int roadnumber;

    RoadT(String mode, int roadnumber) {
        super(mode);
        this.roadnumber = roadnumber;
    }
}

class Bus extends RoadT {
    int busNumber;

    Bus(String mode, int roadnumber, int busNumber) {
        super(mode, roadnumber);
        this.busNumber = busNumber;
    }

    void show() {
        System.out.println("Model: " + mode + ", Road No: " + roadnumber + ", Bus No: " + busNumber);
    }
}

class Car extends RoadT {
    String model;

    Car(String mode, int roadnumber, String model) {
        super(mode, roadnumber);
        this.model = model;
    }

    void show() {
        System.out.println("Model: " + mode + ", Road No: " + roadnumber + ", Car Model: " + model);
    }
}

public class TransportTest {
    public static void main(String[] args) {
        Bus bus = new Bus("Road", 101, 555);
        Car car = new Car("Road", 102, "Tesla");

        bus.show();
        car.show();
    }
}