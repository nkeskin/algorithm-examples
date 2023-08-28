package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LongestSubstringTest {

    LongestSubstring longestSubstring;

    @BeforeEach
    void setUp() {
        longestSubstring = new LongestSubstring();
    }

    @Test
    void case1() {
        Assertions.assertEquals(3, longestSubstring.findLongest("abcabcbb"));
    }

    @Test
    void case2() {
        Assertions.assertEquals(1, longestSubstring.findLongest("bbbbb"));
    }

    @Test
    void case3() {
        Assertions.assertEquals(3, longestSubstring.findLongest("pwwkew"));
    }

}