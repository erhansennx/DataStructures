package com.company;

import java.util.Arrays;

public class BubbleSort {

    public void sorting(int[] array) {

        int minimum;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    minimum = array[j];
                    array[j] = array[i];
                    array[i] = minimum;
                }
            }
        }
        System.out.println("Array Sorted -> " + Arrays.toString(array));
    }
}
