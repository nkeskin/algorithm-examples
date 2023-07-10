package main;

import java.util.ArrayList;
import java.util.List;

public class HighestValuePalindrome {

  //TODO not working on all cases, fix the implementation

  // Find highest value palindrome of a given string and return it
  // If not palindrome is found then return -1
  public String findPalindrome(String input, int maxChanges) {

    if (maxChanges > 0 && input.length() == 1) {
      return "9";
    }

    char[] inputChars = input.toCharArray();
    List<Integer> breakingIndexes = getPalindromeBreakingIndexes(inputChars);

    if (maxChanges == 0) {
      if (breakingIndexes.size() > 0) {
        return "-1";
      } else {
        return input;
      }
    }

    if (breakingIndexes.size() > 1 && maxChanges == 1) {
      return "-1";
    }

    if (breakingIndexes.size() == 1 && maxChanges == 1) {
      convertToPalindrome(inputChars, breakingIndexes.get(0), maxChanges);
      return new String(inputChars);
    }

    if (breakingIndexes.size() == 0 && maxChanges == 1 && input.length() % 2 == 1) {
      convertToHighestPalindrome(inputChars, input.length() / 2, maxChanges);
      return new String(inputChars);
    }

    int modulo = maxChanges % 2;
    int i = 0;
    int size = Math.abs(maxChanges - breakingIndexes.size())/2;
    while (maxChanges > size && i < inputChars.length) {
      maxChanges = convertToHighestPalindrome(inputChars, i, maxChanges);
      i++;
    }

    breakingIndexes = getPalindromeBreakingIndexes(inputChars);

    int index = 0;
    while (maxChanges > 0 && index < breakingIndexes.size()) {
      maxChanges = convertToPalindrome(inputChars, breakingIndexes.get(index), maxChanges);
      index++;
    }

    int resultIndex = 0;
    while (maxChanges > 1 && resultIndex < inputChars.length) {
      maxChanges = convertToHighestPalindrome(inputChars, resultIndex, maxChanges);
      resultIndex++;
    }

    if (input.length() % 2 == 1 && modulo == 1 && maxChanges == 1) {
      inputChars[input.length() / 2] = '9';
    }

    String result = new String(inputChars);

    List<Integer> resultIndexes = getPalindromeBreakingIndexes(result.toCharArray());

    if (resultIndexes.size() > 0) {
      return "-1";
    }

    return result;

  }

  private int convertToPalindrome(char[] inputChars, int breakingIndex, int maxChanges) {
    if (inputChars[breakingIndex] == '9' && inputChars[inputChars.length - breakingIndex - 1] == '9')
      return maxChanges;

    if (inputChars[breakingIndex] == '9') {
      inputChars[inputChars.length - breakingIndex - 1] = '9';
      maxChanges--;
      return maxChanges;
    } else if (inputChars[inputChars.length - breakingIndex - 1] == '9') {
      inputChars[breakingIndex] = '9';
      maxChanges--;
      return maxChanges;
    }

    if (inputChars[breakingIndex] > inputChars[inputChars.length - breakingIndex - 1]) {
      inputChars[inputChars.length - breakingIndex - 1] = inputChars[breakingIndex];
      maxChanges--;
    } else if (inputChars[breakingIndex] < inputChars[inputChars.length - breakingIndex - 1]) {
      inputChars[breakingIndex] = inputChars[inputChars.length - breakingIndex - 1];
      maxChanges--;
    }

    return maxChanges;
  }

  private int convertToHighestPalindrome(char[] inputChars, int index, int maxChanges) {
    if (inputChars[inputChars.length - index - 1] != '9') {
      inputChars[inputChars.length - index - 1] = '9';
      maxChanges--;
    }

    if (inputChars[index] != '9') {
      inputChars[index] = '9';
      maxChanges--;
    }

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