package com.training.es.hw5.task2;

import java.util.Arrays;

public class BubbleSort implements Sorter {
    int tmp;
    boolean isSorted = false;

    public void sort(int[] array) {
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }
        System.out.println("BubbleSort: " + Arrays.toString(array));
    }
}