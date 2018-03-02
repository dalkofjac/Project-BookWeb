package main.org.foi.bookweb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class BookService {
    @Inject
    private BookInterface bookInterface;

    private Book myBook;

    @PostConstruct
    public void init(){
        myBook = bookInterface.getTheBook();
    }

    public Book getMyBook(){
        return myBook;
    }
}