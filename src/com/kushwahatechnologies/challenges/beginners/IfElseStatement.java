package com.kushwahatechnologies.challenges.beginners;

/**
 *  BEGINNERS JAVA CHALLENGE #004
 *
 *      Read the program and Guess the output.
 *      Write your output in the multiline comment section.
 *
 * */

public class IfElseStatement {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 11;

        if (!(x>y) && !(y<x) ) {
            --y;
            if (!(x==y)) {
                x *= y;
            }
        }

        if (!(z>x)) {
            z++;
            if (!(x>y)) {
                y++;
            } else {
                --z;
            }
        } else {
            z++;
            --x;
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    /**
     * Write your output here...
     *
     * */
}
