package org.cesartg.algorithms;

class InsertionSort {
    static <E extends Comparable> void insertionSort(E[] arr) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < i; j++) {
                if(arr[i].compareTo(arr[j]) < 0) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static <E extends Comparable> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static <E extends Comparable> void recursiveInsertionSort(E[] arr) {
        recursiveInsertionSort(arr, 1);
    }

    private static <E extends Comparable> void recursiveInsertionSort(E[] arr, int n) {
        if(n == arr.length) {
            return;
        }
        for(int i = 0; i < n; i++) {
            if(arr[i].compareTo(arr[n]) > 0) {
                E t = arr[n];
                System.arraycopy(arr, i, arr, i + 1, n - i);
                arr[i] = t;
                break;
            }
        }
        recursiveInsertionSort(arr, n + 1);
    }
}
