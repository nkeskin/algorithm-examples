package strings;

import java.util.HashSet;
import java.util.Set;

//Longest Substring Without Repeating Characters
public class LongestSubstring {

  public int findLongest(String input) {
    Set<Character> characterSet = new HashSet<>();
    int max = 0;
    for (int i = 0; i < input.length() - 1; i++) {
      characterSet.add(input.charAt(i));
      int temp = 1;
      for (int j = i + 1; j < input.length(); j++) {
        if (characterSet.add(input.charAt(j))) {
          temp++;
        } else {
          break;
        }
      }
      if (temp > max) {
        max = temp;
      }
      characterSet.clear();
    }
    return max;
  }

}