import java.util.Arrays;

public class SelectionSort {

  public static int[] selectionSort(int nums[]){
    for(int i = 0; i < nums.length - 1; i++){
      int min = i;
      for(int j = i + 1; j < nums.length; j++){
        if(nums[min] > nums[j]){
          min = j;
        }
      }
      // Swap
      int temp = nums[i];
      nums[i] = nums[min];
      nums[min] = temp;
    }
    return nums;
  }

  public static void main(String args[]){
    int array[] = {10, 9, 5, 8, 3, 7, 4, 6, 1, 2};
    System.out.print(Arrays.toString(selectionSort(array)));
  }
}
