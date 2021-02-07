/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * <p>
 * That is, 3 + 7 + 4 + 9 = 23.
 * <p>
 * Find the maximum total from top to bottom of the triangle below:
 * <p>
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
 * <p>
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)
 */


package net.projecteuler.Task_18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumPathSumI {

    public static void main(String[] args) {

        String declaredTraignle = "        75\n" +
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

        List<List<String>> declaredTriangleAsList = new ArrayList<>();
        List<List<Integer>> declaredTriangleAsListInteger = new ArrayList<>();
        Scanner sc = new Scanner(declaredTraignle);
//        System.out.println(declaredTraignle.lines());

        int maxScanList = 0;

        while (sc.hasNextLine()) {
            declaredTriangleAsListInteger.add(addArray(sc.nextLine()));
            maxScanList++;
        }
        System.out.println(declaredTriangleAsListInteger);

        List<Integer> nowaMatryca = new ArrayList<>();
        int temporaryNewValue = 0;
        System.out.println("Max scan:" + maxScanList);

        for (int i = maxScanList-1; i > 0; i--) {
            System.out.println("---");
            for (int j = 0; j < declaredTriangleAsListInteger.get(i - 1).size(); j++) {
                System.out.println("1) Rzad: " + (i - 1) + " kolumna: " + j);
                System.out.println("2) Rzad: " + i + " Kolumna: " + j + " and " + (j + 1));
                System.out.println(declaredTriangleAsListInteger.get(i).get(j));
                System.out.println(declaredTriangleAsListInteger.get(i).get(j+1));

                if (declaredTriangleAsListInteger.get(i).get(j) > declaredTriangleAsListInteger.get(i).get(j + 1)) {
                    temporaryNewValue = declaredTriangleAsListInteger.get(i-1).get(j) + declaredTriangleAsListInteger.get(i).get(j);
                    System.out.println("1");
                } else {
                    temporaryNewValue = declaredTriangleAsListInteger.get(i-1).get(j) + declaredTriangleAsListInteger.get(i).get(j+1);
                    System.out.println("2");
                }
                nowaMatryca.add(temporaryNewValue);
            }
//            System.out.println("Stara: " + declaredTriangleAsListInteger.get(i));
//            System.out.println("Nowa: " + nowaMatryca);
//            declaredTriangleAsListInteger.remove(i);
//            declaredTriangleAsListInteger.remove(i-1);
            System.out.println(nowaMatryca);
            List<Integer> a= new ArrayList<>();
            System.out.println(temporaryNewValue);
            declaredTriangleAsListInteger.set(i-1, a);
            nowaMatryca.clear();
            System.out.println(declaredTriangleAsListInteger);
//            System.out.println(declaredTriangleAsListInteger.get(0).get(0));

        }
    }

    private static List<Integer> addArray(String x) {
        Scanner sc1 = new Scanner(x);
        List<Integer> intLine = new ArrayList<>();

        while (sc1.hasNext()) {
            intLine.add(Integer.parseInt(sc1.next()));
        }
        return intLine;
    }
}
