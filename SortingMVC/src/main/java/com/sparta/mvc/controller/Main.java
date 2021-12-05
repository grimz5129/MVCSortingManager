package com.sparta.mvc.controller;

import com.sparta.mvc.view.SortingView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    /**
     * Creates an instance of logger
     */
    public static final Logger logger = LogManager.getLogger("My MVC SortingManager");

    /**
     * Main method to run the program
     * @param args
     */
    public static void main(String[] args) {
        SortingView.displayOptions();
    }
}
