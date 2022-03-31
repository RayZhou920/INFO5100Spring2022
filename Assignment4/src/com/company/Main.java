package com.company;

import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
	// Assignment4 code by rui zhou
        int capacity = 10;
        BlockingQueue bq = new BlockingQueue<>(capacity);
        try {
            bq.add(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            bq.add(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(bq.remove());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(bq.isEmpty());
    }
}
