package junior.exception_handling;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Create an array of integers named "numbers" with a length of 5
        int[] numbers = new int[5];

        try {
            // Attempt to access the element at index 6 in the "numbers" array
            final int number = numbers[6];
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds exception occurred.");
        }

        // Print "Program execution continues."
        System.out.println("Program execution continues.");
    }
}