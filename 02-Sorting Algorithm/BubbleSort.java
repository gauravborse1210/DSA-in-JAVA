import java.util.Arrays;

public class BubbleSort {

  public static int[] bubbleSort(int nums[]){
    for(int i = 0; i < nums.length - 1; i++){
      for(int j = 0; j < nums.length - 1 - i; j++){
        if(nums[j] > nums[j + 1]){
          // Swap
          int temp = nums[j]; 
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    return nums;
  }

  public static void main(String args[]){
    int array[] = {10, 5, 3, 7, 4, 6, 1, 2};
    System.out.print(Arrays.toString(bubbleSort(array)));
  }
}
