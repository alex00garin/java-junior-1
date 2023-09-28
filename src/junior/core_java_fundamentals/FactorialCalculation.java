package junior.core_java_fundamentals;
import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate user input
        while (number <= 0) {
            System.out.println("Please enter a POSITIVE integer: ");
            number = input.nextInt();
        }

        // Calculate and print the factorial calculation steps
        int factorial = 1;
        System.out.println("Factorial Calculation for " + number + ":");
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            System.out.println("Step " + i + ": " + factorial);
        }

        // Display the final result
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
