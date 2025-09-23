class GfG {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int sum = a + b;
            System.out.println("Addition is: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Insufficient input arguments.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
}

// User function Template for Java

class Solution {
    public int findMin(int a, int b){
        // Your code here
        int minVal = Math.min(a+b, a-b);
        minVal = Math.min(minVal, a*b);
        try{
            minVal = Math.min(minVal, a/b);
        } catch(ArithmeticException e){
            
        }
        return minVal;
    }
}


