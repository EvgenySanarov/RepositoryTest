package com.training.es.hw3;

public class Recursion {
    static int counter = 0;
    static int startFib = 0;

    public static void main(String[] args) {
        fibInt(startFib + 1, startFib);
        fibLong(startFib + 1, startFib);
    }

    public static int fibInt(int current, int previous) {
        if (current < 0) {
            System.out.println(counter);
            return 1;
        } else {
            counter++;
            int next = current + previous;
            return current + fibInt(next, current);
        }
    }

    public static long fibLong(long current, long previous) {
        if (current < 0) {
            System.out.println(counter);
            return 1;
        } else {
            counter++;
            long next = current + previous;
            return current + fibLong(next, current);
        }
    }
}