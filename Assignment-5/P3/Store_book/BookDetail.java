package Store_book;
import library.Book;

public class BookDetail extends Book {
    public String title;
    public String author;
    public String editor;

    public BookDetail(String book_type, int account_number, String title, String author, String editor) {
        super(book_type, account_number);
        this.title = title;
        this.author = author;
        this.editor = editor;
    }

    public void display() {
        System.out.println("Book Type: " + book_type);
        System.out.println("Account Number: " + account_number);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Editor: " + editor);
    }
}