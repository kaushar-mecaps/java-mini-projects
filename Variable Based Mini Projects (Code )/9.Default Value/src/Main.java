//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Create an instance of the Book class
        Book book1 = new Book();

        // JVM kis-ko default value deti hai aur kis-ko nahi deti —
        // yeh deeply samajhna.
        System.out.println("Title = " + book1.title);
        System.out.println("Price = " + book1.price);
        System.out.println("Author = " + book1.author);
        System.out.println("Rating = " + book1.rating);
        System.out.println("Is Best Seller = " + book1.isBestSeller);
        System.out.println("ID = " + book1.id);
    }
}