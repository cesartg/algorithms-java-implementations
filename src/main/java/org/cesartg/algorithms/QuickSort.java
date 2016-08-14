package org.cesartg.algorithms;

import java.util.Random;

class QuickSort {
    private Random random = new Random();

    void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (high - low > 0) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low + random.nextInt(high - low)];
        int i = low;
        int j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int randomizedSelection(int[] arr, int low, int high, int position) {
        position--;
        if (high - low <= 0) {
            return low;
        }
        int p = partition(arr, low, high);
        if (position == p) {
            return p;
        }
        if (position > p) {
            return randomizedSelection(arr, p + 1, high, position);
        }
        return randomizedSelection(arr, low, p - 1, position);
    }
}