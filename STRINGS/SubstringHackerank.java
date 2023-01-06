/*
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings
 */

import java.util.*;

class SubstringHackerank {
    static String largestSmallestSubstring(String s,int k){
        
        String smallest = "z",largest = "";
        
        for(int i=0; i<=s.length()-k; i++ ){
            String h = (s.substring(i,k+i));
            if(h.compareTo(smallest)<0){
                smallest= h; }
            if(h.compareTo(largest)>0){
                largest=h;
            }
        }
    return smallest + "\n" + largest;
    }
    static void printLargeSmall(String[] str){
        String sml=str[0],lar=str[0];
        
        for(int i=1; i<str.length; i++){
            if(lar.compareTo(str[i]) < 0){
                lar = str[i];
            }
            if(sml.compareTo(str[i]) > 0){
                sml = str[i];
            }
        }
        System.out.println(sml+"\n"+lar);
    }
    static String[] stringToArray(String s,int n){
        String[] str = new String[s.length()-n+1];
        for(int i=0; i<str.length; i++){
            str[i] = "";
            for(int j=0; j<n; j++){
                str[i] += s.charAt(i+j);
            }
        }
        
        return str;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        
        if(s.length() < 1000){
            //String[] str = stringToArray(s,n);
            //printLargeSmall(str);                 //it's time complexity = O(n^2)

            largestSmallestSubstring(s,n);          //it's time complexity = O(n)   
        }
        sc.close();
    }
}
