package algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void checkSearchKeyInArrayWhenKey16() {
        BinarySearch search = new BinarySearch();
        int[] array = {12, 1, 11, 15, 16, 12, 111, 123};
        int exp = 5;
        assertThat(search.searchKeyInArray(16, array), is(exp));
    }

    @Test
    public void checkSearchWhenKeyNotFound() {
        BinarySearch search = new BinarySearch();
        int[] array = {12, 1, 11, 15, 16, 12, 111, 123};
        int exp = -1;
        assertThat(search.searchKeyInArray(3, array), is(exp));
    }
}