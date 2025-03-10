//! Write a Java program to define a class `Num` with a single variable and the following methods:  
//!   - `getMethod()`: Initialize the variable.  
//!   - `show()`: Display the value of the variable.  
//!   - `main()`: Entry point of the program


class Num {
    int num;

    void getMethod(int num) {
        this.num = num;
    }

    void show() {
        System.out.println("Value of the variable: " + num);
    }

    public static void main(String[] args) {
        Num num = new Num();
        num.getMethod(100);
        num.show();
    }
}