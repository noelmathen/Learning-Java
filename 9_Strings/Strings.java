// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int lengthString(String str) {
        // find the length of string
        return str.length();
    }
}



// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        int count=0;
        for(char x : str.toCharArray()){
            if(x==' ')
                count++;
        }
        return count+1;
    }
}




// User function Template for Java

// functions should slice the given string
// i.e. remove the first and the last character
// of the given string and return the sliced
// string
class Solution {
    public static String sliceString(String s) {
        // code here
        return s.substring(1, s.length()-1);
    }
}





// User function Template for Java

// function to print the two string
// first string: the first character is changed
// to uppercase
// second string: complete string is changed
// to upper case.
// print both the string in new line.
class Solution {
    public static void changeCase(String s) {
        // code here
        System.out.print((s.substring(0,1)).toUpperCase());
        System.out.println(s.substring(1));
        System.out.println(s.toUpperCase());
    }
}





class Solution {

    public static boolean isPanagram(String str) {
        // Your code here
        int[] alphabets = new int[26];
        String newStr = str.toLowerCase();
        for(int x : newStr.toCharArray()){
            alphabets[x-97] = 1;
        }
        
        for(int x : alphabets)
            if(x==0)
                return false;
        
        return true;
    }
}





// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {

        // write your code here
        char result=0;
        
        for(char x : s1.toCharArray())
            result ^= x;
        for(char x : s2.toCharArray())
            result ^= x;
        return result;
    }
}





class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(char x : s1.toCharArray()){
            arr1[x-'a']++;
        }
        
        for(char x : s2.toCharArray()){
            arr2[x-'a']++;
        }
        
        for(int i=0; i<26; i++){
            if(arr1[i] != arr2[i])
                return false;
        }
        
        return true;
    }
}





class Solution {
    public static boolean isPalindrome(String s) {
        // code here
        int i=0, j=s.length()-1;
        while(i<j){
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
}




class Solution {
    public static String reverseString(String s) {
        // code here
        int i=0, j=s.length()-1;
        char[] str = s.toCharArray();
        while(i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
            
    }
}





// User function Template for Java
class Solution {
    public static String toBinary(int n) {
        // Code here
        String str = "";
        while(n>0){
            str += Integer.toString(n%2);
            n /=2;
        }
        return str;
        
    }
}




// User function Template for Java
class Solution {
    public static String toBinary(int n) {
        // Code here
        String str = "";
        while(n>0){
            str = Integer.toString(n%2) + str;
            n /=2;
        }
        return str;
        
    }
}



// User function Template for Java

class Solution {
    public int binaryToDecimal(String b) {
        // Code here
        int number=0;
        int power=1;
        
        for(int i=b.length()-1; i>=0; i--){
            int x = b.charAt(i) - '0';
            number += x * power;
            power *= 2;
        }
        
        return number;
    }
}




class Solution {
    public static int findPattern(String s, String p) {
        // code here
        return s.indexOf(p);
    }
}




/*Function to count number of characters
 * to make s1 and s2 equal
 * s1 : first string
 * s2 : second string
 */
class Geeks {

    static int coutChars(String s1, String s2) {

        // Your code here
        int[] str1 = new int[26];
        int[] str2 = new int[26];
        int count=0;
        
        for(char x : s1.toCharArray()){
            str1[x-'a']++;
        }
        for(char x : s2.toCharArray()){
            str2[x-'a']++;
        }
        
        for(int i=0; i<26; i++){
            count += Math.abs(str1[i] - str2[i]);
        }
        
        return count;
        
    }
}




class Geeks {

    static void checkString(String s) {
        int v = 0;
        int c = 0;

        // Your code here
        for(char x : s.toCharArray()){
            if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
                v++;
            else
                c++;
        }

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else if(v==c)
            System.out.print("Same");

        System.out.println();
    }
}



class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
        String newStr = s1 + s1;
        if(newStr.indexOf(s2)==-1)
            return false;
        return true;
    }
}


