/*
 * Program : To remove duplicate characters from string(only for lower case latter)
 *
 * Time Complexity :- O(n)  ;n = string length
 * Space Complexity :-
 */

import java.util.*;

public class UniqueCharsStr {
    static void removeDupli(String s, int indx, StringBuilder res, boolean map[]) {
        if (indx == s.length()) {
            // System.out.println("Unique Character string : " + res);
            return;
        }

        char c = s.charAt(indx);

        if (map[c - 'a'] == true) {
            removeDupli(s, indx + 1, res, map);
        } else {
            map[c - 'a'] = true;
            removeDupli(s, indx + 1, res.append(c), map);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String :- ");
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder("");

        removeDupli(s, 0, res, new boolean[26]);

        System.out.println("Unique Character string : " + res);
        sc.close();
    }
}
