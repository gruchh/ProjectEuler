/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package net.projecteuler;

public class LargestPrimeFactor {

    public static void main(String[] args) {

        long number = 600851475143L;
        long divider = 1;

        while (number != 1) {
            divider = findDivider(number);
            System.out.println(number + " " + divider);
            number = number / divider;
        }

        System.out.println("Najwiekszy dzielnik to: " + divider);

    }

    private static int findDivider(long declaredValue) {
        int i = 2;

        while (declaredValue % i != 0) {
            i++;
        }
        return i;
    }
}
