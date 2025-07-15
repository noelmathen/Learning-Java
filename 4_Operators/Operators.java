class Solution {
    public int[] computeOperations(int x, int y) {
        // code here
        int p=x+y, q=x-y, r=x*y, s=x/y, t=x%y;
        int[] arr = new int[]{p, q, r, s, t};
        
        return arr;
    }
}

class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        String str = new String();
        str += a&&b ? "true" : "false";
        str += a||b ? " true" : " false";
        str += !a ? " true" : " false";
        
        return str;
    }
}

class Solution {
    public int calculate(int a, int b, int c, int d) {
        // code here
        return ((a+b)/c + d);
    }
}


public class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // Perform all the operations and print in a single line
        System.out.println((a^a) + " " + ~(c^b) + " " + (a&b) + " " + (c|(a^a)));
    }
}


public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Perform operation and print
        System.out.println(a>>b);
    }
}


class Solution {
    public int sumOfFirstN(int n) {
        // code here
        return (n*(n+1))/2;
    }
}


class Solution {
    public int lastDigit(int n) {
        // Code here
        return Math.abs(n%10);
    }
}


class Solution {
    public int dayBefore(int d, int n) {
        // code here
        int x = d-(n%7);
        return x<0 ? x+7 : x;
    }
}


class Solution {
    public int nthTerm(int a, int d, int n) {
        // code here
        return a+(n-1)*d;
    }
}


class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        int r = 2;
        // Compute and Print
        System.out.println(a*(int)(Math.pow(r,(n-1))));
    }
}

