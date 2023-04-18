
/*
 * Program : To find X^n using rcursion
 */

import java.util.*;

public class PowXn {
    static long power(long x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }

        return x * power(x, n - 1);
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
