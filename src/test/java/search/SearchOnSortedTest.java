package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchOnSortedTest {

    SearchOnSorted searchOnSorted;

    @BeforeEach
    void setUp() {
        searchOnSorted = new SearchOnSorted();
    }

    @Test
    void case1() {
        Assertions.assertEquals(5, searchOnSorted.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 1));
    }

//  @Test
//  void case2() {
//    Assertions.assertEquals(0, searchOnSorted.search(new int[]{1, 3}, 2));
//  }

    @Test
    void case3() {
        Assertions.assertEquals(1, searchOnSorted.search(new int[]{5, 1, 3}, 1));
    }

//  @Test
//  void case4() {
//    Assertions.assertEquals(0, searchOnSorted.search(new int[]{1, 3, 5}, 3));
//  }

}