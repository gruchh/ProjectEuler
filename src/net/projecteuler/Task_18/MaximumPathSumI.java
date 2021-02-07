/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 *
 * That is, 3 + 7 + 4 + 9 = 23.
 *
 * Find the maximum total from top to bottom of the triangle below:
 *
 * 75
 * 95 64
 * 17 47 82
 * 18 35 87 10
 * 20 04 82 47 65
 * 19 01 23 75 03 34
 * 88 02 77 73 07 63 67
 * 99 65 04 28 06 16 70 92
 * 41 41 26 56 83 40 80 70 33
 * 41 48 72 33 47 32 37 16 94 29
 * 53 71 44 65 25 43 91 52 97 51 14
 * 70 11 33 28 77 73 17 78 39 68 17 57
 * 91 71 52 38 17 14 91 43 58 50 27 29 48
 * 63 66 04 68 89 53 67 30 73 16 69 87 40 31
 * 04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
 *
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)
 */


package net.projecteuler.Task_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumPathSumI {

    public static void main(String[] args) {

        String declaredTaskTraignle = "        75\n" +
                "        95 64\n" +
                "        17 47 82\n" +
                "        18 35 87 10\n" +
                "        20 04 82 47 65\n" +
                "        19 01 23 75 03 34\n" +
                "        88 02 77 73 07 63 67\n" +
                "        99 65 04 28 06 16 70 92\n" +
                "        41 41 26 56 83 40 80 70 33\n" +
                "        41 48 72 33 47 32 37 16 94 29\n" +
                "        53 71 44 65 25 43 91 52 97 51 14\n" +
                "        70 11 33 28 77 73 17 78 39 68 17 57\n" +
                "        91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                "        63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                "        04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

        List<List<Integer>> declaredTriangleAsListInteger = new ArrayList<>();
        Scanner everyLineScanner = new Scanner(declaredTaskTraignle);
        int scanRowsNumbers = 0;

        while (everyLineScanner.hasNextLine()) {
            declaredTriangleAsListInteger.add(makeAnIntegerArrayFromString(everyLineScanner.nextLine()));
            scanRowsNumbers++;
        }

        int biggestValueFromAddingPossibleValues = 0;

        for (int i = scanRowsNumbers-1; i > 0; i--) {
            for (int j = 0; j < declaredTriangleAsListInteger.get(i - 1).size(); j++) {

                if (declaredTriangleAsListInteger.get(i).get(j) > declaredTriangleAsListInteger.get(i).get(j + 1)) {
                    biggestValueFromAddingPossibleValues = declaredTriangleAsListInteger.get(i-1).get(j) + declaredTriangleAsListInteger.get(i).get(j);
                } else {
                    biggestValueFromAddingPossibleValues = declaredTriangleAsListInteger.get(i-1).get(j) + declaredTriangleAsListInteger.get(i).get(j+1);
                }
                declaredTriangleAsListInteger.get(i-1).set(j, biggestValueFromAddingPossibleValues);
            }
            declaredTriangleAsListInteger.remove(i);
        }

        System.out.println("Najwieksza mozliwa do uzyskania wartosc to: " + declaredTriangleAsListInteger.get(0).get(0));
    }

    private static List<Integer> makeAnIntegerArrayFromString(String stringLine) {
        Scanner stringValuesScanner = new Scanner(stringLine);
        List<Integer> integerArray = new ArrayList<>();

        while (stringValuesScanner.hasNext()) {
            integerArray.add(Integer.parseInt(stringValuesScanner.next()));
        }
        return integerArray;
    }
}