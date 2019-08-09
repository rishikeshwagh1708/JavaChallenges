package com.kushwahatechnologies.challenges.weeklyrandom;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Weekly Java Code Challenge #2:
 *
 * List of Integers
 * [-21, 1, 2, -4, -34, 3, 4, 10, 8, 5, 7, 9, 6, 23, 12, 42, 53, -53, -41, -8]
 *
 * - Create this List of integers
 * - Print the total size of the List
 * - Make two new Arraylist of positive and negative numbers from the given list
 * - Print both lists in the ascending order.
 *
 * Comment your response on
 *  https://www.facebook.com/Sandeepkush327/posts/1203594796512191
 *
 * */

public class ListItemExplore {


    private static Boolean isPositiveInteger(Integer value) {
        return value > 0;
    }

    private static Boolean isNegitiveInteger(Integer value) {
        return value < 0;
    }

    public static void main(String... args) {

        List<Integer> list = List.of(-21, 1, 2, -4, -34, 3, 4, 10, 8, 5, 7, 9, 6, 23, 12, 42, 53, -53, -41, -8);

        ArrayList<Integer> positiveList = (ArrayList<Integer>) list.stream().filter(e -> isPositiveInteger(e)).sorted().collect(Collectors.toList());
        ArrayList<Integer> negativeList = (ArrayList<Integer>) list.stream().filter(ListItemExplore::isNegitiveInteger).sorted().collect(Collectors.toList());

        System.out.println("List count is: " + (long) list.size());

        System.out.print("Sorted Positive Items of the List are: ");
        for (Integer item : positiveList) {
            System.out.print(" " + item);
        }

        System.out.print("\nSorted Negative Items of the List are: ");
        for (Integer item : negativeList) {
            System.out.print(" " + item);
        }
    }
}
