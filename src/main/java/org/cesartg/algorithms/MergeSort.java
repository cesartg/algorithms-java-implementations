package org.cesartg.algorithms;

import java.util.Arrays;

class MergeSort {
    private static void merge(int[] array, int low, int high) {
        int middle = (low + high) / 2;
        int[] a = Arrays.copyOfRange(array, low, middle);
        int[] b = Arrays.copyOfRange(array, middle, high);
        int i = 0;
        int j = 0;
        int k = low;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                array[k++] = a[i];
                i++;

            } else {
                array[k++] = b[j];
                j++;
            }
        }
        while (i < a.length) {
            array[k++] = a[i];
            i++;
        }
        while (j < b.length) {
            array[k++] = b[j];
            j++;
        }
    }

    static void mergeSort(int[] array, int low, int high) {
        if (high - low > 1) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle, high);
            merge(array, low, high);
        }
    }
}