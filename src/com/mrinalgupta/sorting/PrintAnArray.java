package com.mrinalgupta.sorting;

import java.util.Arrays;
import java.util.Iterator;

public class PrintAnArray {
    public static void printArray(int[] arr){

        // using for loop
        for (int j : arr) {
            System.out.println("array is : " + j);
        }

        // using for each loop
        for(int i : arr){
            System.out.println(i);
        }

        // using toString() method
        System.out.println(Arrays.toString(arr));

        // using asList() method
        System.out.println(Arrays.asList(arr));

        //using Java iterator interface

        for (int[] ints : Arrays.asList(arr)) System.out.println(Arrays.toString(ints));
    }
}
