package Store_book;

public class Main {
    public static void main(String[] args) {
        BookDetail bookDetail = new BookDetail("Poetry", 67890, "Gitanjali", "Rabindranath Tagore", "Macmillan Publishers");
        bookDetail.display();
    }
}




// ? To compile and run the above program, you need to compile both the classes. To compile the classes, you need to use the following commands:
//? javac library\Book.java Store_book\BookDetail.java Store_book\Main.java
//? java Store_book.Main
