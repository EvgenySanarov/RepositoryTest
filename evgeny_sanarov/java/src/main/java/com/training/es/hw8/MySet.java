package com.training.es.hw8;

import java.util.HashSet;

public class MySet<T> extends HashSet<T> {

    public MySet(HashSet<T> set) {
        super(set);
    }

    public void union(MySet<T> set) {
        this.addAll(set);
    }

    public void intersect(MySet<T> set) {
        this.retainAll(set);
    }

    public void remove(MySet<T> set) {
        this.removeAll(set);
    }

    public void symmetricDifference(MySet<T> set) {
        HashSet<T> intersectSet = new HashSet<>(this);
        this.addAll(set);
        intersectSet.retainAll(set);
        this.removeAll(intersectSet);
    }
}