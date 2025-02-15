import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Declare the radius, area, and circumference
        double radius, area, circumference;
        
        // Get user input for radius
        radius = input.nextDouble();  // No prompt, just directly take input
        
        // Calculate the area and circumference
        area = Math.PI * Math.pow(radius, 2);  // Area = π * r^2
        circumference = 2 * Math.PI * radius;  // Circumference = 2 * π * r
        
        // Output the results with two decimal places
        System.out.printf("%.2f\n", area); // Only the area
        System.out.printf("%.2f\n", circumference); // Only the circumference
        
        // Close the scanner to release resources
        input.close();
    }
}

