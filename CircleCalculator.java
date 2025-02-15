import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");

        // Read the radius input as a double
        double radius = input.nextDouble();

        // Calculate the area of the circle: Area = π * r^2
        double area = Math.PI * Math.pow(radius, 2);

        // Calculate the circumference of the circle: Circumference = 2 * π * r
        double circumference = 2 * Math.PI * radius;

        // Output the results with formatted output
        System.out.printf("Radius: %.2f%n", radius);
        System.out.printf("Area: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

        // Close the scanner object to release system resources
        input.close();
    }
}
