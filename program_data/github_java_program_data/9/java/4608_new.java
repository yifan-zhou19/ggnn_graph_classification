package com.jabaddon.practices.algorithms.sorting.quicksort;

import com.jabaddon.practices.algorithms.sorting.common.SortingAlgorithm;

public class QuickSort implements SortingAlgorithm {

    private final Comparable[] a;
    private PartitionAlgorithm partition = new PartitionAlgorithmImpl();

    public QuickSort(Comparable[] a) {
        this.a = a;
    }

    @Override
    public void sort() {
        quickSort(a, 0, a.length - 1);
    }

    protected void quickSort(Comparable[] a, int left, int right) {
        if (left < right) {
            int pivot = partition.partition(a, left, right);
            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
    }
}
