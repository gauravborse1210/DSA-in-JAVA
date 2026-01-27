class Solution {

    public int primarySearch(int nums[], int target, int si, int ei){
        if(si > ei){
          return -1;
        }
        int mid = si + (ei - si) / 2;

    // mid is target
    if(target == nums[mid]){
        return mid;
    }

    // 1) mid is on line L1
    if(nums[si] <= nums[mid]){
        //case a
        if(nums[si] <= target && target <= nums[mid]){
            return primarySearch(nums, target, si, mid-1);
        }else{
            return primarySearch(nums, target, mid+1, ei);
        }
    }
    // 2) mid is on L2
    else{
        if(nums[mid] <= target && target <= nums[ei]){
            return primarySearch(nums, target, mid+1, ei);
        }else{
            return primarySearch(nums, target, si, mid-1);
        }
    }
    }

    public int search(int[] nums, int target) {
     int si = 0;
     int ei = nums.length - 1;
    //  int answer = -1;

     int answer = primarySearch(nums, target, si, ei);
  
     return answer;
    }

   
}
