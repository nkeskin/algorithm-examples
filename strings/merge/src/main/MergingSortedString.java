package main;

public class MergingSortedString {

  // Merge two sorted string arrays into one
  public String[] mergeSortedStrings(String[] firstInput, String[] secondInput) {
    validateInputs(firstInput, secondInput);

    String[] mergedString = new String[firstInput.length + secondInput.length];

    String temp1;
    String temp2;

    int i = 0, j = 0, l = 0;

    while (i < firstInput.length && j < secondInput.length) {
      temp1 = firstInput[i];
      temp2 = secondInput[j];
      if (Integer.parseInt(temp1) < Integer.parseInt(temp2)) {
        mergedString[l] = temp1;
        i++;
      } else {
        mergedString[l] = temp2;
        j++;
      }
      l++;
    }

    if(firstInput.length == i) {
      for(int k = j; k < secondInput.length; k++) {
        mergedString[l] = secondInput[k];
        l++;
      }
    } else {
      for(int k = i; k < firstInput.length; k++) {
        mergedString[l] = firstInput[k];
        l++;
      }
    }


    return mergedString;
  }

  private void validateInputs(String[]... input) {
    for (String[] str : input) {
      for (String s : str) {
        if (s == null || s.equals("")) {
          throw new RuntimeException("Input is not valid: " + s);
        }
        try {
          Integer.parseInt(s);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }

}