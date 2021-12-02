package com.sparta.mvc.view;

import com.sparta.mvc.controller.Main;
import com.sparta.mvc.controller.SortingController;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortingView {
    public static void displayOptions() {
        System.out.println("Enter Chosen Algorithm \n1) Bubble \n2) Quick \n3) Collection \n4) Binary");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next().toLowerCase();

        if(choice.equals("bubble") || choice.equals("quick") || choice.equals("collection") || choice.equals("binary")){
            System.out.println("Enter Type of List \n1) Array \n2) List");
            Scanner scan2 = new Scanner(System.in);
            String type = scan2.next().toLowerCase();

            if(type.equals("array") || type.equals("list")){
                Main.logger.info("The user has selected the " + choice + " algorithm using " + type + "s");
                SortingController.algoChoice(choice, type);
            } else {
                Main.logger.info("The user has entered the incorrect array type " + type);
                displayOptions();
            }

        } else {
            Main.logger.info("The user has entered the incorrect algorithm type " + choice);
            displayOptions();
        }

    }

    public static void displayArr(int arr[], int i){
        if(i == 1) {
            System.out.println("Unsorted Array: " + Arrays.toString(arr));
        } else {
            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }
    }

    public static void displayList(List<Integer> arr, int i){
        if(i == 1){
            System.out.println("Unsorted List: " + arr);
        } else {
            System.out.println("Sorted List: " + arr);
        }
    }


    public static void displaySpeed(long startTime, long endTime){
        double var = ((double)endTime - startTime) / 1000000000.0;
        String format = String.format("%.6f",var);
        System.out.println(format + " Seconds");
        Main.logger.info("The sort algorithm took  " + format + " seconds to run");
    }




}
