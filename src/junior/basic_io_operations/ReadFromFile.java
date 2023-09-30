package junior.basic_io_operations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        // 1. Open the "output.txt" file for reading
        try {
            // 2. Create a FileReader and BufferedReader
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            // 3. Read and display the contents of the file
            String line;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
            }
            // 4. Close the BufferedReader and FileReader
            br.close();
            fr.close();
        } catch (IOException e) {
            // Handle any exceptions that may occur
            e.printStackTrace();
        }
    }
}
