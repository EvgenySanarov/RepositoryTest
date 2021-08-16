package com.training.es.hw8;

import java.util.*;

public class ArraySorter {
    public static void sort(Integer[] array) {
        Arrays.sort(array, Comparator.comparingInt(ArraySorter::sumDigits));
    }

    private static int sumDigits(Integer num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }
}