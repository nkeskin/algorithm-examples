public class HighestValuePalindrome {

  public String findPalindrome(String input, int maxChanges) {

    char[] inputChars = input.toCharArray();
    boolean madeChanges = false;
    while (maxChanges != 0) {
      int breakingIndex = isPalindrome(inputChars);
      if (breakingIndex != -1) {
        convertToPalindrome(inputChars, breakingIndex);
        maxChanges--;
        madeChanges = true;
      } else {
        if (maxChanges > 1) {
          for (int i = 0; i < maxChanges; i++) {
            convertToHighestPalindrome(inputChars, i);
            madeChanges = true;
            maxChanges--;
          }
        } else if(maxChanges == 1) {
          if(inputChars.length % 2 == 1) {
            inputChars[inputChars.length/2] = '9';
            madeChanges = true;
          }
          maxChanges = 0;
        }
      }
    }

    if (madeChanges) {
      return new String(inputChars);
    } else {
      return "-1";
    }

  }

  private void convertToPalindrome(char[] inputChars, int breakingIndex) {
    if (inputChars[breakingIndex] > inputChars[inputChars.length - breakingIndex - 1]) {
      inputChars[inputChars.length - breakingIndex - 1] = inputChars[breakingIndex];
    } else {
      inputChars[breakingIndex] = inputChars[inputChars.length - breakingIndex - 1];
    }
  }

  private void convertToHighestPalindrome(char[] inputChars, int index) {
    inputChars[inputChars.length - index - 1] = '9';
    inputChars[index] = '9';
  }

  // if input is not palindrome then return breaking index
  private int isPalindrome(char[] inputChars) {
    for (int i = 0; i < inputChars.length / 2; i++) {
      if (inputChars[i] != inputChars[inputChars.length - i - 1]) {
        return i;
      }
    }
    return -1;
  }

}