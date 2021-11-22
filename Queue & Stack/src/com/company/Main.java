package com.company;

public class Main {

    public static void main(String[] args) {

        
        System.out.println("\n- Queue - \n");
        Queue queue = new Queue(5);
        queue.push(2);
        queue.push(6);
        queue.push(1);
        queue.push(9);
        queue.push(3);
        queue.print();

        queue.pop();
        queue.print();

        queue.pop();
        queue.print();

        queue.pop();
        queue.print();

        queue.pop();
        queue.print();

        queue.pop();
        queue.print();

        queue.pop();
        queue.print();


        System.out.println("\n- Stack -\n");
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(1);
        stack.push(9);
        stack.push(6);
        stack.push(7);
        stack.print();

        stack.pop();
        stack.print();

        stack.pop();
        stack.print();

        stack.pop();
        stack.print();

        stack.pop();
        stack.print();

        stack.pop();
        stack.print();

        stack.pop(); //EMPTY METHOD
        stack.print();


    }
}
