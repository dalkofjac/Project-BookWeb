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
        allMyBooks = bookInterface.getAllBooks();
    }

    public ArrayList<Book> getAllMyBooks(){
        return allMyBooks;
    }
}