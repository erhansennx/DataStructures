package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[10];
        Random random = new Random();
        int holder;

        for (int i = 0; i < array.length; i++) {
            holder = random.nextInt(50);
            array[i] = holder;
        }

        System.out.println("Array Sorting -> " + Arrays.toString(array));

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sorting(array);
    }
}
