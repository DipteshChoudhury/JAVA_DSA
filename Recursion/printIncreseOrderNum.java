/*
 *Program :- To print 1 to n using recursion
 */
import java.util.*;

public class printIncreseOrderNum {

    public static void printIn(int n) {
        if (n == 1) {// base case
            System.out.print(1);
            return;
        }
        printIn(n - 1);// inner call
        System.out.print(", "+n);// statement
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num(to print 1 to n) :-");
        int n = sc.nextInt();

        if (n > 0) {
            printIn(n);
        } else {
            System.out.println("Invalid Number!!");
        }

        sc.close();
    }
}
