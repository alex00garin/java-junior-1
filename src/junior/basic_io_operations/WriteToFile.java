package junior.basic_io_operations;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        // Define the text to be written to the file
        String text =
                    "Hello, this is a sample text written to a file.\n" +
                    "You can add more lines if you'd like.";
        try {
            // Create a FileWriter object to write to the "output.txt" file
            FileWriter fileWriter = new FileWriter("output.txt");
            // Write the text to the file
            fileWriter.write(text);
            // Close the FileWriter
            fileWriter.close();
        } catch (IOException e) {
            // Handle the exception
            e.printStackTrace();
        }
    }
}
