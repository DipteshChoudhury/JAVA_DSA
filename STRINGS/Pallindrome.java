/*
 * Program :- To check a string pallindrome or not
 */

import java.util.*;

public class Pallindrome {
    static boolean isPallindrome(String s){
        int len = s.length();

        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var str = sc.nextLine();

        if(isPallindrome(str)){
            System.out.println("\""+str+"\" is pallindrome.");
        }else{
            System.out.println("\""+str+"\" is not pllindrome.");
        }
        
        sc.close();
    }
}
