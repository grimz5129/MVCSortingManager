package com.sparta.mvc.model;

import java.util.List;

public class BinaryTreeSort implements Sorter {

    @Override
    public int[] sort(int[] arr) {
        binarySort(arr, arr.length);
        return arr;
    }

    int binarySearch(int a[], int x, int low, int high)
    {
        if (high <= low)
            return (x > a[low]) ?
                    (low + 1) : low;

        int mid = (low + high) / 2;

        if (x == a[mid])
            return mid + 1;

        if (x > a[mid])
            return binarySearch(a, x,
                    mid + 1, high);
        return binarySearch(a, x, low,
                mid - 1);
    }

    void binarySort(int a[], int n)
    {
        for (int i = 1; i < n; ++i)
        {
            int j = i - 1;
            int key = a[i];
            int pos = binarySearch(a, key, 0, j);
            while (j >= pos)
            {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    @Override
    public <T extends Comparable> List<T> sort(List<T> list) {
        return null;
    }
}
