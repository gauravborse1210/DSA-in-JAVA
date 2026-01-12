public class TrappingWater {
    public int trap(int[] height) {
        int leftMaxBoundary[] = new int[height.length];
        int rightMaxBoundary[] = new int[height.length];

        leftMaxBoundary[0] = height[0];
        rightMaxBoundary[height.length - 1] = height[height.length - 1];

        // For LeftMaxBoundary Auxiliary Array
        for(int i = 1; i < height.length; i++){
            if(height[i] < leftMaxBoundary[i - 1]){
                leftMaxBoundary[i] = leftMaxBoundary[i - 1];
            }else{
                leftMaxBoundary[i] = height[i];
            }
        }

        // For RightMaxBoundary Auxiliary Array
        for(int i = height.length - 2; i >= 0; i--){
            if(height[i] < rightMaxBoundary[i + 1]){
                rightMaxBoundary[i] = rightMaxBoundary[i + 1];
            }else{
                rightMaxBoundary[i] = height[i];
            }
        }

        // For trap water
        int water = 0;
        for(int i = 0; i <height.length; i++){
            int min = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            water += min - height[i];
        }

        return water;
    }

    public static void main(String args[]){
        TrappingWater sol = new TrappingWater(); 
        int array[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = sol.trap(array);   
        System.out.println(result);
    }

}