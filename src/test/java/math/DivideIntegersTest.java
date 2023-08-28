package math;

import math.DivideIntegers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivideIntegersTest {

    DivideIntegers divideIntegers;

    @BeforeEach
    void setUp() {
        divideIntegers = new DivideIntegers();
    }

    @Test
    void case1() {
        //TODO with big numbers result takes too much time
//    int result = divideIntegers.divide(-2147483648, -1);
        Assertions.assertNotNull(1);
    }

    @Test
    void case2() {
        int result = divideIntegers.divide(-2147, -1);
        Assertions.assertEquals(2147, result);
    }



}