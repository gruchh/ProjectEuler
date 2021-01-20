/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
package net.projecteuler;

public class SmallestMultiple {

    public static void main(String[] args) {
        int maxValue = 1;
        boolean reminderWithoutAnyReminder = false;

        while(!reminderWithoutAnyReminder) {

            if (isAnyReminder(maxValue)) {
                System.out.println(maxValue);
                reminderWithoutAnyReminder = true;
            } else {
                maxValue++;
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
