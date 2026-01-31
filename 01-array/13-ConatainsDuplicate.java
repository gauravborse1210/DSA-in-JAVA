class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i = 0;
        int j = 1;
        Arrays.sort(nums);

        while(j < nums.length){
            if(nums[i] == nums[j]){
                return true;
            }else{
                i++;
                j++;
            }
        }
        return false;
    }
}