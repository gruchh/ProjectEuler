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

    static final double DEFAULT_a = 1;
    static final double DEFAULT_b = 2;
    static final double DEFAULT_c = 3;

    public static void main(String[] args) {

        double a = DEFAULT_a;
        double b = DEFAULT_b;
        double c = DEFAULT_c;
        boolean finalResult = false;
        int maxValue = 1000;

        while (!finalResult) {
            resetVariables(b, c);
            for (b = 2; a + b + c < maxValue; b++) {
                c = countHypotenuseOfATriangle(a, b);

                if (checkValues(a, b, c, maxValue)) {
                    System.out.println("Znaleziono wartości zmiennych spełniające zależność: \n" + "a: " + a + " b: " + b + " c: " + c);
                    finalResult = true;
                }
            }
            a++;
        }
    }

    public static void resetVariables(double b, double c) {
        b = DEFAULT_b;
        c = DEFAULT_c;
    }

    public static double countHypotenuseOfATriangle(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public static boolean checkValues(double a, double b, double c, double maxValue) {
        return a + b + c == maxValue;
    }
}
