package com.training.es.hw7;

import java.util.Arrays;
import java.util.List;

public class ArrayWrapper<T> {
    private List<T> list;

    public ArrayWrapper(T[] a) {
        list = Arrays.asList(a);
    }

    public T get(int i) throws IncorrectArrayWrapperIndex {
        if (i <= 0 || i > list.size()) {
            throw new IncorrectArrayWrapperIndex("Out of bounds");
        }
        return list.get(i - 1);
    }

    public boolean replace(int index, T replacement) {
        if (replacement instanceof String
                && replacement.toString().length() <= list.get(index - 1).toString().length()) {
            return false;
        } else if (replacement instanceof Integer
                && (Integer) replacement <= (Integer) list.get(index - 1)) {
            return false;
        } else {
            list.set(index - 1, replacement);
            return true;
        }
    }
}