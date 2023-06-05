import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HighestValuePalindromeTest {

  HighestValuePalindrome highestValuePalindrome;

  @BeforeEach
  void setUp() {
    highestValuePalindrome = new HighestValuePalindrome();
  }

  @Test
  void testHighestValuePalindromeCase1() {
    String input = "1231";
    int maxChanges = 3;
    String highestValuePalindromeString = "9339";
    Assertions.assertEquals(highestValuePalindromeString,
        highestValuePalindrome.findPalindrome(input, maxChanges));
  }

  @Test
  void testHighestValuePalindromeCase2() {
    String input = "12321";
    int maxChanges = 1;
    String highestValuePalindromeString = "12921";
    Assertions.assertEquals(highestValuePalindromeString,
        highestValuePalindrome.findPalindrome(input, maxChanges));
  }

  @Test
  void testHighestValuePalindromeCase3() {
    String input = "092282";
    int maxChanges = 3;
    String highestValuePalindromeString = "992299";
    Assertions.assertEquals(highestValuePalindromeString,
        highestValuePalindrome.findPalindrome(input, maxChanges));
  }

}