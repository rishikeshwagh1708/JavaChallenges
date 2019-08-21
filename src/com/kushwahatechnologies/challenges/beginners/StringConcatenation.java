package com.kushwahatechnologies.challenges.beginners;

/**
 * BEGINNERS JAVA CHALLENGE #002
 *
 * Read the program and Guess the output.
 * Write your output in the multiline comment section.
 *
 */

public class StringConcatenation {
    public static void main(String[] args) {
        String title = "Java is awesome.", text = "", n = null;
        String stringConcat1 = title.concat(text);

        if (title == stringConcat1) {
            System.out.println("Both var is same.");
        } else {
            System.out.println("vars are not same");
        }

        String stringConcat2 = title + text;
        if (title == stringConcat2) {
            System.out.println("Both var is same.");
        } else {
            System.out.println("vars are not same");
        }

        System.out.println(title + n);
        System.out.println(title.concat(n));
    }

    /*
    * OUTPUT Console:
    *
    *   write your output here...
    *
    *
    * */
}
