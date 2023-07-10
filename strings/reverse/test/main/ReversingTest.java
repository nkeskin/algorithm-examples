package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReversingTest {

  Reversing reversing;

  @BeforeEach
  void setup() {
    reversing = new Reversing();
  }

  @Test
  void testReverse() {
    String input = "demo!";
    System.out.println(input);
    String reversedInput = reversing.reverse(input);
    System.out.println(reversedInput);
    Assertions.assertEquals("!omed", reversedInput);
  }

  @Test
  void testReverseWhenInputIsNull() {
    Assertions.assertEquals("", reversing.reverse(null));
  }

  @Test
  void testReverseWhenInputIsEmpty() {
    Assertions.assertEquals("", reversing.reverse(""));
  }

  @Test
  void testReverseWhenInputHasOneCharacter() {
    Assertions.assertEquals("w", reversing.reverse("w"));
  }

}