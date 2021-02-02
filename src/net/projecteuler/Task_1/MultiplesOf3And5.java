package net.projecteuler.Task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplesOf3And5 {

    private static final int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ile liczb?");
        int numberToSum = sc.nextInt();
        ArrayList<Integer> generatedNumbers = findAllNumbers(numberToSum);
        showNumbers(generatedNumbers);
        System.out.println(showSum(generatedNumbers));
    }

    public static ArrayList<Integer> findAllNumbers(int Maximum) {

        ArrayList<Integer> numberList = new ArrayList<Integer>();

        for (int i = 1; i < Maximum; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numberList.add(i);
            }
        }
        return numberList;
    }

    public static int showSum(ArrayList<Integer> numberList) {
        int sum = 0;

        for (int m : numberList) {
            sum += m;
        }

        return sum;
    }

    private static void showNumbers(ArrayList<Integer> generatedNumbers) {
        for (int k : generatedNumbers) {
            System.out.println(k);
        }
    }

}