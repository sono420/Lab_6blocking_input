import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // Declare variables
        //given in questions
        double gallonsInTank = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        boolean done = false;


        // loop structure for each variable from question
        do {
            // Prompt user for input
            System.out.print("Enter number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallonsInTank = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // valid input, end loop
            } else {
                // Clear invalid input and display error message
                String trash = in.nextLine();
                System.out.println("\nInvalid input. Please enter a valid number of gallons.");
            }
        } while (!done);


        // Reset flag for the next input
        done = false;


        do {
            System.out.print("Enter fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                fuelEfficiency = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("\nInvalid input. Please enter a valid fuel efficiency.");
            }
        } while (!done);


        // Reset flag for the next input
        done = false;


        do {
            System.out.print("Enter price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input. Please enter a valid price per gallon.");
            }
        } while (!done);


        // Calculate cost per 100 miles
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        // Calculate distance the car can go with the gas in the tank
        double distance = gallonsInTank * fuelEfficiency;


        // Display the results
        System.out.println("Cost per 100 miles:" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");
    }
}
