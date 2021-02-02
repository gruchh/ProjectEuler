/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
* */

package net.projecteuler.Task_10;

public class SummationOfPrimes {

    public static void main(String[] args) {

        long primeNumberGivenToCheck = 3;
        long sumOfAllPrimesBelowDeclaredValue = 2;
        long maxSummedPrimeValue = 2000000;

        while (primeNumberGivenToCheck < maxSummedPrimeValue) {

            if (isNumberPrime(primeNumberGivenToCheck))
            {
                sumOfAllPrimesBelowDeclaredValue += primeNumberGivenToCheck;
            }

            primeNumberGivenToCheck = primeNumberGivenToCheck + 2;

        }
        System.out.println(sumOfAllPrimesBelowDeclaredValue);
    }

    private static boolean isNumberPrime(long primeNumber) {

        for (long i = 2; i<=Math.sqrt(primeNumber); i++)
        {
            if (primeNumber %i==0) {
                return false;
            }
        }
        return true;
    }

}
