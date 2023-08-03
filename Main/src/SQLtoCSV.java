import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SQLtoCSV{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookstore_jdbc_ex1", "createment", "createment");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `books`");
            PrintWriter writer = new PrintWriter(new FileWriter("output.csv"));

             String[] array = new Array();

            while (rs.next()) {
                int id = rs.getInt("id");
                long ISBN = rs.getLong("isbn");
                String title = rs.getString("title");
                String author = rs.getString("author");
                double price = rs.getDouble("price");
                String location = rs.getString("location");

                array.add(price);





            }
            rs.close();
            stmt.close();
            conn.close();


        } catch (ClassNotFoundException | SQLException | IOException e){
            e.printStackTrace();

        }
    }

}
