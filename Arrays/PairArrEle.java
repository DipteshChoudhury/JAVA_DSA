/**
 * Time Complexity :- O(n^2)
 */
public class PairArrEle {

    public static void pairEle(int arr[]){

        System.out.println("The pairs are :- ");
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                System.out.print("( "+arr[i]+" , "+arr[j]+" ),");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         int arr[] = {1,2,3,4,5,6,7,8,9};
         
         pairEle(arr);
    }
    
}