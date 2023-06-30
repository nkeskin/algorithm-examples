import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ThreeSumValTest {

  ThreeSumVal threeSumVal;

  @BeforeEach
  void setUp() {
    threeSumVal = new ThreeSumVal();
  }

  @Test
  void case5() {
    List<List<Integer>> result = threeSumVal.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    Assertions.assertEquals(Arrays.asList(-1, 2, -1), result.get(0));
    Assertions.assertEquals(Arrays.asList(-1, 1, 0), result.get(1));
  }

  @Test
  void case6() {
    List<List<Integer>> result = threeSumVal.threeSum(new int[]{0, 0, 0, 0});
    Assertions.assertEquals(Arrays.asList(0, 0, 0), result.get(0));
  }

  @Test
  void case7() {
    List<List<Integer>> result = threeSumVal.threeSum(new int[]{-1,0,1});
    Assertions.assertEquals(Arrays.asList(-1, 1, 0), result.get(0));
  }

  @Test
  void case8() {
    List<List<Integer>> result = threeSumVal.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4});
    Assertions.assertEquals(Arrays.asList(-4, 4, 0), result.get(0));
    Assertions.assertEquals(Arrays.asList(-4, 3, 1), result.get(1));
    Assertions.assertEquals(Arrays.asList(-3, 4, -1), result.get(2));
    Assertions.assertEquals(Arrays.asList(-3, 3, 0), result.get(3));
    Assertions.assertEquals(Arrays.asList(-3, 2, 1), result.get(4));
    Assertions.assertEquals(Arrays.asList(-2, 3, -1), result.get(5));
    Assertions.assertEquals(Arrays.asList(-2, 2, 0), result.get(6));
    Assertions.assertEquals(Arrays.asList(-1, 2, -1), result.get(7));
    Assertions.assertEquals(Arrays.asList(-1, 1, 0), result.get(8));
  }



}