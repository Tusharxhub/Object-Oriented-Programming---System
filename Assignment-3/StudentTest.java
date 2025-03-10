//! Define a class student with member variable name, roll, reg. Define two child classes UGstudent and PGstudent with a single variable in each class. Use constructor to initialize all the variables. Use display method in UGstudent and PGstudent classes to display the record of student.

class Student {
    String name, reg;
    int roll;

    Student(String name, int roll, String reg) {
        this.name = name;
        this.roll = roll;
        this.reg = reg;
    }

    void display() {
        System.out.println("Name: " + name + "\nRoll: " + roll + "\nReg: " + reg);
    }
}

class UGstudent extends Student {
    int semester;

    public UGstudent(String name, int roll, String reg, int semester) {
        super(name, roll, reg);
        this.semester = semester;
    }

    void display() {
        super.display();
        System.out.println("Semester: " + semester);
    }
}

class PGstudent extends Student {
    String specialization;

    public PGstudent(String name, int roll, String reg, String specialization) {
        super(name, roll, reg);
        this.specialization = specialization;
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        UGstudent ugStudent = new UGstudent("Tushar", 123, "UG2025", 4);
        PGstudent pgStudent = new PGstudent("Aditya", 321, "PG2025", "Computer Science");

        System.out.println("UG Student Details:");
        ugStudent.display();
        System.out.println();

        System.out.println("PG Student Details:");
        pgStudent.display();
    }
}