package junior.basic_data_structure;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        // Create an array of integers named "numbers" with a length of 10
        int[] numbers = { 5, 12, 18, 24, 31, 42, 55, 67, 72, 88 };
        // Populate the array with the provided elements
        for (int number : numbers) {
            System.out.println(number + " ");
        }
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int enteredNumber = input.nextInt();
        // Flag to track whether the number is found
        boolean found = false;
        // Loop to search for the entered number in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == enteredNumber) {
                found = true;
                System.out.println("Number " + enteredNumber + " found at index " + i);
                break;
            }
        }
        // If the number is not found, display a message
        if (!found) {
            System.out.println("Number " + enteredNumber + " is not found in the array.");
        }
        input.close();
    }
}
