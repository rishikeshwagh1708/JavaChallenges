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

        int[] calc = findBoundaryAddition(list, 31);
        System.out.println("first:- index=" + calc[0] + "=>value=" + list[calc[0]] + ", index=" + calc[1] + "=>value" + list[calc[1]]);

        int[] calc1 = boundaryAddition(list, 31);
        System.out.println("second:- index=" + calc1[0] + "=>value=" + list[calc1[0]] + ", index=" + calc1[1] + "=>value" + list[calc1[1]]);
    }

    private static int[] findBoundaryAddition(int[] numbers, int targetPoint) {
        int[] original = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (targetPoint == numbers[i] + numbers[j]) {
                    original[0] = i;
                    original[1] = j;
                    break;
                }
            }
        }
        return original;
    }

    private static int[] boundaryAddition(int[] numbers, Integer targetPoint) {
        Map<Integer, Integer> visits = new HashMap<>();
        for (int item = 0; item < numbers.length; item++) {
            int current = targetPoint - numbers[item];
            if (visits.containsKey(current)) { return new int[] {item, visits.get(current)}; }
            visits.put(numbers[item], item);
        }
        return new int[] {-1, -1};
    }
}
