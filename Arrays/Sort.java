import java.util.*;

public class Sort {
    public static void bubbleSort(int[] a){
        //Large element come to the end of the array by swapping with adjacant elements
        for(int turns=0; turns<a.length-1;turns++){
            for(int i=0;i<a.length-1-turns ;i++){
                if(a[i] > a[i+1]){
                    //Swap
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        //Time complexity :- O(n^2)
    }

    public static void selectionSort(int[] arr){
        //Pick the smallest element from the unsorted array, put it at the begining

        int minpos;
        for(int i=0; i<arr.length-1; i++){      //turns
            minpos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minpos] > arr[j] ){
                    minpos = j;
                }
            }
            //if(minpos != i){
                //Swap
                int temp = arr[minpos];
                arr[minpos] = arr[i];
                arr[i] = temp;
            //}
        }
        //Time Complexity :- O(n^2)
    }

    public static void insertionSort(int[] arr){
        //Pick an element from the unsorted part, place in the right place/position

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prevIndex = i-1;
            //finding out the correct position of insert
            while(prevIndex >= 0 && arr[prevIndex] > curr){
                arr[prevIndex+1] = arr[prevIndex];
                prevIndex--;
            }
            //insertion
            arr[prevIndex+1] = curr;
        }
        //Time Complexity :- O(n^2)
    }

    public static void inBuiltFun(int[] a){
        //inbuilt function for sorting
        Arrays.sort(a);


        //Time Complexity :- O(n * logn)
    }

    public static void countingSort(int[] a){
        //Only use in short range array and use for sorting of Whole Numbers(+ve integers)
        
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            largest = Math.max(largest, a[i]);
        }

        int count[] = new int[largest + 1];
        for(int i=0; i<a.length; i++){
            count[a[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length; i++){
            while(count[i] > 0){
                a[j] = i;
                j++;
                count[i]--;
            }
        }

        //Time Complexity :- O(n)
    }
    //Input Array
    public static int[] inputArr(){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter no. of elements :- ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n; i++){
            System.out.print("Enter element :- ");
            a[i]=sc.nextInt();
        }
        sc.close();
        return a;
    }

    //Print Array
    public static void displayArr(int[] arr){
        
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        
    }

   public static void main(String[] args) {
        
        int[] a = inputArr();
        System.out.print("\nBefore sorting :");
        displayArr(a);

        //bubbleSort(a);
        //selectionSort(a);
        //insertionSort(a);
        //inBuiltFun(a);
        countingSort(a);

        System.out.print("\n\nAfter sorting :");
        displayArr(a);
   } 
}
