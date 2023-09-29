package junior.basic_data_structure;

import java.util.ArrayList;

public class ArrayListOperations {
    public static void main(String[] args) {
        // Create an ArrayList of strings named "fruits"
        ArrayList<String> fruits = new ArrayList<>();
        // Add fruits to the ArrayList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");
        // Print the elements of the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Check if the ArrayList contains "banana" and print the result
        for (String fruit : fruits) {
            if (fruit.equals("banana")) {
                System.out.println(fruit + " is in the ArrayList");
            } else {
                System.out.println(fruit + " is not in the ArrayList");
            }
        }
        // Check if the ArrayList contains "cherry" and print the result
        for (String fruit : fruits) {
            if (fruit.equals("cherry")) {
                System.out.println(fruit + " is in the ArrayList");
            } else {
                System.out.println(fruit + " is not in the ArrayList");
            }
        }
        // Remove "date" from the ArrayList
        fruits.remove("date");
        // Print the size of the ArrayList
        System.out.println(fruits.size());
        // Replace "banana" with "grape" in the ArrayList
        fruits.set(1, "grape");
        // Print the modified ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
