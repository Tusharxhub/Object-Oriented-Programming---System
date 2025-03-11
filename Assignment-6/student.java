//! Write a Java program to define a student class with variables studentName, studentProgram, and studentSemester. Define a getData method to take input the record of a student from the user using BufferedReader to take inputs from the user. Handle the exceptions that occur here using IOException. Handle the exception using the throw keyword. Define a show method to print the record of three students.

import java.io.*;

class Student {
    String studentName;
    String studentProgram;
    int studentSemester;

    void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the student: ");
        studentName = br.readLine();
        System.out.println("Enter the program of the student: ");
        studentProgram = br.readLine();
        System.out.println("Enter the semester of the student: ");
        studentSemester = Integer.parseInt(br.readLine());
    }

    void show() {
        System.out.println("Name: " + studentName);
        System.out.println("Program: " + studentProgram);
        System.out.println("Semester: " + studentSemester);
    }

    public static void main(String[] args) throws IOException {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.getData();
        s2.getData();
        s3.getData();
        s1.show();
        s2.show();
        s3.show();
    }
}


//? To compile the program, use the following command:
//? javac student.java
//? To run the program, use the following command:
//? java Student