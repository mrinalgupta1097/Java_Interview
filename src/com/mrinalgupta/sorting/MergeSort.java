package com.mrinalgupta.sorting;

public class MergeSort {

    public void mergeSort(int[] arr, int n){
        // if the array has only one element
        //then it is already sorted
        if(n < 2){
            return;
        }

        //calculating mid index to split array
        int mid = n/2;

        // creating left and right sub-arrays
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n-mid];

        //copying array into left and right sub-array
        for(int i = 0;i<mid;i++){
            leftArray[i] = arr[i];
        }
        for (int i = mid;i < n;i++){
            rightArray[i-mid] = arr[i];
        }

        //recursive calls
        mergeSort(leftArray, mid);
        mergeSort(rightArray,n-mid);

        //merge call
        merge(arr, leftArray,rightArray, mid,n-mid);


    }
    public void merge(int[]arr,int[] leftArray, int[] rightArray, int left, int right){
        int i=0,j=0,k=0;
        while(i<left && j<right){
            if(leftArray[i] <= rightArray[j]){
                arr[k++] = leftArray[i++];
            }
            else{
                arr[k++] = rightArray[j++];
            }
        }
        //copy remanining elements if any
        while(i<left){
            arr[k++] = leftArray[i++];
        }
        while(j<right){
            arr[k++] = rightArray[j++];
        }
    }
}
