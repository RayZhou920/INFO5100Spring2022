package com.company;

public class Main {

    public static void main(String[] args) {
        int num = 4;
        int value = countEven(4);
    }

    public static int countEven(int num) {

        if (num == 1) return 0;

        int count = 0;

        int sum = 0;
        for (int i = 2; i <= num; i++) {
            sum = 0;
            while (i != 0) {
                sum += i % 10;
                i = i / 10;
            }
            if (sum != 0 && sum % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
