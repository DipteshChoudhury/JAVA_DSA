/*
 * Program :- For a set of Strings, print the largest string
 *            Lexicography (dictionary order)
*/

import java.util.*;

public class LargestString {
    static String largest(String[] str){
        String large = str[0];

        for(int i=0; i<str.length; i++){
            //compareTo() returns -1(if s1 < s2, it returns negative number ),
            //                     0(if s1 == s2, it returns 0),
            //                     1(if s1 > s2, it returns positive number)
            if(large.compareTo(str[i]) < 0){  
                large = str[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];

        sc.nextLine();
        for(int i = 0; i<n; i++){
            System.out.print("Enter "+i+"th string :- ");
            s[i] = sc.nextLine();
        }

        System.out.println("largest String is "+largest(s));
        sc.close();
    }
}
