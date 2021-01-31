/**
 * The following iterative sequence is defined for the set of positive integers:
 * <p>
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * <p>
 * Using the rule above and starting with 13, we generate the following sequence:
 * <p>
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * <p>
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */


package net.projecteuler;

import java.util.HashMap;

public class LongestCollatzSequence {

    public static void main(String[] args) {

        int sequenceNumber = 0;
        int actualSequenceAmount = 0;
        int biggestSequence = 0;
        int longestChainNumber = 0;

        HashMap<Integer, Integer> rememberedSequenceAmount = new HashMap<>();

        for (int i=1; i<1000000; i++) {
            sequenceNumber = i;
            actualSequenceAmount = 1;

            while (sequenceNumber != 1) {

                if (rememberedSequenceAmount.containsKey(sequenceNumber)) {
                    actualSequenceAmount += rememberedSequenceAmount.get(sequenceNumber);
                    sequenceNumber=1;
                }
                else if (sequenceNumber % 2 == 0) {
                    sequenceNumber /= 2;
                }
                else if (sequenceNumber % 2 == 1) {
                    sequenceNumber = 3 * sequenceNumber + 1;
                }
                actualSequenceAmount++;
            }

            if (actualSequenceAmount > biggestSequence) {
                biggestSequence = actualSequenceAmount;
                longestChainNumber = i;
            }


            if (!rememberedSequenceAmount.containsKey(i)) {
                rememberedSequenceAmount.put(i, actualSequenceAmount);
            }

        }

        System.out.println("Najdłuższa sekwencja dla numeru początkowego: " + longestChainNumber + ", a jego długość to: " + biggestSequence);
    }
}
