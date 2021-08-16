package com.training.es.hw5.task2;

public class MainSorting {
    public static void main(String[] args) {
        Sorter bubbleSort = new BubbleSort();
        Sorter selectionSort = new SelectionSort();
        SortingContext context = new SortingContext(bubbleSort);
        context.execute(new int[]{1, 10, 5, 4});
    }
}