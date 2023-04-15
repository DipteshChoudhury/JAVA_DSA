/*
 *Program :- To print n to 1 using recursion
 */
import java.util.*;

class printDecreseOrderNum {
    static void printDe(int num) {
        if (num == 1) { //base case
            System.out.print(num);
            return;
        }
        //statements
        System.out.print(num + ", ");
        printDe(num - 1);//inner call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a +ve  num :- ");
        int n = sc.nextInt();

        if (n > 0) {
            printDe(n);
        } else {
            System.out.println("Invalid Number!!");
        }
        sc.close();
    }
}