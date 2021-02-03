/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * <p>
 * What is the sum of the digits of the number 2^1000?
 */


package net.projecteuler.Task_16;
import java.math.BigInteger;

public class PowerDigitSum {

    private final static int DECLARED_EXPONENT = 1000;

    public static void main(String[] args) {

        BigInteger multiplyResult = getPowerOfTwo(DECLARED_EXPONENT);
        int resultOfExponentiation = 0;

        for (int i = 0; i < multiplyResult.toString().length(); i++) {
            System.out.println(multiplyResult.toString().charAt(i));
            resultOfExponentiation += multiplyResult.toString().charAt(i) - '0';
        }

        System.out.println(resultOfExponentiation);

    }

    private static BigInteger getPowerOfTwo(int exponent) {
        return BigInteger.TWO.pow(exponent);
    }
}
