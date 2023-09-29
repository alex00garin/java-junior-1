package junior.basic_data_structure;

public class ArrayCopy {
    public static void main(String[] args) {
        // 1. Create an array of integers named "sourceArray" with a length of 5
        int[] sourceArray = new int[5];
        // 2. Populate "sourceArray" with 5 integers of your choice
        sourceArray[0] = 1;
        sourceArray[1] = 2;
        sourceArray[2] = 3;
        sourceArray[3] = 4;
        sourceArray[4] = 5;
        // 3. Create another integer array named "targetArray" with the same length as "sourceArray"
        int[] targetArray = new int[5];
        // 4. Copy the elements from "sourceArray" to "targetArray" element by element
        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
        // 5. Print the elements of both "sourceArray" and "targetArray" to verify
        System.out.println("sourceArray: " + sourceArray[0] + " " + sourceArray[1] + " " + sourceArray[2] + " " + sourceArray[3] + " " + sourceArray[4]);
        System.out.println("targetArray: " + targetArray[0] + " " + targetArray[1] + " " + targetArray[2] + " " + targetArray[3] + " " + targetArray[4]);
    }
}
