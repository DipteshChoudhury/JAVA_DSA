import java.util.*;

public class NthFibonacciNum {
    public static int nFibo(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
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
