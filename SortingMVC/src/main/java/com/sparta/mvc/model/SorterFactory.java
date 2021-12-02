package com.sparta.mvc.model;

public class SorterFactory {
    public static Sorter getType(String type) {
        if (type.equals("bubble")) {
            return new BubbleSort();
        } else if (type.equals("quick")) {
            return new QuickSort();
        } else if(type.equals("binary")) {
            return new BinaryTreeSort();
        } else {
            return null;
        }
    }


}
