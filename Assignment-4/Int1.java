//! wap in java to implements the interface in a single class.

interface Int1 {
    void display();
    void calculate();
}

class Name implements Int1 {
    public void display() {
        System.out.println("Displaying information.........");
    }

    public void calculate() {
        System.out.println("Performing calculations.........");
    }

    public void additionalFeature() {
        System.out.println("Executing an additional feature.........");
    }

    public static void main(String[] args) {
        Name name = new Name();
        name.display();
        name.calculate();
        name.additionalFeature();
    }
}




// ?   To run the code, run the following commands:
// ?   javac Int1.java
// ?   java Name