package com.kushwahatechnologies.challenges.intermediate;

import java.util.Scanner;

/**
 * Intermediate Java Challenge #001
 *
 * 1. Very first take input for Number of Operation O. where 1 <= O <= 10
 * 2. In Every Operation take two input N, M and check N!=M or N==M
 *      according to operation print equals, lesser or greater
 *      where -1000 <= N <= 1000 and -1000 <= M <= 1000
 * Example:
 *  Input:
 *      2
 *      7 9
 *      2 2
 *  Output:
 *      lesser
 *      equal
 *
 *
 * */

public class IfElse_DecisionMaking1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operationsCount = scanner.nextInt();

        if (operationsCount>0 && operationsCount<11) {

            String[] values = new String[operationsCount];
            scanner.nextLine();     // for the clear the buffer
            for (int i = 0; i < values.length; i++) {
                values[i] =  scanner.nextLine();
            }

            for (String value : values) {
                String[] numbers = value.split(" ");
                int first = Integer.parseInt(numbers[0]);
                int second = Integer.parseInt(numbers[1]);
                if (first < second) {
                    System.out.println("lesser");
                } else if (first > second) {
                    System.out.println("greater");
                } else {
                    System.out.println("equal");
                }
            }
        }
    }
}
