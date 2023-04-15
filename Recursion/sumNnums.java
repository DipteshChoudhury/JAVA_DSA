/*
 *Program :- To print sum of n nums using recursion
 */
import java.util.*;

class sumNnums {
    public static long sumN(long num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        return num + sumN(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num(to find sum of n nums) : ");
        long n = sc.nextLong();

        if (n < 0) {
            System.out.println("Invalid Num!!");
            return;
        }
        System.out.println("Sum of " + n + " nums : " + sumN(n));
        sc.close();
    }
}
