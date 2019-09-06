package com.kushwahatechnologies.challenges.beginners;

/**
 *  BEGINNERS JAVA CHALLENGE #003
 *
 *      Read the program and Guess the output.
 *      Write your output in the multiline comment section.
 *
 * */

public class OperatorsInJava {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        boolean a = false;

        System.out.println(x + y * z - 2);
        System.out.println(x - y / z + 2 * 4 > x + y - Math.pow(2, 8));
        System.out.println(x + y * z - 2 <= 3 * x + 5 * y - z);
        System.out.println(2 * x + y * 6 * z - 2 >= 3 * z ? ++x : a);
        System.out.println(x + y * z - 2 % 2 != 2 * y % z ? "foo" : "boo");
        System.out.println(x++ - 2 % 2 != 2 * y % z ? "loo" : "zoo");
        System.out.println(x + y * z != 2 * y % z ? "foo" : "boo");
        System.out.println(x-- + y * z* 'a' - 2 % 2 == 2 * y % z ? "got" : "tod");
        System.out.println(x-- + y * z * 'a' == 2 * y % z ? "got" : "tod");
        System.out.println(x + y * 'z' - 2 % 2 >= 2 * y % z ? "fin" : "bin");
        System.out.println((x^y) < z ? "fine" : "ohh");

        System.out.println(((x > y) ? (x > z) ? a : z : (y > z) ? y : z));
    }

    /**
     * Write your output here...
     *
     * */
}
