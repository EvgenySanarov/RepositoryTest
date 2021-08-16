package com.training.es.hw4;

import java.util.Arrays;

public class Median {
    public static float median(int[] ints) {
        double median;
        Arrays.sort(ints);
        if (ints.length % 2 == 0) {
            median = ((double) ints[ints.length / 2] + (double) ints[ints.length / 2 - 1]) / 2;
        } else {
            median = ints[ints.length / 2];
        }
        return (float) median;
    }

    public static double median(double[] ints) {
        double median;
        Arrays.sort(ints);
        if (ints.length % 2 == 0) {
            median = (ints[ints.length / 2] + ints[ints.length / 2 - 1]) / 2;
        } else {
            median = ints[ints.length / 2];
        }
        return median;
    }
}