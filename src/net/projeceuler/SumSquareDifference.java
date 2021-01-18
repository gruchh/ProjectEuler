/**
 * The sum of the squares of the first ten natural numbers is 385,
 * The square of the sum of the first ten natural numbers is 3025,
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

package net.projeceuler;

public class SumSquareDifference {

    public static void main(String[] args) {

        int sumSquares=0, squareOfTheSum=0;

        for (int i=1; i<=100; i++) {
            sumSquares += Math.pow(i,2);
            squareOfTheSum+=i;
        }

        squareOfTheSum *= squareOfTheSum;
        System.out.println("Różncia pomiędzy kwadratem sumy, a sumą kwadratów wynosi: " + (squareOfTheSum-sumSquares));

    }
}
