/*
 * Program : To find no. of ways to fixed (2 X 1) tile in floor (2 * n)
 * 
 * Time Complexity :- O(log n )
 * Space Complexity :- O(log n )
 */

import java.util.*;

class TillingProblem {
    static int cntWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        /*
         * logic
         * //vertical choice
         * int v = cntWays(n-1);
         * //horizontal choice
         * int h = cntWays(n-2);
         * 
         * return v + h;
         */

        return cntWays(n - 1) + cntWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("No. of ways :- " + cntWays(n));
        sc.close();
    }
}