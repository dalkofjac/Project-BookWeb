package main.org.foi.bookweb;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class User implements Serializable {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
