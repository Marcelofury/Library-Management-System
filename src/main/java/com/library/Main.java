package main.java.com.library;

public class Main {
    public static void main(String[] args){
        //Polymorphism: Reference type is LibraryItem, object type is Book
        LibraryItem book1 = new Book("Clean Code", "B001", "Robert C. Martin", 464);

        System.out.println(" Initial Library State");
        book1.displayDetails();


        //Test encapsulation by changing availability
        book1.setAvailable(false);

        System.out.println("\n After Borrowing");
        book1.displayDetails();
    }
    
}
