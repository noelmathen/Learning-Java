import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // check whether n is big or a number
        if(n>100)
            System.out.println("Big");
        System.out.println("Number");
    }
}


public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        if(n>100)
            System.out.println("Big");
        else
            System.out.println("Number");
    }
}


public class Solution {
    public static void solve() {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n>100)
            System.out.println("Big");
        else if(n<10)
            System.out.println("Small");
        else
            System.out.println("Number");
    }
}


public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%3==0)
            System.out.println("Fizz");
        else if(a%5==0)
            System.out.println("Buzz");
        else if(a%3==0 && a%5==0)
            System.out.println("FizzBuzz");
        else
            System.out.println(a);
    }
}


public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if(a%3==0 && a%5==0)
            System.out.println("FizzBuzz");
        else if(a%3==0)
            System.out.println("Fizz");
        else if(a%5==0)
            System.out.println("Buzz");
        else
            System.out.println(a);
    }
}


public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        
        switch(a){
            case 1: 
                System.out.println("One");
                break;
                
            case 2: 
                System.out.println("Two");
                break;
                
            case 3: 
                System.out.println("Three");
                break;
                
            case 4: 
                System.out.println("Four");
                break;
                
            case 5: 
                System.out.println("Five");
                break;
                
            case 6: 
                System.out.println("Six");
                break;
                
            case 7: 
                System.out.println("Seven");
                break;
                
            case 8: 
                System.out.println("Eight");
                break;
                
            case 9: 
                System.out.println("Nine");
                break;
                
            case 10: 
                System.out.println("Ten");
                break;
                
            default: 
                System.out.println("Unknown");
                break;
                
        }
    }
}


public class Solution {
    public static void main(String args[]) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if((n&1)==1)
            System.out.println("You");
        else
            System.out.println("Friend");
    }
}


public class Solution {
    public static void main(String args[]) {
        // Your code here
        int great, a, b, c;
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        
        // if(a>b && a>c)
        //     great=a;
        // else if (b>c)
        //     great=b;
        // else
        //     great=c;
        
        great = (a>b && a>c) ? a : (b>c ? b : c); 
        System.out.println(great);
    }
}


public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // code here
        if(year%400==0 || (year%4==0 && year%100!=0))
            System.out.println("True");
        else
            System.out.println("False");
    }
}


class Solution {
    public void calculate(int a, int b, int operator) {
        // code here
        Scanner scn = new Scanner(System.in);
        
        switch(operator){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
