package com.training.es.hw5.task2;

public class SortingContext {
    private Sorter sortStrategy;

    SortingContext(Sorter sorter) {
        sortStrategy = sorter;
    }

    public void execute(int[] array) {
        sortStrategy.sort(array);
    }

}