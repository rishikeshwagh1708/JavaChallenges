package com.kushwahatechnologies.challenges.weeklyrandom;

import java.util.Arrays;
import java.util.List;

/**
 * Weekly Java Code Challenge #1:
 * <p>
 * List of Integers
 * [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20]
 * <p>
 * - Create this list of integers
 * - and get total of the double of even numbers.
 * <p>
 * Comment your response
 * The result will be shown on Sunday.
 */
public class EvenSum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        int evenSum = 0;

        for (int i : numbers) {
            if (i%2==0) {
                evenSum += i * 2;
            }
        }
        System.out.println(evenSum);

        // OR
        // with stream api
        System.out.println(numbers.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * 2).sum());
    }
}
