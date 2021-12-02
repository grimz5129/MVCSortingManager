package com.sparta.mvc.model;

import com.sparta.mvc.controller.Main;

import java.util.List;

public class BubbleSort implements Sorter{
    @Override
    public int[] sort(int array[]) {
        // length of the array
        int size = array.length;
        // for loop for the array
        for (int i = 0; i < (size - 1); i++) {
            // loop to compare 2 elements
            for (int j = 0; j < (size - i - 1); j++) {
                // compare the 3 elements, can be set to asc or desc
                if (array[j] > array[j + 1]) {
                    // swap the numbers around
                    int n = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = n;
                }
            }
        }
        //return array
        return array;
    }

    @Override
    public <T extends Comparable>List<T> sort(List<T> list) {
        // length of the list
        int size = list.size();
        // for loop for the list
        for (int i = 0; i < (size - 1); i++) {
            // loop to compare 2 elements
            for (int j = 0; j < (size - i - 1); j++) {
                // compare the 3 elements, can be set to asc or desc
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // swap the numbers around
                    T n = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, n);
                }
            }
        }
        //returns the list
        return list;
    }
}
