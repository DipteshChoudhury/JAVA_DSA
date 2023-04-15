/*
 *Program :- To print 1st position of an key element in an array using recursion
 */

import java.util.*;

class FirstOccurancePosition {

    static int positionEle(int[] a, int i, int sEle) {
        if (i == a.length ) {
            return -1;
        }

        int  isFound = positionEle(a,i+1,sEle);
        if (isFound == 1 && a[i] == sEle) {
            return i+1; // if not sorted return false
        }

        return isFound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        //Search element 
        System.out.print("Enter the search element : ");
        int ele = sc.nextInt();

        int pos = positionEle(arr, 0, ele);

        if (pos >= 0) {
            System.out.println("Element is Found at "+pos);
        } else {
            System.out.println("Element is not found!!!");
        }

        sc.close();
    }
}
