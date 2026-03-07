import constants.AppConstants;

public class Main {
    public static void main(String[] args) {

        // Using constants from AppConstants class
        System.out.println("Speed Limit: " + AppConstants.SPEED_LIMIT);
        System.out.println("GST Rate: " + AppConstants.GST_RATE);
        System.out.println("PI Value: " + AppConstants.PI);

        double radius = 5.0;
        double circumference = 2 * AppConstants.PI * radius;
        System.out.println("Circumference of circle with radius "
                + radius + " is: " + circumference);

    }
}