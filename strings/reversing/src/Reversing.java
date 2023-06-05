public class Reversing {

  // Reverse a string input
  public String reverse(String input) {
    if (input == null || input.equals(""))
      return "";

    char[] reverseChars = new char[input.length()];

    for (int i = 0; i < input.length(); i++) {
      reverseChars[i] = input.charAt(input.length() - i - 1);
    }

    return new String(reverseChars);
  }

}