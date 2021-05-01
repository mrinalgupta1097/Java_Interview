package com.mrinalgupta.sorting;

import java.util.Arrays;

public class SelectionSort {
//    The selection sort algorithm sorts an array by
//    repeatedly finding the minimum element (considering ascending order)
//    from unsorted part and putting it at the beginning.
//    The algorithm maintains two subarrays in a given array.

//        1) The subarray which is already sorted.
//        2) Remaining subarray which is unsorted.

    public static void sort(int[] arr){
        var n = arr.length;
        // for moving the boundary of unsorted subarray one by one
        for (var i = 0; i<n-1; i++){

            //set i as minimum index
            var min_index = i;
            // find the minimum element in the unsorted subarray
            for(var j =i+1; j<n; j++ ){
                // check if the current element is smaller than minimum element
                if(arr[j] < arr[min_index]){
                    min_index = j;

                }
            }
            //if true than swap it with minimum element

            var temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;


        }
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 9;
        arr[3] = 7;
        sort(arr);
        printArray(arr);
    }


}
