package com.mrinalgupta.sorting;

public class BubbleSortOptimized {

    public void bubbleSort(int[] arr){
        int i,j,temp;
        boolean swapped;
        int n = arr.length;
        for(i=0;i<n-1;i++){
            swapped =false;
            for(j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j=1] = temp;
                    swapped = true;
                }
            }
            //if no two elements are swapped by
            //inner loop then break
            if(swapped == false){
                break;
            }
        }

    }
}
