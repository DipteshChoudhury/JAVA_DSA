/*febonacci series :- 0, 1, 1, 2, 3, 5 ,8 ...... 
 *Program :- To find Nth Fibonacci number using recursion
 */

import java.util.*;

class NthFibonacciNum {
    public static int nFibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nFibo(n - 1) + nFibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter +ve number :- ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Num!!");
            return;
        }

        System.out.println(n + "th fibonacci num :- " + nFibo(n));
        sc.close();
    }
}
