package com.sparta.mvc.controller;

import com.sparta.mvc.model.*;
import com.sparta.mvc.view.SortingView;
import java.util.*;

public class SortingController {
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
                Arrays.sort(arr);
                SortingView.displayArr(arr, 2);
            } else {
                Collections.sort(myArr);
                SortingView.displayList(myArr, 2);
            }
            Main.logger.info("Successful Collection Sort");

        } else if (choice.equals("binary")) {
            if(type.equals("array")){
                SortingView.displayArr(SorterFactory.getType("binary").sort(arr), 2);
            } else {

            }
            Main.logger.info("Successful Binary Sort");
        }

        SortingView.displaySpeed(startTime, System.nanoTime());
        SortingView.continueProgram();

    }


}
