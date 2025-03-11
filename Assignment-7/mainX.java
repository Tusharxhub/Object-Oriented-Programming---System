//! Wap in Java to define two classes which are implementing an interface. Print the sum of the numeric series in the given method of the class. Create objects of both the classes in main method and display() the respective series using threads.

interface Series {
    void display();
}

class ArithmeticSeries implements Series, Runnable {
    int n;

    ArithmeticSeries(int n) {
        this.n = n;
    }

    public void display() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of Arithmetic series up to " + n + " terms: " + sum);
    }

    public void run() {
        display();
    }
}

class GeometricSeries implements Series, Runnable {
    int n;
    int r;

    GeometricSeries(int n, int r) {
        this.n = n;
        this.r = r;
    }

    public void display() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(r, i);
        }
        System.out.println("Sum of Geometric series up to " + n + " terms: " + sum);
    }

    public void run() {
        display();
    }
}

public class mainX {
    public static void main(String[] args) {
        ArithmeticSeries as = new ArithmeticSeries(5);
        GeometricSeries gs = new GeometricSeries(5, 2);

        Thread t1 = new Thread(as);
        Thread t2 = new Thread(gs);

        t1.start();
        t2.start();
    }
}