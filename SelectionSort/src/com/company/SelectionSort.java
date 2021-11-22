package com.company;

import java.util.Arrays;

public class SelectionSort {

    public void sorting(int[] array) {

        int holder = 0;
        int jHolder = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    holder = array[i];
                    array[i] = array[j];
                    jHolder = j;
                }
            }
            array[jHolder] = holder;
        }
        System.out.println("Selection Sorted -> " + Arrays.toString(array));

    }


}