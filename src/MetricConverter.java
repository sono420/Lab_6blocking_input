import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // Constants for conversion factors
        //value are calculate by 1 point
        // 1 meter to 1 miles
        //1 meters to 1 feet
        //1 meters to 1 inches
        final double METERS_TO_MILES = 0.000621371;
        final double METERS_TO_FEET = 3.28084;
        final double METERS_TO_INCHES = 39.3701;


        // Declare variable
        double meters = 0;
        boolean done = false;


        // Use do-while loop for input
        do {
            System.out.print("Enter measurement in meters: ");
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                if (meters >= 0) {
                    done = true;
                } else {
                    System.out.println("Measurement must be non-negative. Please enter a valid value.");
                }
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid measurement.");
            }
        } while (!done);


        // Convert meters to miles, feet, and inches
        double miles = meters * METERS_TO_MILES;
        double feet = meters * METERS_TO_FEET;
        double inches = meters * METERS_TO_INCHES;


        // Display the results
        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }
}