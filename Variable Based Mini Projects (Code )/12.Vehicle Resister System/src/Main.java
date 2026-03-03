//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /**
     * In this main method, we create two instances of the Vehicle class with different vehicle numbers.
     * We then display their details before and after changing the static variable RTO_CODE.
     * This demonstrates how the static variable is shared across all instances of the class.
     */
    Vehicle vehicle = new Vehicle("MP-09-AB-1234");
    Vehicle vehicle2 = new Vehicle("UP-09-CD-5678");

        /** Displaying details of both vehicles before changing the RTO code. */
        System.out.println("Before changing RTO code:");
        vehicle.showDetails();
        vehicle2.showDetails();

        /** Changing the static variable RTO_CODE.
         * This will affect all instances of the Vehicle class. */
        Vehicle.RTO_CODE = "MP-10"; // Changing the static variable RTO_CODE

        /** Displaying details of both vehicles after changing
         * the RTO code to show the effect of the static variable. */
        System.out.println("After changing RTO code:");
        vehicle.showDetails();
        vehicle2.showDetails();






    }
}