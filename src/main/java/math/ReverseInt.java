package math;

import java.util.ArrayList;
import java.util.List;

public class ReverseInt {

  public int reverse(int x) {
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
      x *= -1;
    }
    List<Integer> list = new ArrayList<>();
    long pow = 1;
    while (x > 0) {
      int temp = x % 10;
      list.add(temp);
      x = x / 10;
      pow *= 10;
    }
    long sum = 0;
    for (int elem : list) {
      pow /= 10;
      sum += pow * elem;
    }

    if(sum > max || sum < min) {
      return 0;
    }

    if (isNegative) {
      sum *= -1;
    }

    return (int)sum;
  }


}