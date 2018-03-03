package main.org.foi.bookweb;

import java.util.ArrayList;

public interface BookInterface {
    public Book getTheBook(int id);
    public ArrayList<Book> getAllBooks();
}
