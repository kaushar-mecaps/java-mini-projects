public class AtmTransaction {

    // Instance variables
    double balance = 5000.0;

    // Method to Print Instance & Local Variables
    public void printVariables() {

        // Local variable with the same name as instance variable
        double balance = 1000.0;
        // Accessing instance variable using 'this'
        System.out.println("Instance variable balance: " + this.balance);
        // Accessing local variable
        System.out.println("Local variable balance: " + balance);

    }
}
