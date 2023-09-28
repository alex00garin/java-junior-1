package junior.core_java_fundamentals;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter their name
        System.out.println("Your name: ");
        String name = scanner.nextLine();
        // Prompt the user to enter their age
        System.out.println("Your age: ");
        int age = scanner.nextInt();
        // Calculate the year of birth
        int currentYear = 2023;
        int yearOfBirth = currentYear - age;
        // Display the results
        System.out.println("The year of birth " + name + " is " + yearOfBirth);
        // Close the Scanner
        scanner.close();
    }
}