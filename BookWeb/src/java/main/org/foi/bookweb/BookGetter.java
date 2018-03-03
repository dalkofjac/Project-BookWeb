package main.org.foi.bookweb;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class BookGetter implements BookInterface {

    private Book book;
    private ArrayList<Book> bookList;

    public void loadBook(){
        book = new Book();
        book.setName("Harry Potter: The Chamber of Secrets");
        book.setAuthor("J.K.Rowling");
        book.setNumberOfPages(520);
        book.setImgName("hp_second");
    }

    public void loadAllBooks(){
        bookList = new ArrayList<>();
        bookList.add(new Book("Harry Potter and the Philosopher's Stone",520, "J.K.Rowling", "hp_first"));
        bookList.add(new Book("Harry Potter and the Chamber of Secrets",610, "J.K.Rowling", "hp_second"));
        bookList.add(new Book("Harry Potter and the Prisoner of Azkaban",514, "J.K.Rowling", "hp_third"));
        bookList.add(new Book("Harry Potter and the Goblet of Fire",490, "J.K.Rowling", "hp_forth"));
        bookList.add(new Book("Harry Potter and the Order of the Phoenix",660, "J.K.Rowling", "hp_fifth"));
    }

    @Override
    public Book getTheBook() {
        loadBook();
        return book;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        loadAllBooks();
        return bookList;
    }
}
