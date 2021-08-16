package com.training.es.hw5.task2;

import java.util.Arrays;

public class SelectionSort implements Sorter {
    public void sort(int[] array) {
        for (int min = 0; min < array.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
        System.out.println("SelectionSort: " + Arrays.toString(array));
    }
}