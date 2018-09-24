package io.nati.learn.stanford.part1.week1;

import io.nati.learn.stanford.part1.sort.MergeSort;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MergeSortTest {

    @Test
    public void testMergeSort() throws Exception {
        assertEquals(MergeSort.mergeSort(new int[]{4, 9, 6, 45, 1}), new int[]{1, 4, 6, 9, 45});
        assertEquals(MergeSort.mergeSort(new int[]{300, 4, 5, 191, 0, -32}), new int[]{-32, 0, 4, 5, 191, 300});
        assertEquals(MergeSort.mergeSort(new int[]{1}), new int[]{1});
        assertEquals(MergeSort.mergeSort(new int[]{0, 0, 2, 2, -1}), new int[]{-1, 0, 0, 2, 2});
    }
}