/*PROGRAM :-Given n non-negative integers representing an elevation map where
 *          the width of each bar is 1, compute how much water it can trap after raining
 * Time complexity :- O(n)
 * ________________________
 *           __
 *   6      |  |      __
 *  __      |  |     |  |
 * |  |     |  |__   |  |
 * |  |__   |  |  |__|  |
 * |  |  |  |  |  |  |  |
 * |__|__|__|__|__|__|__|
 *___________________________
 */
public class TrappingRainwater {
    public static int calcRainwater(int height[]){
        int n=height.length,trapedWater=0;
        //Creaating 2 auxilary(helping) array
        int leftMaxheight[] = new int[height.length];
        int rightMaxheight[] = new int[height.length];

        leftMaxheight[0] = height[0];
        rightMaxheight[n-1] = height[n-1];

        for(int i=1; i<n; i++){
            //calculate the left and right max boundary 
            leftMaxheight[i] =Math.max(leftMaxheight[i-1], height[i]) ;
            rightMaxheight[n-i-1] = Math.max(rightMaxheight[n-i],height[n-i-1]) ;
           /*  if(height[i]>leftMaxheight[i-1]){
                leftMaxheight[i] = height[i];
            }else{
                leftMaxheight[i] = leftMaxheight[i-1];
            }
            if(rightMaxheight[n-i] < height[n-i-1]){
                rightMaxheight[n-i-1] = height[n-i-1];
            }else{
                rightMaxheight[n-i-1] = rightMaxheight[n-i];
            }*/
        }
        //this for printing left and right boundaries
        /*for(int i=0; i<n; i++){
            System.err.println(leftMaxheight[i]+"   "+rightMaxheight[i]);
        }*/
        for(int i=0; i<n; i++){
            //trap water calculating
            trapedWater += Math.min(leftMaxheight[i], rightMaxheight[i]) - height[i] ;

            /*if(leftMaxheight[i] < rightMaxheight[i] ){
                trapedWater += (leftMaxheight[i] - height[i]);
            }else{
                trapedWater += (rightMaxheight[i] - height[i]);
            }*/
        }
        return trapedWater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};

        System.out.println("Water should be trapped :- "+calcRainwater(height));
    }
}