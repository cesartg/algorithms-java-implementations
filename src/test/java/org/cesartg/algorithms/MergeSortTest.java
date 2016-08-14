package org.cesartg.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void testMergeSort() {
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] actual = {4, 3, 6, 1, 0, 9, 2, 7, 5, 8};
        MergeSort.mergeSort(actual, 0, actual.length);
        assertArrayEquals(expected, actual);
    }
}