/* Problem : QUICK SORT

 * TIME COMPLEXITY :
        AVERAGE CASE :- O(nlog n)
        WORST CASE :- o(n^2)
 * SPACE COMPLEXITY :O(1)
 */

public class QuickSort {
    public static void printArr(int arr[]) {
        for (int d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pvtIdx = partition(arr, si, ei); // pivot index = last element

        quickSort(arr, si, pvtIdx - 1); // sort left part
        quickSort(arr, pvtIdx + 1, ei); // sort right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // pivot element assign
        int i = si - 1;// to make place for elements smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap pivot element
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        System.out.println("Before Quick Sorting :");
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After Quick Sorting :");
        printArr(arr);
    }
}
