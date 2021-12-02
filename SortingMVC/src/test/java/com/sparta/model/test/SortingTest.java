package com.sparta.model.test;

import com.sparta.mvc.model.BubbleSort;
import com.sparta.mvc.model.QuickSort;
import com.sparta.mvc.model.SorterFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    @DisplayName("Testing bubble sort")
    @Test
    public void testBubbleSort(){
        String arrExp = "[0, 2, 11, 32, 51, 72, 179, 234]";
        int arr[] = {179,51,72,32,234,11,2,0};
//        assertEquals(arrExp, Arrays.toString(new BubbleSort().sort(arr)));
        assertEquals(arrExp, Arrays.toString(SorterFactory.getType("bubble").sort(arr)));
    }

    @DisplayName("Testing bubble sort with negative number")
    @Test
    public void testBubbleSortWithNegative(){
        String arrExp = "[-2, 0, 11, 32, 51, 72, 179, 234]";
        int arr[] = {179,51,72,32,234,11,-2,0,};
        assertEquals(arrExp, Arrays.toString(new BubbleSort().sort(arr)));
    }

    @DisplayName("Testing quick sort")
    @Test
    public void testQuickSort(){
        String arrExp = "[0, 2, 11, 32, 51, 72, 179, 234]";
        int arr[] = {179,51,72,32,234,11,2,0};
        assertEquals(arrExp, Arrays.toString(new QuickSort().sort(arr)));
    }

    @DisplayName("Testing quick sort with negative number")
    @Test
    public void testQuickSortWithNegative(){
        String arrExp = "[-2, 0, 11, 32, 51, 72, 179, 234]";
        int arr[] = {179,51,72,32,234,11,-2,0};
        assertEquals(arrExp, Arrays.toString(new BubbleSort().sort(arr)));
    }

    @DisplayName("Testing collection sort with list")
    @Test
    public void testCollectionSort(){
        List<Integer> myArr = new ArrayList<>(List.of(2,4,56,3,242,5,23,424,1,423,4,234,25,235));
        String arrExp = "[1, 2, 3, 4, 4, 5, 23, 25, 56, 234, 235, 242, 423, 424]";
        Collections.sort(myArr);
        assertEquals(arrExp, myArr.toString());
    }


}
