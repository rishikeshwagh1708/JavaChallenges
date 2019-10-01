package com.kushwahatechnologies.challenges.beginners;

/**
 *  BEGINNERS JAVA CHALLENGE #005
 *
 *      Read the program care fully and write the code for Task 1 and 2:
 *
 *      Task 1: check the day string and return the weekDay
 *              where Sunday = 1, Monday = 2, Tuesday = 3, Wednesday = 4
 *                    Thursday = 5, Friday = 6, Saturday = 7 and for other string = -1
 *
 *      Task 2: calculate the result based on operands and Operators.
 *              If there in not defined operator then return the Minimum Integer value.
 *
 *      NOTE: Use switch-case statement.
 *            Syntax:
 *              switch(testCase) {
 *                  case test1:
 *                        // code here...
 *                  case test2:
 *                        // code here...
 *                  default:
 *                        // code here...
 *              }
 *
 *
 * */

public class SwitchStatement {

    private static final String MINUS = "-";
    private static final String PLUS = "+";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";
    private static final String MODULUS = "%";

    /**
     * Main method of the class which invoked automatically by the JVM.
     *
     */
    public static void main(String[] args) {
        // Task 1:
        System.out.println(getWeekDay("Monday"));
        System.out.println(getWeekDay("Friday"));
        System.out.println(getWeekDay("October"));

        // Task 2:
        System.out.println(calculateInt(2564, 60934, PLUS));
        System.out.println(calculateInt(27564, 6934, MINUS));
        System.out.println(calculateInt(164, 34, MULTIPLY));
        System.out.println(calculateInt(2564, 23, DIVIDE));
        System.out.println(calculateInt(2564, 26, MODULUS));
    }

    /**
     *  Method getWeekDay takes name of the Day of the Week,
     *  and returns the dedicated number for the day.
     *  If the given name is not the days of week then returns -1.
     *
     *  where
     *  @param day indicates name of the Day of the Week.
     *
     */
    private static int getWeekDay(String day) {
        if (day == null || day.isEmpty()) {
            return -1;
        } else {
            int weekDay = -1;

            // Task 1, code here...

            return weekDay;
        }
    }

    /**
     *  Method calculateInt takes three param and returns the calculation
     *  based on the operator.
     *  Tf there is not valid operator then it return Minimum Integer Value.
     *
     *  where
     *  @param x is the first number
     *  @param y is the second number
     *  @param operator is the operator which provides the result.
     *
     */
    private static int calculateInt(int x, int y, String operator) {
        if (operator == null || operator.isEmpty()) {
            return -1;
        } else {
            int result = Integer.MIN_VALUE;

            // Task 2, code here...

            return result;
        }
    }
}
