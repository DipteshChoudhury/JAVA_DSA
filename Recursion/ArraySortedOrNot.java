/*
 *Program :- To check an Array is sorted(in Asscending) or not using recursion
 */

import java.util.*;

class ArraySortedOrNot {
    static boolean isSorted(int []a, int i){
        if(i == a.length-1){
            return true;
        }

        if(a[i] > a[i+1]){
            return false; // if not sorted return false
        }

        return isSorted(a, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements :- ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(isSorted(arr,0)){
            System.out.println("Array is sorted!!!");
        }else{
            System.out.println("Array is not sorted!!!");
        }
        
        sc.close();
    }        

}
