package org.cesartg.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void testInsertionSort() {
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] actual = {4, 3, 6, 1, 0, 9, 2, 7, 5, 8};
        InsertionSort.insertionSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRecursiveInsertionSort() {
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] actual = {4, 3, 6, 1, 0, 9, 2, 7, 5, 8};
        InsertionSort.recursiveInsertionSort(actual);
        assertArrayEquals(expected, actual);
    }
}