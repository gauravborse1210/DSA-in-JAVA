import java.util.Arrays;

public class QuickSort {

  public static void quickSort(int nums[], int si, int ei){
    if(si >= ei){
      return;
    }

    int partitionIndex = partition(nums, si, ei);
    quickSort(nums, si, partitionIndex - 1);
    quickSort(nums, partitionIndex + 1, ei);
    
  }

  public static int partition(int nums[], int si, int ei){
    int i = si - 1;
    int pivot = nums[ei];

    for(int j = si; j < ei; j++){
      if(nums[j] <= pivot){
        i++;
        //Swap
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
      }
    }

    i++;
    int temp = pivot;
    nums[ei] = nums[i];
    nums[i] = temp;


    return i;
  }


  public static void main(String args[]){
    int[] nums = {6, 3, 9, 8, 2, 5, -5};
    quickSort(nums, 0, nums.length - 1);
    System.out.print(Arrays.toString(nums));
  }
}
