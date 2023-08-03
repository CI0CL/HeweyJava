package OOP_firstsesh.exercise1;

import java.io.*;
import java.util.*;
import java.sql.*;


public class Main {

    public static void main(String[] args) {
        List<Map<String,String>> books = LoadBooksFromDb();
        System.out.println(books);

        for (Map<String, String> book : books){
            for (String b : book.values()){
                System.out.println(b);
            }
        }

    }

    static List<Map<String, String>> LoadBooksFromDb() {
       List <Map<String,String>> books = new ArrayList();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookstore_jdbc_ex1", "createment", "createment");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM books");

            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String ISBN = rs.getString("isbn");
                String author = rs.getString("author");
                double price = rs.getDouble("price");
                String location = rs.getString("location");

                Map<String, String> book = new HashMap<>();
                book.put("title", title);
                book.put("author", author);
                book.put("price", String.valueOf(price));

                books.add(book);


            }
            rs.close();
            stmt.close();
            conn.close();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}