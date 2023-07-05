
/*
 * Program : To find X^n using rcursion with optimized time complexity
 * Time Complexity :- O()
 * Space Complexity :- O()
 */

import java.util.*;

class OptimizedPowXn {

    static long power(long x, int n) {
        if (n == 0) {
            return 1;
        }

        // obtains the half of half power
        long halfPowerSqr = power(x, n / 2);

        // half power
        halfPowerSqr *= halfPowerSqr;

        // if n is odd
        if (n % 2 == 1) {
            halfPowerSqr *= x;
        }

        // returns half power
        return halfPowerSqr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        long x = sc.nextLong();

        System.out.print("Enter a +ve exponent : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Exponent :-");
        }
        System.out.println(x + "^" + n + " = " + power(x, n));
        sc.close();
    }
}
