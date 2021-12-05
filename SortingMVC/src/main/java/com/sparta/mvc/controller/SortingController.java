package com.sparta.mvc.controller;

import com.sparta.mvc.model.*;
import com.sparta.mvc.view.SortingView;
import java.util.*;

public class SortingController {
    /**
     * The algoChoice method takes two strings as a parameter and runs the appropriate sorting algorithms.
     * The output is sent to the view to display.
     * The choice is the algorithm and the type is either array or list.
     * @param choice
     * @param type
     */
    public static void algoChoice(String choice, String type){
        int[] arr = RandomNumGen.generateArr();
        List<Integer> myArr = RandomNumGen.generateList();
        long startTime = System.nanoTime();

        if(type.equals("array")){
            SortingView.displayArr(arr, 1);
        } else {
            SortingView.displayList(myArr, 1);
        }

        if (choice.equals("bubble")){
            if(type.equals("array")){
                SortingView.displayArr(SorterFactory.getType("bubble").sort(arr), 2);
            } else {
                SortingView.displayList(SorterFactory.getType("bubble").sort(myArr), 2);
            }
            Main.logger.info("Successful Bubble Sort");

        } else if (choice.equals("quick")){
            if(type.equals("array")){
                SortingView.displayArr(SorterFactory.getType("quick").sort(arr), 2);
            } else {
                SortingView.displayList(SorterFactory.getType("bubble").sort(myArr), 2);
            }
            Main.logger.info("Successful Quick Sort");

        } else if(choice.equals("collection")){
            if(type.equals("array")){
                SortingView.displayArr(SorterFactory.getType("collection").sort(arr), 2);
            } else {
                SortingView.displayList(SorterFactory.getType("collection").sort(myArr), 2);
            }
            Main.logger.info("Successful Collection Sort");

        } else if (choice.equals("tree")) {
            if(type.equals("array")){
                SortingView.displayArr(SorterFactory.getType("tree").sort(arr), 2);
            } else {
                SortingView.displayList(SorterFactory.getType("tree").sort(myArr), 2);
            }
            Main.logger.info("Successful Tree Sort");
        }

        SortingView.displaySpeed(startTime, System.nanoTime());
        SortingView.continueProgram();

    }


}
