import java.io.File;
import java.io.IOException;

class FileObject {
    public static void main(String[] args) {
        try {
            // Specify the file path
            File obj = new File("File.txt");

            // Attempt to create the file
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Check if the file exists
            if (obj.exists()) {
                // Print the file information
                System.out.println("File Name: " + obj.getName());
                System.out.println("Absolute Path: " + obj.getAbsolutePath());
                System.out.println("Writable: " + obj.canWrite());
                System.out.println("Readable: " + obj.canRead());
                System.out.println("File Size: " + obj.length() + " bytes");
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        
    }
}