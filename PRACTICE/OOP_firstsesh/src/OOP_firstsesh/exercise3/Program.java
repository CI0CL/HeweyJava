package OOP_firstsesh.exercise3;

import java.util.List;

public class Program {

    // Final static meaning that they don't change, and are accessible from outside the instance of the class
    final static String DB_HOST = "jdbc:mysql://localhost:3306/bookstore_jdbc_ex1";
    final static String DB_USER = "createment";
    final static String DB_PASS = "createment";

    public static void main(String[] args) {
        // Calls class Database, names the instance booksDatabase, takes 3 parameters
        Database booksDatabase = new Database(DB_HOST, DB_USER, DB_PASS);
        // Creates new Bookshop class, names the object 'shop', and takes booksDatabase (the previous called class) as parameter.
        BookShop shop = new BookShop(booksDatabase);

        // creates list called book, which takes an instance of class Book?
        List<Book> books = shop.loadBooks();
        // shop.loadBooks() should return a list
        printResult(books);
        // printResult takes the list returned by shop.loadbooks and prints it out acccording to set String template
    }

    private static void printResult(List<Book> books) {
        for (Book book : books) {
            System.out.println("Book ID: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}