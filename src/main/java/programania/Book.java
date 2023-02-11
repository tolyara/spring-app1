package programania;

import org.springframework.beans.factory.annotation.Value;

public class Book {

    @Value("Book 1")
    private String name;

    @Value("Author 1")
    private String author;

    @Value("Year 1")
    private int year;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

}
