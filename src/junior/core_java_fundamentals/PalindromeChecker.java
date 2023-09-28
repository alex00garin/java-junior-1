package junior.core_java_fundamentals;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();

        // Store the original number in a separate variable
        int originalNumber = number;

        // Reverse the number
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        // Compare the reversed number to the original number
        if (reversedNumber == originalNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
