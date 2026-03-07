//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Book class
        Book book1 = new Book();
        // Set the instance variable and static variable
        book1.book = "The Great Gatsby";
        // Set the static variable using the class name
        Book.author = "F. Scott Fitzgerald";
        // Call the method to display the variables
        book1.showVariable();

    }
}