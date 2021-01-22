/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 */

package net.projecteuler;

public class SpecialPythagoreanTriplet {

    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;
        boolean finalResult = false;
        int maxValue = 1000;

        for (a = 1; !finalResult; a++) {
            b = 2;
            c = 3;
            for (b = 2; a + b + c < maxValue; b++) {
                c = countHypotenuseOfATriangle(a, b);

                if (checkValues(a, b, c, maxValue)) {
                    System.out.println("Znaleziono wartości zmiennych spełniające zależność: \n"+"a: " + a + " b: " + b + " c: " + c);
                    finalResult = true;
                }
            }
        }
    }

    public static double countHypotenuseOfATriangle(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static boolean checkValues(double a, double b, double c, double maxValue) {

        if (a + b + c == maxValue) {
            return true;
        }
        return false;
    }


}
