package OOP_firstsesh.exercise3;
import java.sql.*;
import java.util.*;

public class Database {
    private final String host;

    private final String user;

    private final String password;

    public Database(String host, String user, String password) {
        this.host = host;
        this.user = user;
        this.password = password;
    }

    public List<Book> executeQuery(String sql) {
        try {
            Connection connection = DriverManager.getConnection(host, user, password);
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            return procesData(resultSet);

        } catch (SQLException e) {
            System.out.println("An error occurred while executing SQL query");
            throw new RuntimeException();
        }
    }
    private List<Book> procesData(ResultSet resultSet) throws SQLException {
        List<Book> books = new ArrayList<>();

        while (resultSet.next()) {
            Book book = new Book(
                    resultSet.getString("id"),
                    resultSet.getString("title"));

            books.add(book);
        }
        return books;
    }
}