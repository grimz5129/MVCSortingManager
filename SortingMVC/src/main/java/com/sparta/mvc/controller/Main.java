package com.sparta.mvc.controller;

import com.sparta.mvc.view.SortingView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static Logger logger = LogManager.getLogger("My MVC SortingManager");

    public static void main(String[] args) {
        SortingView.displayOptions();
    }
}
