import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // Declare the radius, area, and circumference
        double radius, area, circumference;
        
        // Prompt user for the radius
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();  // Get user input for radius
        
        // Calculate the area and circumference
        area = Math.PI * Math.pow(radius, 2);  // Area = π * r^2
        circumference = 2 * Math.PI * radius;  // Circumference = 2 * π * r
        
        // Output the results with two decimal places
        System.out.printf("The area of the circle is: %.2f\n", area);
        System.out.printf("The circumference of the circle is: %.2f\n", circumference);
        
        // Close the scanner to release resources
        input.close();
    }
}
