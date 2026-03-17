class Solution {
    public int thirdMax(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > firstMax){
                firstMax = nums[i];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > secMax && nums[i] != firstMax){
                secMax = nums[i];
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > thirdMax && nums[i] != firstMax && nums[i] != secMax){
                thirdMax = nums[i];
            }
        }
        if(thirdMax == Integer.MIN_VALUE){
            return (int) firstMax;
        }

        
        return thirdMax;
    }
}
