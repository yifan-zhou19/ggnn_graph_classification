package implementations.sorts;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import implementations.sorts.Quicksort;

public class QuicksortTest {

    @Test
    public void testSkiena() {
        Quicksort.METHOD m = Quicksort.METHOD.SKIENA;
        test(m);
    }

    @Test
    public void testBitch() {
        Quicksort.METHOD m = Quicksort.METHOD.CLASSIC;
        test(m);
    }

    private void test(Quicksort.METHOD m) {
        int[] array = new int[] {4, -2, 5, 1, 2, 8, -3, 2};
        int[] golden = new int[] {-3, -2, 1, 2, 2, 4, 5, 8};
        Quicksort.quicksort(array, m);
        assertArrayEquals(golden, array);
        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        golden = array.clone();
        Quicksort.quicksort(array, m);
        assertArrayEquals(golden, array);
        array = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
        Quicksort.quicksort(array, m);
        assertArrayEquals(golden, array);
        array = new int[] {1, 1, 1, 1, 1, 1, 1, 1};
        golden = array.clone();
        Quicksort.quicksort(array, m);
        assertArrayEquals(golden, array);
        array = new int[] {6, 4, -1 , 5, 2, 10};
        golden = new int[] {-1, 2, 4, 5, 6, 10};
        Quicksort.quicksort(array, m);
        assertArrayEquals(golden, array);
        
    }

}
