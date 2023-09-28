package junior.core_java_fundamentals;

import java.util.Scanner;

public class FactorialCalculator {
    public static int calculateFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer.");
        } else if (num == 0) {
            return 1;
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int num = scanner.nextInt();
        while (num <= 0) {
            System.out.println("Please enter a POSITIVE integer: ");
            num = scanner.nextInt();
        }

        int factorial = calculateFactorial(num);

        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
