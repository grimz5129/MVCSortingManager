package com.sparta.model.test;

import com.sparta.mvc.model.SorterFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    /**
     * Bubble Sort Tests
     */
    @DisplayName("Testing bubble sort")
    @Test
    public void testBubbleSort(){
        String arrExp = "[0, 2, 11, 32, 51, 72, 179, 234]";
        int arr[] = {179,51,72,32,234,11,2,0};
        assertEquals(arrExp, Arrays.toString(SorterFactory.getType("bubble").sort(arr)));
    }

    @DisplayName("Testing bubble sort with negative number")
    @Test
    public void testBubbleSortWithNegative(){
        String arrExp = "[-234, -51, -32, -11, -2, 0, 72, 179]";
        int arr[] = {179,-51,72,-32,-234,-11,-2,0,};
        assertEquals(arrExp, Arrays.toString(SorterFactory.getType("bubble").sort(arr)));
    }

    /**
     * Quick Sort Tests
     */
    @DisplayName("Testing quick sort")
    @Test
    public void testQuickSort(){
        String arrExp = "[0, 2, 11, 32, 51, 72, 179, 234]";
        int arr[] = {179,51,72,32,234,11,2,0};
        assertEquals(arrExp, Arrays.toString(SorterFactory.getType("quick").sort(arr)));
    }

    @DisplayName("Testing quick sort with negative number")
    @Test
    public void testQuickSortWithNegative(){
        String arrExp = "[-234, -72, -32, -11, -2, 0, 51, 179]";
        int arr[] = {179,51,-72,-32,-234,-11,-2,0};
        assertEquals(arrExp, Arrays.toString(SorterFactory.getType("quick").sort(arr)));
    }

    /**
     * Collection/Arrays Sort Tests
     */
    @DisplayName("Testing collection sort with arrays")
    @Test
    public void testArraysSort(){
        int arr[] = {179,51,72,32,234,11,2,0};
        String arrExp = "[0, 2, 11, 32, 51, 72, 179, 234]";
        Arrays.sort(arr);
        assertEquals(arrExp, Arrays.toString(arr));
    }

    @DisplayName("Testing collection sort with arrays negatives")
    @Test
    public void testArraysSortNegative(){
        int arr[] = {179,51,-72,-32,-234,-11,-2,0};
        String arrExp = "[-234, -72, -32, -11, -2, 0, 51, 179]";
        Arrays.sort(arr);
        assertEquals(arrExp, Arrays.toString(arr));
    }

    @DisplayName("Testing collection sort")
    @Test
    public void testCollectionSort(){
        List<Integer> myArr = new ArrayList<>(List.of(2,4,56,3,242,5,23,424,1,423,4,234,25,235));
        String arrExp = "[1, 2, 3, 4, 4, 5, 23, 25, 56, 234, 235, 242, 423, 424]";
        Collections.sort(myArr);
        assertEquals(arrExp, myArr.toString());
    }

    @DisplayName("Testing collection sort with negatives")
    @Test
    public void testCollectionSortNegatives(){
        List<Integer> myArr = new ArrayList<>(List.of(-2,-4,-56,-3,-242,-5,-23,-424,1,-423,-4,-234,25,-235));
        String arrExp = "[-424, -423, -242, -235, -234, -56, -23, -5, -4, -4, -3, -2, 1, 25]";
        Collections.sort(myArr);
        assertEquals(arrExp, myArr.toString());
    }


    /**
     * Tree Sort Tests
     */
    @DisplayName("Testing bubble sort")
    @Test
    public void testTreeSort(){
        String arrExp = "[0, 22, 24, 62, 121, 194, 200, 531]";
        int arr[] = {194,531,22,62,24,121,200,0};
        assertEquals(arrExp, Arrays.toString(SorterFactory.getType("bubble").sort(arr)));
    }

    @DisplayName("Testing bubble sort with negative number")
    @Test
    public void testTreeSortWithNegative(){
        String arrExp = "[-531, -200, -194, -62, -24, 0, 22, 121]";
        int arr[] = {-194,-531,22,-62,-24,121,-200,0};
        assertEquals(arrExp, Arrays.toString(SorterFactory.getType("bubble").sort(arr)));
    }

}
