//PROGRAM:-To find maximum sum of elements os subarray using prefix algorithm
//time complexity :-O(n^2)

public class PrefixSum {
    public static int maxSubarraySum(int a[]){

        int currSum = 0, maxSum = Integer.MIN_VALUE; 
        int prefixSumArray[] = new int[a.length];

        prefixSumArray[0] = a[0];
        for(int i=1; i<a.length; i++){
            prefixSumArray[i] = prefixSumArray[i-1] + a[i];
        }

        for(int start=0; start<a.length; start++){
            for(int end=start; end<a.length ;end++){
                
                currSum = start == 0 ? prefixSumArray[end] : prefixSumArray[end]- prefixSumArray[start-1];
                //find the sum of subarray elements
                System.out.println(currSum);  //prints the sum of subarray
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {12,21,34,56,78,90,100};

        System.out.println("The max sum of sub array element :-"+maxSubarraySum(arr)); 
    }
}
