/**
 * This class represents a Vehicle with certain attributes such as maximum speed,
 * RTO code, and vehicle number.
 * It demonstrates the use of final and static variables in Java.
 */
public class Vehicle {

    /** The maximum speed of the vehicle is defined as a final variable,
     * meaning it cannot be changed once assigned. */
    final int MAX_SPEED = 120;

    /** The RTO code is defined as a static variable,
     * which means it belongs to the class
     * rather than any instance of the class. It can be accessed
     * without creating an object of the class. */
    static String RTO_CODE = "MP-09";

    /** The vehicle number is a regular instance variable that can be assigned
     * a value for each instance of the Vehicle class. */
    String vehicleNumber;

    /** Constructor to initialize the vehicle number. */
    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    /** Method to display the details of the vehicle. */
    void showDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("RTO Code       : " + RTO_CODE);
        System.out.println("Max Speed      : " + MAX_SPEED);
        System.out.println("--------------------------------");
    }

}
