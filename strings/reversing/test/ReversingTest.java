import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReversingTest {

  Reversing reversing;

  @BeforeEach
  void setup() {
    reversing = new Reversing();
  }

  @Test
  void testReverse() {
    String input = "hello";
    Assertions.assertEquals("olleh", reversing.reverse(input));
  }

  @Test
  void testReverseWhenInputIsNull() {
    Assertions.assertEquals("", reversing.reverse(null));
  }

  @Test
  void testReverseWhenInputIsEmpty() {
    Assertions.assertEquals("", reversing.reverse(""));
  }

}