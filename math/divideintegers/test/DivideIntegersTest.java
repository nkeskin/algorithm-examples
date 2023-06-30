import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DivideIntegersTest {

  DivideIntegers divideIntegers;

  @BeforeEach
  void setUp() {
    divideIntegers = new DivideIntegers();
  }

  @Test
  void case1() {
    int result = divideIntegers.divide(-2147483648, -1);
    Assertions.assertNotNull(result);
  }



}