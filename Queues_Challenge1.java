package com.company;

import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }
// MY SOLUTION **************************************************
    public static boolean checkForPalindrome(String string) {
        String input = string.toLowerCase().trim();
        input = input.replaceAll("[^a-z]","");

        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();

        for (int i = 0; i <input.length(); i++ ) {
            stack.push(input.charAt(i));
            queue.add(input.charAt(i));

        }
        if (stack.toString().equals(queue.toString())) {
            System.out.println(stack.toString()+" VS "+ queue.toString());
            return true;
        }
        System.out.println(stack.toString()+" VS "+ queue.toString());

        return false;
    }

    // ************************************************************
}
