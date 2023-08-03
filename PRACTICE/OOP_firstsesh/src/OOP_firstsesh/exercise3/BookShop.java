package OOP_firstsesh.exercise3;

import java.util.*;
import java.sql.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookShop {
    private final Database db;

    public BookShop(Database db) {
        this.db = db;
    }

    public List<Book> loadBooks() {
        return db.executeQuery("SELECT * FROM books");
    }


}