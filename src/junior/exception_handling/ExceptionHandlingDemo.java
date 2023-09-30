package junior.exception_handling;

class ExceptionHandlingDemo {
    // Other methods and variables

    // Method to calculate square root
    public static void calculateSquareRoot(int number) {
        try {
            // Check if the number is negative
            if (number < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed.");
            }
            // If negative, throw NegativeNumberException with the message "Negative numbers are not allowed."

            // Calculate square root (if it's positive)
            double squareRoot = Math.sqrt(number);
            System.out.println("Square root of " + number + " is " + squareRoot);

        } catch (NegativeNumberException e) {
            // Handle the custom exception by printing the error message
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Other methods and variables
}
