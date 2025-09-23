import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            // Specify the file path
            FileWriter writer = new FileWriter("D:\\File.txt");

            // Write data to the file
            writer.write("Java is a programming language");

            // Close the writer
            writer.close();

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}