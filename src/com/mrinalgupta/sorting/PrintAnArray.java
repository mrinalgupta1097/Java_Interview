package com.mrinalgupta.sorting;

import java.util.Arrays;
import java.util.Iterator;

public class PrintAnArray {
    public static void printArray(int[] arr){

        // using for loop
        for(int i =0; i < arr.length; i++){
            System.out.println("array is : " + arr[i]);
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

        for (int[] ints : Arrays.asList(arr)) System.out.println(ints);
    }
}
