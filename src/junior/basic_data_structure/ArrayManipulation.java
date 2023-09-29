package junior.basic_data_structure;

public class ArrayManipulation {
    public static void main(String[] args) {
        // 1. Create an array of integers named "numbers" with a length of 8
        int[] numbers = new int[8];
        // 2. Populate the array with the numbers 10, 20, 30, 40, 50, 60, 70, and 80 in ascending order
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;
        numbers[6] = 70;
        numbers[7] = 80;
        // 3. Print the elements of the array in the following format:
        //    Array elements: 10 20 30 40 50 60 70 80
        System.out.println("Array elements: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4] + " " + numbers[5] + " " + numbers[6] + " " + numbers[7]);
        // 4. Calculate and print the sum of all the elements in the array
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of all the elements in the array: " + sum);
        // 5. Find and print the minimum and maximum values in the array
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
        // 6. Create a new array named "doubledNumbers" with the same length as the "numbers" array
        int[] doubledNumbers = new int[8];
        // 7. Populate the "doubledNumbers" array with each element from the "numbers" array doubled
        for (int i = 0; i < numbers.length; i++) {
            doubledNumbers[i] = numbers[i] * 2;
        }
        // 8. Print the elements of the "doubledNumbers" array in the same format as step 3
        System.out.println("Array elements: " + doubledNumbers[0] + " " + doubledNumbers[1] + " " + doubledNumbers[2] + " " + doubledNumbers[3] + " " + doubledNumbers[4] + " " + doubledNumbers[5] + " " + doubledNumbers[6] + " " + doubledNumbers[7]);
        // 9. Calculate and print the average of all the elements in the "doubledNumbers" array
        double average = 0;
        for (int number : doubledNumbers) {
            average += number;
        }
        average /= doubledNumbers.length;
        System.out.println("Average of all the elements in the array: " + average);
    }
}
