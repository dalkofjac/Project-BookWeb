package main.org.foi.bookweb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;

@Named
@RequestScoped
public class BookService {
    @Inject
    private BookInterface bookInterface;

    private Book myBook;

    private ArrayList<Book> allMyBooks;

    @PostConstruct
    public void init(){
        myBook = bookInterface.getTheBook();
        allMyBooks = bookInterface.getAllBooks();
    }

    public Book getMyBook(){
        return myBook;
    }

    public ArrayList<Book> getAllMyBooks(){
        return allMyBooks;
    }
}