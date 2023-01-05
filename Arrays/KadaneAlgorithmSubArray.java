//PROGRAM:-To find maximum sum of elements of contiguous subarray using Kadane's Algorithm
//Kadane's algorithm :- It adds all element of the contiguous array and if sum is negative then 'currsum' will update to '0'
//time complexity O(n) :-it is a best algorithm

public class KadaneAlgorithmSubArray {
    public static int maxSubarraySum(int a[]){

        int currSum = 0, maxSum = Integer.MIN_VALUE;
        boolean c = false ;
        for(int i=0; i<a.length; i++){
            if(a[i] > 0){
                c = true;
                break ;
            } 
        }

        if(c){
            for(int i=0; i<a.length; i++){
                currSum = currSum + a[i];
                if(currSum < 0){
                    currSum = 0;
                }
                maxSum = Math.max(maxSum, currSum);
            }
        }else{
            for(int i=0; i < a.length; i++){
                maxSum = maxSum >a[i] ? maxSum : a[i] ;
            }       
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-12,2,4,5,-7,9,-10};   //arr[] = {-12,-2,-4,-5,-7,-9,-10}

        System.out.println("The max sum of sub array element :-     "+maxSubarraySum(arr)); 
    }
}