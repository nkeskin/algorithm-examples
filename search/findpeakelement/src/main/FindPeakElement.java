package main;

public class FindPeakElement {

  public int findPeakElement(int[] nums) {

    if(nums.length == 0) {
      return 0;
    }

    if(nums.length == 1) {
      return 0;
    }

    if(nums.length == 2) {
      if(nums[0] > nums[1]){
        return 0;
      } else {
        return 1;
      }
    }

    if(nums.length > 2) {
      if(nums[0] > nums[1]){
        return 0;
      }
      if(nums[nums.length-1] > nums[nums.length-2]){
        return nums.length-1;
      }
    }

    int startIndex = 0;
    int endIndex = nums.length-1;
    int midIndex = 0;

    while(midIndex <= endIndex) {
      midIndex = (startIndex + endIndex)/2;
      if(nums[midIndex-1] < nums[midIndex] && nums[midIndex] > nums[midIndex+1]) {
        return midIndex;
      } else if(nums[midIndex-1] < nums[midIndex]) {
        startIndex = midIndex;
      } else {
        endIndex = midIndex;
      }
    }

    return 0;
  }

}