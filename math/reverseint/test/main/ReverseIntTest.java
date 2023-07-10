package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseIntTest {

  ReverseInt reverseInt;

  @BeforeEach
  void setUp() {
    reverseInt = new ReverseInt();
  }

  @Test
  void case1() {
    Assertions.assertEquals(0, reverseInt.reverse(1534236469));
  }

  @Test
  void case2() {
    Assertions.assertEquals(123, reverseInt.reverse(321));
  }

  @Test
  void case3() {
    Assertions.assertEquals(-2143847412, reverseInt.reverse(-2147483412));
  }



}