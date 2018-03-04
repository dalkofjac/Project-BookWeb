package main.org.foi.bookweb;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@Named
@SessionScoped
public class BookDetails implements Serializable {
    @Inject
    private BookInterface bookInterface;

    private Book myBook;

    private int bookId;

    public void loadTheBook(){
        myBook = bookInterface.getTheBook(bookId);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Book getMyBook(){
        return myBook;
    }
}
