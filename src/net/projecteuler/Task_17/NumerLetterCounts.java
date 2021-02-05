/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * <p>
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * <p>
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */

package net.projecteuler.Task_17;

import java.util.HashMap;

public class NumerLetterCounts {

    public static void main(String[] args) {
        HashMap<Integer, Integer> numeralsDictionary = new HashMap<Integer, Integer>();
        numeralsDictionary.put(0, 0);
        numeralsDictionary.put(1, "one".length());
        numeralsDictionary.put(2, "two".length());
        numeralsDictionary.put(3, "three".length());
        numeralsDictionary.put(4, "four".length());
        numeralsDictionary.put(5, "five".length());
        numeralsDictionary.put(6, "six".length());
        numeralsDictionary.put(7, "seven".length());
        numeralsDictionary.put(8, "eight".length());
        numeralsDictionary.put(9, "nine".length());
        numeralsDictionary.put(10, "ten".length());
        numeralsDictionary.put(11, "eleven".length());
        numeralsDictionary.put(12, "twelve".length());
        numeralsDictionary.put(13, "thirteen".length());
        numeralsDictionary.put(14, "fourteen".length());
        numeralsDictionary.put(15, "fifteen".length());
        numeralsDictionary.put(16, "sixteen".length());
        numeralsDictionary.put(17, "seventeen".length());
        numeralsDictionary.put(18, "eighteen".length());
        numeralsDictionary.put(19, "nineteen".length());
        numeralsDictionary.put(20, "twenty".length());
        numeralsDictionary.put(30, "thirty".length());
        numeralsDictionary.put(40, "forty".length());
        numeralsDictionary.put(50, "fifty".length());
        numeralsDictionary.put(60, "sixty".length());
        numeralsDictionary.put(70, "seventy".length());
        numeralsDictionary.put(80, "eighty".length());
        numeralsDictionary.put(90, "ninety".length());
        numeralsDictionary.put(100, "hundred".length());
        numeralsDictionary.put(1000, "thousand".length());

        long lettersSum = 0;

        for (int i = 1; i < 999; i++) {

            if (i >= 100 && i <= 999) {
                lettersSum += numeralsDictionary.get(i / 100) + numeralsDictionary.get(100) + "and".length();
            }

            if (i % 1000 <= 19) {
                if (numeralsDictionary.containsKey(i % 100)) {
                    lettersSum += numeralsDictionary.get(i % 100);
                }
            } else if (i % 100 >= 20 && i % 100 <= 99) {
                lettersSum += numeralsDictionary.get(((i % 100) / 10) * 10).intValue() + numeralsDictionary.get((i % 10)).intValue();
            }

        }
        lettersSum += numeralsDictionary.get(1000);

        System.out.println("Suma wszystkich liter: " + lettersSum);

    }
}
