package com.kushwahatechnologies.challenges.weeklyrandom;

import java.util.Scanner;

/**
 *  WEEKLY JAVA CODE CHALLENGE #3:
 *
 *  Find out the Logical Error in the following Question and there's solution
 *
 *  Question:
 *
 *  Write a program which takes input as string and check it is palindrome or not.
 *  If the string and the reverse of string are same then we say string is palindrome.
 *
 *  Example :
 *      1.If string is "level" then the output should be: palindrome
 *      2.If string is "helloWorld" then the output should be: not a palindrome
 *
 *  Comment your response
 *
 *  https://www.facebook.com/Sandeepkush327/posts/1213431728861831
 *
 * */

public class StringPalindrome {

    private static Scanner scanner = new Scanner(System.in);
    private static String original;
    private static String reverse;

    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        original = scanner.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
