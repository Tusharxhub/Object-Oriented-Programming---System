//!  create a java program to implementing interface and create a main class with main method to run the program.


interface Arithmetic {
    int doadd(int a, int b);
    int dosub(int a, int b);
    double dodiv(int a, int b);
}

class Calculator implements Arithmetic {
    public int doadd(int a, int b) {
        return a + b;
    }

    public int dosub(int a, int b) {
        return a - b;
    }

    public double dodiv(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.doadd(10, 5));
        System.out.println("Subtraction: " + calc.dosub(10, 5));
        System.out.println("Division: " + calc.dodiv(10, 5));
    }
}
// ?   To run the code, run the following commands: 
// ?   javac Main.java
// ?   java Calculator