
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// package 3_Input and Output in Java;

public class BufferReaderInputOutput {
    public static void main(String args[])
        throws IOException{
        
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Enter an integer: ");    
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter an string: ");    
        String b = (br.readLine());

        System.out.println("\nInteger: " + a + "\nString: " + b);

    }
}
