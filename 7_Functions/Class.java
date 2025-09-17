import java.util.*;

class Solution {
    
    // code here
    public static int returnValueFunction(int n){
        return 2*n;
    }
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        System.out.println(returnValueFunction(n));

        scn.close();
    }
}

