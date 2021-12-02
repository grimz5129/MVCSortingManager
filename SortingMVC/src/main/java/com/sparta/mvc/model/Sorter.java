package com.sparta.mvc.model;

import java.util.List;

public interface Sorter {
    int[] sort(int arr[]);
    <T extends Comparable>List<T> sort(List<T> list);
}

