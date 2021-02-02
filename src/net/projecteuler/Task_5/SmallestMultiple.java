/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
package net.projecteuler.Task_5;

public class SmallestMultiple {

    public static void main(String[] args) {
        int valueWithoutAnyRemainder = 1;
        boolean foundNumberWithoutAnyRemainder = false;

        while(!foundNumberWithoutAnyRemainder) {

            if (isAnyReminder(valueWithoutAnyRemainder)) {
                System.out.println(valueWithoutAnyRemainder);
                foundNumberWithoutAnyRemainder = true;
            } else {
                valueWithoutAnyRemainder++;
            }
        }
    }

    private static boolean isAnyReminder(int checkingValueForReminders) {

        for (int i = 1; i <= 20; i++) {
            if (checkingValueForReminders % i != 0) {
                return false;
            }
        }
        return true;
    }
}
