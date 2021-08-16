package com.training.es.hw8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {100, 12, 1001, 555, 99, 22222};
        ArraySorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}