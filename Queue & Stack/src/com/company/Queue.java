package com.company;

import java.util.Arrays;

public class Queue {

    //FIFO Principle

    int[] array;
    int size, elementCount = 0;

    public Queue(int size) {
        array = new int[size];
        this.size = size;
    }

    public void push(int number) {

        if (elementCount != size) {
            array[elementCount++] = number;
        } else {
            System.out.println("Array is full " + number + " not added queue !");
        }

    }

    public int pop() {

        if (elementCount != 0) {
            int r = array[0];
            System.out.println("Queue Pop : " + r);
            for (int i = 0; i < elementCount - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--elementCount] = 0;
            return r;
        } else {
            System.out.println("Queue is empty.");
            return 0;
        }
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }


}