package com.sparta.mvc.view;

import com.sparta.mvc.controller.Main;
import com.sparta.mvc.controller.SortingController;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortingView {
    public static void displayOptions() {
        System.out.println("-----------------------\nEnter Chosen Algorithm \n1) Bubble \n2) Quick \n3) Collection \n4) Tree \n-----------------------");
        Scanner scan = new Scanner(System.in);
        String choice = scan.next().toLowerCase();

        if(choice.equals("bubble") || choice.equals("quick") || choice.equals("collection") || choice.equals("tree")){
            System.out.println("-----------------------\nEnter Type of List \n1) Array \n2) List \n-----------------------");
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
            System.out.println("-------------------------------------------------" +
                    "-------------------------------------------\nUnsorted Array: " + Arrays.toString(arr));
        } else {
            System.out.println("Sorted Array: " + Arrays.toString(arr) + "\n-------------------------------------------------" +
                    "-------------------------------------------");
        }
    }

    public static void displayList(List<Integer> list, int i){
        if(i == 1){
            System.out.println("-------------------------------------------------" +
                    "-------------------------------------------\nUnsorted List: " + list);
        } else {
            System.out.println("Sorted List: " + list + "\n-------------------------------------------------" +
            "-------------------------------------------");
        }
    }


    public static void displaySpeed(long startTime, long endTime){
        double var = ((double)endTime - startTime) / 1000000000.0;
        String format = String.format("%.6f",var);
        System.out.println(format + " Seconds");
        Main.logger.info("The sort algorithm took  " + format + " seconds to run");
    }

    public static void continueProgram(){
        System.out.println("\nWould you like to continue? \n1) Yes \n2) No");
        Scanner scan = new Scanner(System.in);
        String option = scan.next().toLowerCase();
        if(option.equals("yes")){
            Main.logger.info("The user has continued the program");
            displayOptions();
        } else if (option.equals("no")){
            Main.logger.info("The user has ended the program");
            System.exit(0);
        } else {
            System.out.println("Invalid option");
            Main.logger.info("The program is waiting for a yes or no");
            continueProgram();
        }

    }


}
