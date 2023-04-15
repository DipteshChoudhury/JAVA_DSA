/*
 *Program :- To find factorial of a number using recursion
 */
import java.util.*;

class Factorial {

    public static long fact(long num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        }

        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter a positive number to find factorial :- ");
        long num = sc.nextLong();

        if (num >= 0) {
            System.out.println(num + "! = " + fact(num));
        } else {
            System.out.println("Invalid number!!!");
        }

        sc.close();
    }
}