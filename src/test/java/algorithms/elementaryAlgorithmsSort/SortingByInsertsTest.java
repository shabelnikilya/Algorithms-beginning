package algorithms.elementaryAlgorithmsSort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortingByInsertsTest {

    @Test
    public void sort() {
        SortingByInserts sortArray = new SortingByInserts();
        Integer[] array = {1, 6, 3, 12, 8};
        Integer[] expected = {1, 3, 6, 8, 12};
        sortArray.sort(array);
        assertThat(array, is(expected));
    }

    @Test
    public void sortWithDouble() {
        SortingByInserts sortArray = new SortingByInserts();
        Integer[] array = {1, 6, 3, 15, 12, 8, 6};
        Integer[] expected = {1, 3, 6, 6, 8, 12, 15};
        sortArray.sort(array);
        assertThat(array, is(expected));
    }
}