//!   Write a Java program to create a package library. Create a class Book in the package library with variables bookType and accountNumber. Initialize the variables with a constructor. Create a package storeBookDetails which is a child class of Book. It has the variables title, author, and editor. Initialize the variables with a constructor. Define a display method to show the record of a book that includes bookType, accountNumber, title, author, and editor.




package library;

public class Book {
    public String book_type;
    public int account_number;

    public Book(String book_type, int account_number) {
        this.book_type = book_type;
        this.account_number = account_number;
    }
}