package com.mrinalgupta.sorting;

// with each pass the largest element bubble to the top
// that is why it is called bubble sort
public class BubbleSort {

    public void bubbleSort(int[] arr){
        var n = arr.length;
        // to move forward with another pass
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j<n-i-1; j++ ){
                if(arr[j] > arr[j+1]){
                    //swap
                    var temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
