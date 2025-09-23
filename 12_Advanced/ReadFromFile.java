import java.io.File;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            // Specify the file path
            File obj = new File("D:\\File.txt");
            // Create a Scanner object to read the file
            Scanner myReader = new Scanner(obj);
            // Read the file line by line
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            // Close the reader
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}