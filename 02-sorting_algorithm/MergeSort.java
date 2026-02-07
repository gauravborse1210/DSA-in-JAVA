import java.util.Arrays;

public class MergeSort {

  public static void mergeSort(int nums[], int si, int ei ){
     if(si >= ei){
      return;
    }

    int mid = si + (ei - si) / 2;

    // for left part
    mergeSort(nums, si, mid);

    // for right part
    mergeSort(nums, mid + 1, ei);

    merge(nums, si, mid, ei);
  }

  public static void merge(int nums[], int si, int mid, int ei ){
    int[] temp = new int[ei - si + 1];
    int i = si;
    int j = mid + 1;
    int k = 0;

    while(i <= mid && j <= ei){
      if(nums[i] < nums[j]){
        temp[k] = nums[i];
        i++;
      } else {
        temp[k] = nums[j];
        j++;
      }
      k++;
    }

    // for remaining left elements
    while(i <= mid){
      temp[k++] = nums[i++];
    }

    // for remaining right elements
    while(j <= ei){
      temp[k++] = nums[j++];
    }

    // copy temp in nums
    for (k = 0, i = si; k < temp.length; k++, i++) {
    nums[i] = temp[k];
}

  }


  public static void main(String args[]){
    int[] nums = {6, 3, 9, 5, 2, 8};
    int si = 0;
    int ei = nums.length - 1;
    mergeSort(nums, si, ei);
    System.out.print(Arrays.toString(nums));
  }
}
