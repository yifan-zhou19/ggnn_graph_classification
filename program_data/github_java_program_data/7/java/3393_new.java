package implementations.sorts;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import implementations.sorts.Mergesort;

public class MergesortTest {

    @Test
    public void test() {
        int[] array = new int[] {4, -2, 5, 1, 2, 8, -3, 2};
        int[] golden = new int[] {-3, -2, 1, 2, 2, 4, 5, 8};
        Mergesort.mergesort(array);
        assertArrayEquals(golden, array);
        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        golden = array.clone();
        Mergesort.mergesort(array);
        assertArrayEquals(golden, array);
        array = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
        Mergesort.mergesort(array);
        assertArrayEquals(golden, array);
        array = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
        golden = array.clone();
        Mergesort.mergesort(array);
        assertArrayEquals(golden, array);
    }

}
