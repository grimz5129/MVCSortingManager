package com.sparta.mvc.model;

public class SorterFactory {
    /**
     * Sorter Factory that returns the sort method for each class.
     * @param type
     * @return
     */
    public static Sorter getType(String type) {
        if (type.equals("bubble")) {
            return new BubbleSort();
        } else if (type.equals("quick")) {
            return new QuickSort();
        } else if(type.equals("collection")){
            return new TimSort();
        } else if(type.equals("tree")) {
            return new TreeSort();
        } else {
            return null;
        }
    }


}
