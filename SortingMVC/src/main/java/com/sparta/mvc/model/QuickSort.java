package com.sparta.mvc.model;

import java.util.List;

public class QuickSort implements Sorter{

    /**
     * Override the Sorter sort method and calls quicksort on arrays.
     * @param arr
     * @return
     */
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

    /**
     * quicksort applied to the array partitions.
     * @param arr
     * @param start
     * @param end
     */
    public void quickSort(int arr[], int start, int end) {
        if (start < end) {
            int partIndex = partition(arr, start, end);

            quickSort(arr, start, partIndex - 1);
            quickSort(arr, partIndex + 1, end);
        }
    }

    /**
     * This sorts the quicksort array.
     * @param arr
     * @param start
     * @param end
     * @return
     */
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

    /**
     * Override the Sorter sort method and calls quicksort on lists
     * @param list
     * @param <T>
     * @return
     */
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

    /**
     * The quicksort list method.
     * @param list
     * @param start
     * @param end
     * @param <T>
     */
    public static <T extends Comparable> void quickSortList(List<T> list, int start, int end)
    {
        if (start < end)
        {
            int p = partitionList(list, start, end);
            quickSortList(list, start, p);
            quickSortList(list, p+1, end);
        }
    }

    /**
     * This sorts the quicksort list.
     * @param list
     * @param start
     * @param end
     * @param <T>
     * @return
     */
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
