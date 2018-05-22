package com.company;

public class BubbleSort {

    void bubbleSort(int arr[]) {

        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n-i); j++){
                if(arr[j - 1] > arr[j]){
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    int binarySearch(int arr[], int find, int left, int right) {

        if (right >= 1) {

            int mid = left + (right - left) / 2;

            if (find == arr[mid]) {
                return mid;
            }
            else if (find < arr[mid]) {
                return binarySearch(arr, find, left, mid - 1);
            }
            else {
                return binarySearch(arr, find, mid + 1, right);
            }

        }

        return -1;

    }

}
