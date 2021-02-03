/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * <p>
 * How many such routes are there through a 20×20 grid?
 */

package net.projecteuler.Task_15;

import java.math.BigInteger;

public class LatticePaths {

    private final static int MATRIX_SIDE = 20;

    public static void main(String[] args) {

        int possibilitiesCount = getPossiblesCount(MATRIX_SIDE);
        BigInteger counter = factoria(possibilitiesCount);
        BigInteger divider = factoria(MATRIX_SIDE).multiply(factoria(MATRIX_SIDE));
        BigInteger result = counter.divide(divider);

        System.out.println(result);
    }

    private static int getPossiblesCount(int matrixSide) {
        int[][] matrix = new int[matrixSide][matrixSide];
        return matrix.length + matrix[0].length;
    }

    public static BigInteger factoria(int max) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= max; i++) {
            BigInteger factor = new BigInteger(String.valueOf(i));
            result = result.multiply(factor);
        }

        return result;


    }


}
