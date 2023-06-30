import java.util.*;

public class ThreeSumVal {

  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    Map<Integer, List<Integer>> map = new HashMap<>();

    for (int i = 0; i < nums.length - 1; i++) {
      int target = -nums[i];
      int k = i + 1;
      int j = nums.length - 1;

      while (k < j) {

        int sum = nums[k] + nums[j];
        if (sum == target) {
          List<Integer> lst = new ArrayList<>();
          lst.add(nums[i]);
          lst.add(nums[j]);
          lst.add(nums[k]);
          if (map.get(target) == null) {
            result.add(lst);
            List<Integer> mapLst = new ArrayList<>();
            mapLst.add(nums[j] * nums[k]);
            map.put(target, mapLst);
          } else if (!map.get(target).contains((nums[j] * nums[k]))) {
            result.add(lst);
            List<Integer> mapLst = map.get(target);
            mapLst.add(nums[j] * nums[k]);
            map.put(target, mapLst);
          }

          k++;
          j--;
        } else if (sum < target) {
          k++;
        } else {
          j--;
        }

      }

    }
    return result;
  }


}