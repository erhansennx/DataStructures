package com.company;

import java.util.Arrays;

public class Stack {
    //LIFO Principle

    int[] array;
    int elementCount = 0;

    public Stack(int size) {
        array = new int[size];
    }

    public void push(int number) {
        if (elementCount != array.length) {
            array[elementCount++] = number;
        } else {
            System.out.println("Array is full " + number + " not added stack !");
        }
    }

    public int pop() {

        if (elementCount != 0) {
            int r = array[--elementCount];
            System.out.println("Stack Pop : " + r);
            array[elementCount] = 0;
            return r;
        } else {
            System.out.println("Stack is empty.");
            array[0] = 0;
            return 0;
        }

    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }


}
