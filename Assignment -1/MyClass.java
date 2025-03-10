//! Write a Java program using a class. The name of the class is `MyClass` that consists of a single method. Print your name, department, and roll number using that single method.

class MyClass {
    public void printDetails() {
        System.out.println("Name: Tushar");
        System.out.println("Department: Computer Science");
        System.out.println("Roll Number: 029");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.printDetails();
    }
}