public class Book {
    // Instance variable
    String book;
    // Static variable
    static String author;

    // Method to display the variables
    public void showVariable() {
        // Local variable
        double price = 29.99;
        // Accessing instance variable, static variable, and local variable
        System.out.println("Book: " + book);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}
