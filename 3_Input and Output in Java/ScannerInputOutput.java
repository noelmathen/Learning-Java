// package 3_Input and Output in Java;
import java.util.*;

public class ScannerInputOutput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int a = scn.nextInt();

        System.out.println("Enter a string");
        String str = scn.nextLine();

        System.out.println("\nInteger: " + a + "\nString: " + str);
        scn.close();
    }
}
