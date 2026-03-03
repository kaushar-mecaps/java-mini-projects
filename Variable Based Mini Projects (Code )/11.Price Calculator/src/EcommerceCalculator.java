/**
 * This class represents a simple e-commerce calculator that applies
 * GST and discounts to a product price.
 * It demonstrates basic object-oriented programming concepts in Java.
 */
public class EcommerceCalculator {
    /**
     * The name of the product for which the calculations will be performed.
     */
    String productName = "Laptop";
    /**
     * The price of the product before applying GST or discounts.
     */
    double price = 999.99;

    /**
     * This method applies GST to the product price and prints the final price.
     * For demonstration purposes, a fixed GST amount is used.
     */
    public void applyGST() {
        /**
         * Add the gst for this product.
         */
        double gst = 199.99;

        System.out.println("------------------------------------");
        System.out.println("Applying GST to the product price...");

        /**
         * Print the product name, original price, GST applied,
         * and final price after adding GST.
         */
        System.out.println("Product Name = " + productName +
                "\nProduct Price = " + price +
                "\nGST applied: " + gst + "\nFinal Price = " + (price + gst));
    }

    /**
     * This method applies a discount to the product price and prints the final price.
     * For demonstration purposes, a fixed discount amount is used.
     */
    public void applyDiscount() {
        /**
         * Subtract the discount for this product.
         */
        double discount = 100.00;

        System.out.println("------------------------------------");
        System.out.println("Applying discount to the product price...");
        /**
         * Print the product name, original price, discount applied,
         * and final price after applying the discount.
         */
        System.out.println("Product Name = " + productName +
                "\nProduct Price = " + price +
                "\nDiscount applied: " + discount +
                "\nFinal Price = " + (price - discount));
    }
}
