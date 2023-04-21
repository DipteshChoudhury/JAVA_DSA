/*{
 * BINARY STRING PROBLEM
 *
 * Program : Print all binnary strings of size N without consecutive ones(1)
 *
 * Time Complexity :- O()
 * Space Complexity :-
 * }
 */

import java.util.*;

public class BinaryStr01 {
    static void printBinStr(int n, int lastPlace, String res) {
        if (n == 0) {
            System.out.println(res);
            return;
        }

        printBinStr(n - 1, 0, res + "0");

        if (lastPlace == 0) {
            printBinStr(n - 1, 1, res + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // no. of friends
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Binary Strings :");
        printBinStr(n, 0, "");

        sc.close();
    }

}
