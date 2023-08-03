import java.io.*;
import java.sql.*;

public class CSVtoSQL {
    public static void main(String[] arg){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookstore_jdbc_ex1", "createment", "createm ent");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM `books`");
            
            BufferedReader reader = new BufferedReader(new FileReader("output.csv"));
            String line;
            while ((line = reader.readLine())!= null){
                String[] fields = line.split(",");
                for(String field : fields){
                    System.out.print(field +"\t");
                }
                System.out.println();
            }
            reader.close();
            conn.close();
            stmt.close();
            rs.close();
        } catch (ClassNotFoundException | SQLException | IOException e){
            e.printStackTrace();
        }
    }
}
