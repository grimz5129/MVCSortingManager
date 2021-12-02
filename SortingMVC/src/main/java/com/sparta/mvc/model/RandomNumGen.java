package com.sparta.mvc.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumGen {
    public static int[] generateArr(){
        int[] myArr = IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        return myArr;
    }

    public static List<Integer> generateList(){
        List<Integer> myArr = new ArrayList<>();
        for(int i = 0; i <= 100; i++){
            myArr.add(new Random().nextInt(100));
        }
        return myArr;
    }



}
