package junior;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive integer: ");
        int userInput = input.nextInt();

        // Check if the user input is positive
        if (userInput <= 0) {
            System.out.println("Please enter a positive integer.");
            return; // Exit the program
        }

        // Calculate and print the multiplication table
        System.out.println("Multiplication Table for " + userInput + ":");
        for (int i = 1; i <= 10; i++) {
            int result = userInput * i;
            System.out.println(userInput + " x " + i + " = " + result);
        }
    }
}
