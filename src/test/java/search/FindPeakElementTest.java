package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindPeakElementTest {

    FindPeakElement findPeakElement;

    @BeforeEach
    void setUp() {
        findPeakElement = new FindPeakElement();
    }

    @Test
    void case1() {
        Assertions.assertEquals(2, findPeakElement.findPeakElement(new int[]{1,2,3,1}));
    }

    @Test
    void case2() {
        Assertions.assertEquals(5, findPeakElement.findPeakElement(new int[]{1,2,1,3,5,6,4}));
    }

}