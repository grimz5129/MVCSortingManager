package com.sparta.mvc.model;

import java.util.List;

public class QuickSort implements Sorter{

    //Override the Sorter sort method which calls quicksort
    @Override
    public int[] sort(int arr[]) {
        if (arr == null) return null;
        else if (arr.length <= 1){
            return arr;
        }else {
            quickSort(arr, 0, arr.length - 1);
            return arr;
        }
    }

    //quicksort applied to both partitions
    public void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int partIndex = partition(arr, start, end);

            quickSort(arr, start, partIndex - 1);
            quickSort(arr, partIndex + 1, end);
        }
    }

    //this sorts the array
    private int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

    //quicksort that takes a generic list of type T
    @Override
    public <T extends Comparable>List<T> sort(List<T> list) {
        if (list == null) return null;
        else if (list.size() <= 1){
            return list;
        }else {
            quickSortList(list, 0, list.size() - 1);
            return list;
        }
    }

    //sorts both partitions
    public static <T extends Comparable> void quickSortList(List<T> list, int start, int end)
    {
        if (start < end)
        {
            int p = partitionList(list, start, end);
            quickSortList(list, start, p);
            quickSortList(list, p+1, end);
        }
    }

    //swaps the elements of the arraylist
    private static <T extends Comparable> int partitionList(List<T> list, int start, int end) {
        T pivot = list.get(end);
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;

                T swapTemp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, swapTemp);
            }
        }

        T swapTemp = list.get(i+1);
        list.set(i+1, list.get(end));
        list.set(end, swapTemp);

        return i+1;
    }


}
