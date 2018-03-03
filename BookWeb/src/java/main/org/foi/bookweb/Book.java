package main.org.foi.bookweb;

public class Book {
    private String name;
    private int numberOfPages;
    private String author;
    private String imgName;

    public Book(){}

    public Book(String name, int numberOfPages, String author, String imgName){
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.imgName = imgName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }
}
