//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         * Create an instance of the EcommerceCalculator class to perform calculations.
         */
        EcommerceCalculator calculator = new EcommerceCalculator();

        /**
         * Call the applyGST method to calculate and display the price after applying GST.
         */
        calculator.applyGST();

        /**
         * Call the applyDiscount method to calculate and display the price after applying a discount.
         */
        calculator.applyDiscount();
    }
}