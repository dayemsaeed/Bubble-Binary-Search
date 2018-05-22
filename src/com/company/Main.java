package com.company;

public class Main extends BubbleSort {

    public static void main(String[] args) {
	// write your code here

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 3, 4, 1092, 85, 59, 60, 123, 583, 234,1102, 340};

        int mid_array_index = (array.length / 2) - 1;

        System.out.println("Original Array: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        BubbleSort obj = new BubbleSort();
        obj.bubbleSort(array);

        System.out.println("Sorted Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

        int found = obj.binarySearch(array , 85, 1, array.length);
        System.out.println("Number found: " + found);

    }

}
