public class ReverseArray {

    public static void reverse(int arr[]){
        int temp = 0, n = arr.length;

        for(int i=0; i <= (n/2); i++){
            //swap
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,23,42,44,31,33};

        reverse(arr);   //function call

        System.out.println("After reverse :-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
