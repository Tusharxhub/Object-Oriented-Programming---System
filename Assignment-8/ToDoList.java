//! write a java program to define a class To-Do-List that consists of a member variable task in a vector type. the methods are 1:- addTask() to get input from user and add to the task vector. 2:- showTask() to show each task in a tabular format with serial number. 3:- insertTask() to insert a new task at given index by the user. 4:- delTask() to delete the specific task given by the user.After insertTask and delTask call showTask .


import java.util.Scanner;
import java.util.Vector;

public class ToDoList {
    private Vector<String> tasks;

    public ToDoList() {
        tasks = new Vector<>();
    }

    public void addTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a new task: ");
        String task = scanner.nextLine();
        tasks.add(task);
    }

    public void showTasks() {
        System.out.println("To-Do List:");
        System.out.println("-----------");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void insertTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index to insert the task: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter the new task: ");
        String task = scanner.nextLine();
        if (index >= 0 && index <= tasks.size()) {
            tasks.add(index, task);
        } else {
            System.out.println("Invalid index.");
        }
        showTasks();
    }

    public void delTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the task to delete: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
        showTasks();
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3. Insert Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    toDoList.addTask();
                    break;
                case 2:
                    toDoList.showTasks();
                    break;
                case 3:
                    toDoList.insertTask();
                    break;
                case 4:
                    toDoList.delTask();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}