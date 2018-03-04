package main.org.foi.bookweb;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;

@Named
@SessionScoped
public class CommentService implements Serializable{
    @Inject
    private BookInterface bookInterface;

    private Comment myComment;
    private ArrayList<Comment> allComments;
    private int bookId;

    public void loadTheBook(){
        myComment.setBook(bookInterface.getTheBook(bookId));
    }

    @PostConstruct
    public void load(){
        loadNewOne();
        allComments = new ArrayList<>();
    }

    public Comment getMyComment() {
        return myComment;
    }

    public void setMyComment(Comment myComment) {
        this.myComment = myComment;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public ArrayList<Comment> getAllComments(){
        return allComments;
    }
    public void loadRealList(){
        ArrayList<Comment> realList = new ArrayList<>();
        for(int i=0;i<allComments.size();i++){
            if(allComments.get(i).getBook().getId() == bookId){
                realList.add(allComments.get(i));
            }
        }
        allComments = realList;
    }
    public void storeComment() {
        allComments.add(myComment);
        loadNewOne();
    }
    public void loadNewOne(){
        myComment = new Comment();
        myComment.setBook(new Book());
        myComment.setUser(new User());
    }
}
