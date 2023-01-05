//BINARY SEARCH 

public class BinarySearch {

    public static int binarySearch(int arr[]){
        int start = 0, end = arr.length-1, key =10, mid;

        while(start <= end){
            mid = (start + end)/2;

            //comparision

            if(key == arr[mid]){    //if same search element
                return mid; //returns the index
            }
            else if(key > arr[mid]){
                start = mid ;
            }else{
                end = mid ;
            }
        }

        return (-1);
    }
    public static void main(String[] args) {
        int a[] ={2,4,6,10,12,14,50};
        int index = binarySearch(a);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is found at index "+(index+1));
        }

    }
}
