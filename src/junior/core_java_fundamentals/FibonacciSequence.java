package junior.core_java_fundamentals;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the number of terms
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Calculate and print the Fibonacci sequence
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < num; i++) {
            int nextTerm = n1 + n2;
            System.out.print(" " + nextTerm);
            n1 = n2;
            n2 = nextTerm;
        }
    }
}
