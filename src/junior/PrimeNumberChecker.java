package junior;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a positive integer
        System.out.println("Enter a positive number: ");
        int num = scanner.nextInt();
        while (num <= 0) {
            System.out.println("Please enter a POSITIVE number: ");
            num = scanner.nextInt();
        }

        // Use the isPrime() method to check if the number is prime
        boolean isPrime = isPrime(num);

        // Display the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
