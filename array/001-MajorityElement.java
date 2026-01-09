import java.util.Arrays;

public class MajorityElement{

   public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }

  public static void main(String args[]){
    int array[] = {0, 1, 2, 0, 1, 2, 1, 2, 1};
    int result = majorityElement(array);
    System.out.print(result);
  }

}
