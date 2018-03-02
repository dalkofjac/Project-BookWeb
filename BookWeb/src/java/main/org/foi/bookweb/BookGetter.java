package main.org.foi.bookweb;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BookGetter implements BookInterface {

    private Book book;

    public void loadBook(){
        book = new Book();
        book.setName("Harry Potter: The Chamber of Secrets");
        book.setAuthor("J.K.Rowling");
        book.setNumberOfPages(520);
    }

    @Override
    public Book getTheBook() {
        loadBook();
        return book;
    }
}
