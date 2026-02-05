class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int sortedArr[] = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        int idx = nums.length - 1;

        while(idx >= 0){
            if(nums[i] * nums[i] <= nums[j] * nums[j]){
                sortedArr[idx] = nums[j] * nums[j];
                idx--;
                j--;
            }else{
                sortedArr[idx] = nums[i] * nums[i];
                idx--;
                i++;
            }
        }

        return sortedArr;
        
    }

}
