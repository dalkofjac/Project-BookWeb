package main.org.foi.bookweb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class BookDetails {
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
