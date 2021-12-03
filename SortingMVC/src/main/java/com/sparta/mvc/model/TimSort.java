package com.sparta.mvc.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimSort implements Sorter {
    @Override
    public int[] sort(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    @Override
    public <T extends Comparable> List<T> sort(List<T> list) {
        Collections.sort(list);
        return list;
    }
}
