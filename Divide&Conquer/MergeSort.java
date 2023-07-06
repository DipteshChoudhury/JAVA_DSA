/* Problem : MERGE SORT
 * TIME COMPLEXITY : O(nlog n)
 * SPACE COMPLEXITY :O(n)
 */

public class MergeSort {
    public static void printArr(int arr[]) {
        for (int d : arr) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {// si:starting index; ei : ending index
        if (si >= ei) {
            return;
        }

        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part

        merge(arr, si, mid, ei);
    }

    // merge methode to merge left,right sorted array
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;// iterator for left part
        int j = mid + 1;// iterator for right part
        int k = 0;// itrator for temp array
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // sort remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // sort remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        System.out.println("Before sorting :");
        printArr(arr);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting :");
        printArr(arr);
    }
}
