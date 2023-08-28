package search;

public class SearchOnSorted {

  //TODO not working on all cases, fix the implementation

  public int search(int[] nums, int target) {

    if (nums.length == 1) {
      if (nums[0] == target) {
        return 0;
      } else return -1;
    }

    if (target == nums[0]) {
      return 0;
    }

    int startingIndex = 0;
    int endingIndex = nums.length - 1;
    int middleIndex = (startingIndex + endingIndex) / 2;

    if (target > nums[0]) {
      if (target > nums[middleIndex]) {
        startingIndex = middleIndex;
      } else {
        endingIndex = middleIndex;
      }
    } else {
      if (target > nums[endingIndex]) {
        endingIndex = middleIndex;
      } else {
        startingIndex = middleIndex;
      }
    }

    while (startingIndex < endingIndex) {
      middleIndex = (startingIndex + endingIndex) / 2;
      if (target == nums[middleIndex]) {
        return middleIndex;
      } else if (target < nums[middleIndex]) {
        endingIndex = middleIndex;
      } else {
        startingIndex = middleIndex;
      }
    }

    return -1;
  }

}