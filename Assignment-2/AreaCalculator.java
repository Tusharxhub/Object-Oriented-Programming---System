//! Create a Java class `Area` with member variables `radius` for the circle and `side` for the square, define an overloaded method `calArea()` to calculate the area of a circle using the formula πr² and the area of a square using the formula side², include a `show()` method to display the calculated results, and in the `main()` method, take user input for both `radius` and `side`, pass these values to the `calArea()` method, and display the results using the `show()` method.



import java.util.Scanner;

public class AreaCalculator {

    public double calArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calArea(int side) {
        return side * side;
    }

    public void show(double circleArea, double squareArea) {
        System.out.println("Area of circle is: " + circleArea);
        System.out.println("Area of square is: " + squareArea);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();

        AreaCalculator obj = new AreaCalculator();
        double circleArea = obj.calArea(radius);
        double squareArea = obj.calArea(side);

        obj.show(circleArea, squareArea);

        sc.close();
    }
}