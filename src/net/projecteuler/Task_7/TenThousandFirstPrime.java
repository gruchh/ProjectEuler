/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 *
 * */

package net.projecteuler.Task_7;

public class TenThousandFirstPrime {
    public static void main(String[] args) {

        int lastPrimeNumber=2;

    for (int i= 2 ; i<=10001;) {

        if (isNumberFirst(lastPrimeNumber)==true) {
            i++;
        }
        lastPrimeNumber++;
    }
        System.out.println(lastPrimeNumber);

    }

    private static boolean isNumberFirst (int testNumber) {

        for(int i=2; i<=Math.sqrt(testNumber); i++) {
            if (testNumber%i==0) {
                return false;
            }
        }
        return true;
    }

}
