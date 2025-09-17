class Solution {
    public static int arrayLength(int[] arr) {
        // code here
        return arr.length;
    }
}



class Solution {
    public static void arrayTraversal(int[] arr) {
        // Code here
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}



class Solution {
    public void printArray(String[] arr) {
        // Code here
        for(String x : arr){
            System.out.println(x);
        }
    }
}



class Solution {
    public static void arrayTraversalReverse(int[] arr) {
        // Code here
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}




class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        for(int i=0; i<arr.length; i++){
            arr[i] -= 1;
        }
        return arr;
    }
}



class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}



class Solution {
    public static int largest(int[] arr) {
        // code here
        int largest=-1;
        for(int x : arr){
            if(x>largest)
                largest = x;
        }
        return largest;
    }
}




class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int sum=0;
        for(int x : arr){
            sum += x;
        }
        return sum;
    }
}



class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        int sum=0, count=0;
        for(int x : arr){
            if(x>=0){
                sum += x;
                count++;
            }
        }
        
        double average = (double)sum/count;
        return average;
    }
}




class Solution {
    public static int[] rowSum(int mat[][]) {
        // Code here
        int n=mat.length;
        int m = mat[0].length;
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<m; j++){
                sum += mat[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
}



class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int n = mat.length;
        int m = mat[0].length;
        int[] result = new int[m];
        
        for(int j=0; j<m; j++){
            int sum=0;
            for(int i=0; i<n; i++){
                sum += mat[i][j];
            }
            result[j] = sum;
        }
        return result;
    }
}



// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i%2==0){
                    result.add(matrix[i][j]);
                }
                else{
                    result.add(matrix[i][n-j-1]);
                }
            }
        }
        return result;
    }
}



class Solution {
    int minRow(int mat[][]) {
        // code here
        int minimum = 1001;
        int n = mat.length;
        int m = mat[0].length;
        int result=1;
        
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<m; j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count<minimum){
                result = i;
                minimum = count;
            }
        }
        return result+1;
    }
};



class Solution {
    public static String magicSquare(int mat[][]) {
        // Code here
        int n=mat.length;
        boolean distinctElements=false;
        
        
        int magicNumber=0;
        for(int j=0; j<n; j++){
            magicNumber += mat[0][j];
        }
        
        int prevElement = mat[0][0];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += mat[i][j];
                if(mat[i][j] != prevElement)
                    distinctElements=true;
            }
            if(sum != magicNumber)
                return "Not a Magic Square";
        }
        if(!distinctElements)
            return "Not a Magic Square";
        
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += mat[j][i];
            }
            if(sum != magicNumber)
                return "Not a Magic Square";
        }
        
        int sum=0;
        for(int i=0; i<n; i++){
            sum += mat[i][i];
        }
        if(sum != magicNumber)
            return "Not a Magic Square";
            
            
        sum=0;
        for(int i=0; i<n; i++){
            sum += mat[i][n-i-1];
        }
        if(sum != magicNumber)
            return "Not a Magic Square";
            
            
        return "Magic Square";
    }
}



