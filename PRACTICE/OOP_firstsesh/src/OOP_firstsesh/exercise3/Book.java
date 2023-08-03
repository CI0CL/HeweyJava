package OOP_firstsesh.exercise3;

import java.beans.ConstructorProperties;

public class Book {
    private String id;
    private String title;

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}