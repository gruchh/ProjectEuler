/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package net.projecteuler;

public class LargestPalindromeProduct {

    public static void main(String[] args) {
        int generatedResult = 0, maxPalindromeValue = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                generatedResult = i * j;
                if (checkPalindrome(generatedResult) && generatedResult > maxPalindromeValue) {
                    maxPalindromeValue = generatedResult;
                }
            }
        }
        System.out.println(maxPalindromeValue);

    }

    private static boolean checkPalindrome(int number) {

        int digit = 0, invertedNumber = 0;
        int numberTemporaryForInverse = number;

        while (numberTemporaryForInverse != 0) {
            digit = numberTemporaryForInverse % 10;
            invertedNumber = invertedNumber * 10 + digit;
            numberTemporaryForInverse = numberTemporaryForInverse / 10;
        }

        if (number == invertedNumber) {
            return true;
        }
        return false;

    }

}

