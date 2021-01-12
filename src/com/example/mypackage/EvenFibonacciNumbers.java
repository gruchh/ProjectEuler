package com.example.mypackage;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {

        int[] ArrayValues = new int[3];
        ArrayValues[0] = 1;
        ArrayValues[1] = 1;
        ArrayValues[2] = 0;
        int sum = 0;
        int MaxValue = 4000000;

        do {
            ArrayValues[2] = ArrayValues[0] + ArrayValues[1];

            if (ArrayValues[2] % 2 == 0 && ArrayValues[2] != MaxValue) {
                sum += ArrayValues[2];
            }

            ArrayValues[0] = ArrayValues[1];
            ArrayValues[1] = ArrayValues[2];

        }
        while (ArrayValues[2] < MaxValue);

        System.out.println("Suma wszystkich wyrazow ciagu podzielnych przez 2 i mniejszych niz " + MaxValue + "wynosi " + sum);

    }
}
