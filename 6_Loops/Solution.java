import java.util.*;

public class Solution {
    public static void solve() {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=10; i++){
            System.out.print((n*i) + " ");
        }
    }
}


class Solution {
    public void printEvenIndices(String s) {
        // code here
        for(int i=0; i<s.length(); i++){
            if(i%2==0)
                System.out.print(s.charAt(i));
        }
    }
}




public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // Your Code Here
        int n = sc.nextInt();
        while(n>=0)
            System.out.print(n-- + " ");
    }
}


class Solution {
    public void printGeeks(int n) {
        // Code here
        do{
            System.out.println("Geeksforgeeks");
        }
        while(--n > 0);
    }
}


class Solution {
    public void calculateMultiples(int n) {
        // code here
        int i=10;
        while(i>=1){
            System.out.print(n*i-- + " ");
        }
    }
}


//Back-end complete function Template for Java


public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        System.out.println(count);
    }
}




public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt();
        int n2 = scn.nextInt();
        int x = n1-n2;
        for(int i=1; i<=10; i++){
            System.out.print(x*i + " ");
        }
    }
}


// Solution.java


public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // print right angle triangle of size n
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}


class Solution {
    public void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i>1 && i<n && j>1 && j<i){
                    System.out.print("  ");
                }
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}


class Solution {
    public void printPattern(int n) {
        // Code here
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}




public class Solution {
    public static void solve() {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i>1 && i<n && j>1 && j<n)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }
}




public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        String row = "* ".repeat(n);
        for(int i=1; i<n; i++){
            System.out.println(row);
        }
    }
}




public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}


class Solution {
    public int factorial(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}



class Solution {
    public int computeGCD(int a, int b) {
        // code here
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}





public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        // take input and print their LCM
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if(a==0 || b==0){
            int x = a>=b ? a : b;
            System.out.println(x);
            return;
        }
            
        int tempA = a, tempB = b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int lcm = Math.abs(tempA*tempB)/a;
        System.out.println(lcm);
    }
}


class Solution {
    void printDivisors(int n) {
        // code here
        for(int i=1; i<=n; i++){
            if(n%i==0)
                System.out.print(i + " ");
        }
    }
}




public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n==1){
            System.out.println("False");
            return;
        }
        if(n==2){
            System.out.println("True");
            return;
        }
        if(n%2==0){
            System.out.println("False");
            return;
        }
        for(int i=3; i*i<n; i++){
            if(n%i==0){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
}



public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        while(true){
            n++;
            if(n==2){
                System.out.println(2);
                return;
            }
            if(n%2==0){
                continue;
            }
            Boolean notPrime=false;
            for(int i=3; i*i<=n; i++){
                if(n%i==0){
                    notPrime=true;
                    break;
                }
            }
            if(notPrime)
                continue;
            System.out.println(n);
            return;
        }
    }
}




public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if(n==0){
            System.out.println(0);
            return;
        }
        if(n==1){
            System.out.println(1);
            return;
        }
        if(n==2){
            System.out.println(1);
            return;
        }
        int a=1, b=1, c=a+b;
        for(int i=3; i<=n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}