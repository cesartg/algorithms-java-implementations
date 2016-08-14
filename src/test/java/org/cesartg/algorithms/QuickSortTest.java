package org.cesartg.algorithms;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] expected = {0, 1, 2, 3};
        int[] actual = {3, 2, 0, 1};
        new QuickSort().quickSort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRandomizedSelection() {
        int[] actual = {3, 2, 0, 1};
        int position = new QuickSort().randomizedSelection(actual, 0, actual.length - 1, 1);
        assertThat(position, is(0));
    }
}