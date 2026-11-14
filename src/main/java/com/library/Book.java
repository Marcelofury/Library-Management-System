package main.java.com.library;

public class Book extends LibraryItem {
    private String author;
    private int pageCount;

    public Book(String title, String itemId, String author, int pageCount){
        super(title,itemId); // calls the parent constructor
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPageCount(){
        return pageCount;
    }
    
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }

    @Override 
    public void displayDetails(){
        System.out.println("[Book] ID:" + getitemId() + " | Title: " + getTitle() + " | Author: " + author + " | Pages:" + pageCount + " | Available: " + (isAvailable() ? "Yes" : "No"));
    }
}
