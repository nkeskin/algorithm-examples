import java.util.ArrayList;
import java.util.List;

public class HighestValuePalindrome {

  //TODO not working on all cases, fix the implementation
  public String findPalindrome(String input, int maxChanges) {

    char[] inputChars = input.toCharArray();
    List<Integer> breakingIndexes = getPalindromeBreakingIndexes(inputChars);

    if(maxChanges == 0) {
      if(breakingIndexes.size() > 0) {
        return "-1";
      } else {
        return input;
      }
    }

    if(breakingIndexes.size() > 1 && maxChanges == 1) {
      return "-1";
    }

    if(breakingIndexes.size() == 1 && maxChanges == 1) {
      convertToPalindrome(inputChars, breakingIndexes.get(0), maxChanges);
      return new String(inputChars);
    }

    if(breakingIndexes.size() == 0 && maxChanges == 1 && input.length() % 2 == 1) {
      convertToHighestPalindrome(inputChars, input.length() / 2, maxChanges);
      return new String(inputChars);
    }

    int modulo = maxChanges % 2;
    int i = 0;
    while (maxChanges > i) {
      maxChanges = convertToHighestPalindrome(inputChars, i, maxChanges);
      if(i < breakingIndexes.size() && i == breakingIndexes.get(i)) {
        breakingIndexes.remove(i);
      }
      i++;
    }

    for(int index : breakingIndexes) {
      if(maxChanges > 0) {
        maxChanges = convertToPalindrome(inputChars, index, maxChanges);
      }

    }

    if(input.length() % 2 == 1 && modulo == 1 && maxChanges == 1) {
      inputChars[input.length()/2] = '9';
    }

    return new String(inputChars);

  }

  private int convertToPalindrome(char[] inputChars, int breakingIndex, int maxChanges) {
    if(inputChars[breakingIndex] == '9') {
      inputChars[inputChars.length - breakingIndex - 1] = '9';
      maxChanges--;
      return maxChanges;
    } else if(inputChars[inputChars.length - breakingIndex - 1] == '9'){
      inputChars[breakingIndex] = '9';
      maxChanges--;
      return maxChanges;
    }

    if (inputChars[breakingIndex] > inputChars[inputChars.length - breakingIndex - 1]) {
      inputChars[inputChars.length - breakingIndex - 1] = inputChars[breakingIndex];
    } else {
      inputChars[breakingIndex] = inputChars[inputChars.length - breakingIndex - 1];
    }
    maxChanges--;
    return maxChanges;
  }

  private int convertToHighestPalindrome(char[] inputChars, int index, int maxChanges) {
    inputChars[inputChars.length - index - 1] = '9';
    inputChars[index] = '9';
    maxChanges -= 2;
    return maxChanges;
  }

  // return palindrome breaking indexes
  private List<Integer> getPalindromeBreakingIndexes(char[] inputChars) {
    List<Integer> breakingIndexes = new ArrayList<>();
    for (int i = 0; i < inputChars.length / 2; i++) {
      if (inputChars[i] != inputChars[inputChars.length - i - 1]) {
        breakingIndexes.add(i);
      }
    }
    return breakingIndexes;
  }

}