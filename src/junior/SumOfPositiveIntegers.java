package junior;
import java.util.Scanner;

public class SumOfPositiveIntegers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();
        // Read and store the user's input
        int sum = 0;
        // Loop
        for (int i = 1; i <= number; i++) {
            // Check if the number is positive
            if (i > 0) {
                // Add the number to the sum
                sum += i;
            }
        }
        // Print the sum
            System.out.println(sum);
        // Close the scanner
        input.close();

    }
}