import java.util.Scanner;
// Import Scanner class for input
public class CtoFConverter {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner in = new Scanner(System.in);


        // Declare variables
        double celsius = 0; // temperature in Celsius
        boolean done = false;


        // Loop until valid input is obtained
        do {
            // Prompt user for temperature in Celsius
            System.out.print("Enter temperature in Celsius: ");


            // Check if next input is a double
            if (in.hasNextDouble()) {
                // Read the temperature in Celsius
                celsius = in.nextDouble();
                in.nextLine();
                done = true; // valid input, end loop
            } else {
                // Read and discard invalid input
                String trash = in.nextLine();
                // Display error message
                System.out.println("Invalid input. Please enter a valid temperature.");
            }
        } while (!done);


        // Convert Celsius into Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;


        // Display the temperature in Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
