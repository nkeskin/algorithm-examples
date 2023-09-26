package strings;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergingSortedStringTest {

    MergingSortedString mergingSortedString;

    @BeforeEach
    void setup() {
        mergingSortedString = new MergingSortedString();
    }

    @Test
    void testMergingSortedStringsCase1() {
        String[] input1 = new String[]{"3", "7", "9"};
        System.out.println("input1 :" + Arrays.toString(input1));
        String[] input2 = new String[]{"1", "6", "8", "10"};
        System.out.println("input2 :" + Arrays.toString(input2));
        String expected = Arrays.toString(new String[]{"1", "3", "6", "7", "8", "9", "10"});
        System.out.println("expected :" + expected);
        String result = Arrays.toString(mergingSortedString.mergeSortedStrings(input1, input2));
        System.out.println("result :" + result);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testMergingSortedStringsCase2() {
        String[] input1 = new String[]{"3", "11"};
        System.out.println("input1 :" + Arrays.toString(input1));
        String[] input2 = new String[]{"1", "3", "8", "10"};
        System.out.println("input2 :" + Arrays.toString(input2));
        String expected = Arrays.toString(new String[]{"1", "3", "3", "8", "10", "11"});
        System.out.println("expected :" + expected);
        String result = Arrays.toString(mergingSortedString.mergeSortedStrings(input1, input2));
        System.out.println("result :" + result);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testMergingSortedStringsCase3() {
        String[] input1 = new String[]{};
        System.out.println("input1 :" + Arrays.toString(input1));
        String[] input2 = new String[]{"1", "6", "8", "10"};
        System.out.println("input2 :" + Arrays.toString(input2));
        String expected = Arrays.toString(new String[]{"1", "6", "8", "10"});
        System.out.println("expected :" + expected);
        String result = Arrays.toString(mergingSortedString.mergeSortedStrings(input1, input2));
        System.out.println("result :" + result);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testMergingSortedStringsWhenInputIsNotNumeric() {
        String[] input1 = new String[]{"a", "7", "9"};
        String[] input2 = new String[]{"1", "6", "8", "10"};
        Assertions.assertThrows(RuntimeException.class, () -> mergingSortedString.mergeSortedStrings(input1, input2));
    }

    @Test
    void testMergingSortedStringsWhenInputIsNotValid() {
        String[] input1 = new String[]{"2", "7", "9"};
        String[] input2 = new String[]{"1", "", "8", "10"};
        Assertions.assertThrows(RuntimeException.class, () -> mergingSortedString.mergeSortedStrings(input1, input2));
    }

    @Test
    void testMergingSortedStringsWhenInputIsNull() {
        String[] input1 = new String[]{"2", "7", "9"};
        Assertions.assertThrows(RuntimeException.class, () -> mergingSortedString.mergeSortedStrings(input1, null));
    }

}