package com.mrinalgupta.sorting;



public class InsertionSort {
//    To sort an array of size n in ascending order:
//        1: Iterate from arr[1] to arr[n] over the array.
//        2: Compare the current element (key) to its predecessor.
//        3: If the key element is smaller than its predecessor,
//           compare it to the elements before.
//           Move the greater elements one position up to make space for the swapped element.

    public static int[] insertionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int j = i;
            while(j>0 && (arr[j-1] > arr[j])){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
}
