package main.org.foi.bookweb;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class BookGetter implements BookInterface {

    private Book book;
    private ArrayList<Book> bookList;

    public void loadBook(int id){
        loadAllBooks();
        book = new Book();
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getId()==id){
                book = bookList.get(i);
            }
        }
    }

    public void loadAllBooks(){
        bookList = new ArrayList<>();
        bookList.add(new Book(1, "Harry Potter and the Philosopher's Stone",520,
                "J.K.Rowling", "hp_first",
                "Rescued from the outrageous neglect of his aunt and uncle, a young boy with a great destiny " +
                        "proves his worth while attending Hogwarts School of Witchcraft and Wizardry."));
        bookList.add(new Book(2, "Harry Potter and the Chamber of Secrets",610,
                "J.K.Rowling", "hp_second", "Harry ignores warnings not to return to Hogwarts, " +
                "only to find the school plagued by a series of mysterious attacks and a strange voice haunting him."));
        bookList.add(new Book(3, "Harry Potter and the Prisoner of Azkaban",514,
                "J.K.Rowling", "hp_third", "It's Harry's third year at Hogwarts; not only " +
                "does he have a new \"Defense Against the Dark Arts\" teacher, but there is also trouble brewing. " +
                "Convicted murderer Sirius Black has escaped the Wizards' Prison and is coming after Harry."));
        bookList.add(new Book(4, "Harry Potter and the Goblet of Fire",490,
                "J.K.Rowling", "hp_forth", "A young wizard finds himself competing in a hazardous " +
                "tournament between rival schools of magic, but he is distracted by recurring nightmares."));
        bookList.add(new Book(5, "Harry Potter and the Order of the Phoenix",660,
                "J.K.Rowling", "hp_fifth", "With their warning about Lord Voldemort's return " +
                "scoffed at, Harry and Dumbledore are targeted by the Wizard authorities as an authoritarian " +
                "bureaucrat slowly seizes power at Hogwarts."));
    }

    @Override
    public Book getTheBook(int id) {
        loadBook(id);
        return book;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        loadAllBooks();
        return bookList;
    }
}
