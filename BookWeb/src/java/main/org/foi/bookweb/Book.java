package main.org.foi.bookweb;

public class Book {
    private int id;
    private String name;
    private int numberOfPages;
    private String author;
    private String imgName;
    private String desc;

    public Book(){}

    public Book(int id, String name, int numberOfPages, String author, String imgName, String desc){
        this.id = id;
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.imgName = imgName;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
