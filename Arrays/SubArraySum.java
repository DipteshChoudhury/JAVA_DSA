//print  subarrays with sum of the ekement of subarray

public class SubArraySum {
    public static void printSumSubarray(int a[]){
        int sum = 0, n=1; 
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length ;j++){
                System.out.print(n+++"th subarray is :-( ");
                for(int k=i; k<=j; k++){
                    System.out.print(a[k]+" ");
                    sum += a[k];
                }
                System.out.println(" ) sum is "+sum);
                sum=0;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,21,34,56,78,90,100};
        
        printSumSubarray(arr);
    }
}
