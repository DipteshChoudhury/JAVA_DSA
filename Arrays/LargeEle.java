import java.util.*;

public class LargeEle{
    public static int largest(int arr[]){
        int large = Integer.MIN_VALUE;   //negative of infinity
                //for +infinity :- small = Integer.MAX_VALUE


        for(int i=0; i<arr.length; i++){
            if(large < arr[i]){
                large = arr[i];
            }
        }
        
        return large;
    }
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of array :-");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter "+n+" no. of elements :-");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();     //Dealloaction of object
       
        System.out.println("Lagest value is "+largest(arr));
    }
}
