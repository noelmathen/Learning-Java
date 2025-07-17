// User function Template for Java

// Write the complete function returnValueFunction below
// This function should take n as a parameter
// return double of n
// code here



class Solution {
    
    // code here
    public static int returnValueFunction(int n){
        return 2*n;
    }
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(returnValueFunction(n));
    }
}



// User function Template for Java

// Write the helloFunction below. It should have one statement
// System.out.println("Hello")

class Solution {
    //  code here
    public static void helloFunction(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        helloFunction();
    }
}



class Solution {
    // Write the complete argumentFunction below.
    // The function should take two arguments a and b
    // The function should return a+b
    // code here
    public static int argumentFunction(int a, int b){
        return a+b;
    }
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        
        System.out.println(argumentFunction(a, b));
    }
}




// User function Template for Java

// Complete the function
class Solution {
    public static int firstDigit(int n) {
        // code here
        int temp=0;
        while(n>0){
            temp = n%10;
            n /= 10;
        }
        return temp;
    }
}



class Solution {
    // This function should print the prime factorization
    // of the number n
    // The new line is given by the driver's code.
    public static void printPrimeFactorization(int n) {
        // code here
        while(n%2==0){
            System.out.print(2 + " ");
            n /= 2;
        }
        for(int i=3; i*i <= n; i+=2){
            while(n%i==0){
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
}



