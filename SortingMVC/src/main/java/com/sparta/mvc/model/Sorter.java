package com.sparta.mvc.model;

import java.util.List;

public interface Sorter {
    /**
     * The Sorter interface that all sorting algorithms implement.
     * @param arr
     * @return
     */
    int[] sort(int arr[]);
    <T extends Comparable>List<T> sort(List<T> list);
}

