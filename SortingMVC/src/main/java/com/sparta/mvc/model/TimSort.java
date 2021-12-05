package com.sparta.mvc.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimSort implements Sorter {
    /**
     * This runs the Arrays sort method on the array
     * @param arr
     * @return
     */
    @Override
    public int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    /**
     * This runs the Collection sort method on the list.
     * @param list
     * @param <T>
     * @return
     */
    @Override
    public <T extends Comparable> List<T> sort(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
