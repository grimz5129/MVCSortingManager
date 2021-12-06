package com.sparta.mvc.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumGen {
    private static int t = 20;
    /**
     * The random array of ints generator.
     * @return
     */
    public static int[] generateArr(){
        int[] myArr = IntStream.generate(() -> new Random().nextInt(100)).limit(t).toArray();
        return myArr;
    }

    /**
     * The random list of ints generator.
     * @return
     */
    public static List<Integer> generateList(){
        List<Integer> myArr = new ArrayList<>();
        for(int i = 0; i < t; i++){
            myArr.add(new Random().nextInt(100));
        }
        return myArr;
    }

    public static void setSize(int a){
        t = a;
    }
}
