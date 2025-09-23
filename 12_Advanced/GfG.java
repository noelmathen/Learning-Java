/* Class Solution with add fucntion
 * a, b : Two parameters of BigIntegers to add
 */
import java.math.BigInteger;

public class Solution {

    static BigInteger add(BigInteger a, BigInteger b) {

        // Your code here
        return a.add(b);
    }
}
 



/* Class MathematicalOperation with add function
 * a, b : Two parameters of BigIntegers to multiply
 */

class MathematicalOperation {

    // multiply function that returns the multiplication of a and b
    static BigInteger mul(BigInteger a, BigInteger b) {
        // Your code here
        return a.multiply(b);
    }
}





/*
 * Class MathematicalOperation with mod function
 * a, b : Two parameters of BigIntegers to find mod
 */

class MathematicalOperation {

    // mod function to find the modulus of b by a
    static BigInteger mod(BigInteger a, BigInteger b) {
        // Your Code here
        return b.mod(a);
    }
}





import java.math.BigInteger;

class Solution {
    public static BigInteger fib(int n) {
        // code here
        if(n==1)
            return BigInteger.ONE;
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("2");
        for(int i=2; i<n; i++){
            c = a.add(b);
            a = b;
            b = c;
        }
        
        return c;
        
    }
}






public class GfG {
    public static void main(String[] args) {
        int n = 13;
        // Check if the number is prime
        System.out.println("Is Prime: " + isPrime(n));
        // Find the next prime number
        System.out.println("Next Prime: " + nextPrime(n));
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        BigInteger b = BigInteger.valueOf(n); 
        return b.isProbablePrime(1); 
    }

    // Method to find the next prime number
    public static int nextPrime(int n) {
        BigInteger b = BigInteger.valueOf(n); 
        String a = b.nextProbablePrime().toString(); 
        return Integer.parseInt(a); 
    }
}