package junior.basic_data_structure;

public class ArrayOperations {
    public static void main(String[] args) {
        // Create an array of integers named "numbers" with a length of 5
        int[] numbers = new int[5];
        // Populate the array with the numbers 1 to 5 in ascending order
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        // Print the elements of the array in reverse order
        System.out.println("Array elements in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        // Calculate and print the sum of all the elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of all the elements in the array is: " + sum);
        // Modify the third element of the array to be 10
        numbers[2] = 10;
        // Print the modified array
        System.out.println("Modified array:");
        for (int number : numbers) {
            System.out.println(number);
        }
        // Calculate and print the average of all the elements in the array
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        System.out.println("The average of all the elements in the array is: " + average / numbers.length);
    }
}
