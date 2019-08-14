package com.kushwahatechnologies.challenges.weeklyrandom;

import java.util.HashMap;
import java.util.Map;

/**
 * Weekly Java Code Challenge #4:
 *
 * Given an array of integers, return indices of the two numbers such that they add up to specific target.
 * You may assume that would have exactly one solution, and you may not use the same element twice.
 * Example:
 *      Given numbers = [4, 5, 7, 6, 10, 24, 35]
 *      Because numbers[0] + numbers[1] = 4 + 5 = 9
 *      return [0, 1]
 *
 * */

public class BoundaryAddition {
    public static void main(String[] args) {
        int[] list = {4, 5, 7, 6, 10, 24, 35};

        int[] calc1 = boundaryAddition(list, 31);
    }

    private static int[] boundaryAddition(int[] numbers, Integer targetPoint) {
        // implement your logic here...
        return new int[] { 0, 0};
    }
}
