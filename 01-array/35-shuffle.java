class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int[] arr = new int[nums.length];
        int idx = 0;
        while(i < n)
        {
            arr[idx++] = nums[i];
            i++;
            arr[idx++] = nums[j];
            j++;
        }
        return arr;
    }
}
