package main.java.com.library;

public abstract class LibraryItem {
    
    // Encapsulated fields (private)

    private String title;
    private String itemId;
    private boolean isAvailable;

    public LibraryItem(String title, String itemId){
        this.title = title;
        this.itemId = itemId;
        this.isAvailable =true; //Default state upon creation
    }

    //Getters and Setter (Encapsulation)
    public String getTitle(){
        return title;
    }

    public void SetTitle(String title){
        this.title = title;

    }

    public String getitemId (){
        return itemId;
    }


    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean available){
        isAvailable = available;
    }
    // Abstract method to be implemented by subclasses (Polymorphism/Abstraction)
    public abstract void displayDetails();

}
