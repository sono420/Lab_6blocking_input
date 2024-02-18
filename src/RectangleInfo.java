import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // Declare variables
        double width = 0;
        double height = 0;
        boolean done = false;
        // Use do-while loop for width input
        do {
            System.out.print("Enter width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine(); // clear newline character
                if (width > 0) {
                    done = true;
                } else {
                    System.out.println("Width must be greater than zero. Please enter a valid width.");
                }
            } else {
                String trash = in.nextLine(); // clear invalid input
                System.out.println("Invalid input. Please enter a valid width.");
            }
        } while (!done);


        // Reset flag for height input
        done = false;


        // Use do-while loop for height input
        do {
            System.out.print("Enter height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine(); // clear newline character
                if (height > 0) {
                    done = true;
                } else {
                    System.out.println("Height must be greater than zero. Please enter a valid height.");
                }
            } else {
                String trash = in.nextLine(); // clear invalid input
                System.out.println("Invalid input. Please enter a valid height.");
            }
        } while (!done);


        // Calculate area of the rectangle
        double area = width * height;
        // Calculate perimeter of the rectangle
        double perimeter = 2 * (width + height);
        // Calculate length of the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(width * width + height * height);


        // Display the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}



