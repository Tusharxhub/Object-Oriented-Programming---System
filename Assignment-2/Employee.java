// ! wap in java to
//! 1) Define a class Employee with member variables empId, empName, salary, and designation
//! 2) Define a constructor to initialize all variables
//! 3) Define display() method to display the record of an employee
//! 4) Define compare() method to compare the salary of employees and print the name and designation of the highest paid employee
//! 5) Create 2 employee objects, show their records, and find the highest paid employee

public class Employee {
    int empId;
    String empName;
    double salary;
    String designation;

    Employee(int empId, String empName, double salary, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.designation = designation;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Designation: " + designation);
    }

    static void compare(Employee e1, Employee e2) {
        if (e1.salary > e2.salary) {
            System.out.println("Highest Paid Employee: " + e1.empName);
            System.out.println("Designation: " + e1.designation);
        } else {
            System.out.println("Highest Paid Employee: " + e2.empName);
            System.out.println("Designation: " + e2.designation);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(29, "Tushar", 80000, "Manager");
        Employee emp2 = new Employee(11, "Abhishek", 60000, "Developer");

        System.out.println("Employee 1 Details:");
        emp1.display();
        System.out.println();

        System.out.println("Employee 2 Details:");
        emp2.display();
        System.out.println();

        compare(emp1, emp2);
    }
}