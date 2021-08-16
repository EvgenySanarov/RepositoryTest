package com.training.es.hw8;

import java.util.Arrays;
import java.util.HashSet;

public class MyClass {
    public static void main(String[] args) {
        MySet<Integer> set1 = new MySet<>(new HashSet<>(Arrays.asList(1, 2, 3, 4)));
        MySet<Integer> set2 = new MySet<>(new HashSet<>(Arrays.asList(3, 4, 5, 6)));
        set1.union(set2);
        System.out.println(set1);
        set1 = new MySet<>(new HashSet<>(Arrays.asList(1, 2, 3, 4)));
        set1.intersect(set2);
        System.out.println(set1);
        set1 = new MySet<>(new HashSet<>(Arrays.asList(1, 2, 3, 4)));
        set1.remove(set2);
        System.out.println(set1);
        set1 = new MySet<>(new HashSet<>(Arrays.asList(1, 2, 3, 4)));
        set1.symmetricDifference(set2);
        System.out.println(set1);
    }
}