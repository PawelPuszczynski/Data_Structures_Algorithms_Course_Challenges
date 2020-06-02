package com.company;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
// MY SOLUTION*********************************************
    public static boolean checkForPalindrome(String string) {
        String input = string.toLowerCase().trim();
        input = input.replaceAll("[^a-z]","");
        System.out.println(input);

        LinkedStack stack = new LinkedStack();
        for (int i =0; i < (input.length()%2 == 0 ? input.length()/2 : input.length()/2+1); i++) {
            stack.push(input.charAt(i));
        }
        System.out.println("First half ");
        stack.printStack();

        for (int i = input.length()/2; i<input.length(); i++) {
            if (stack.peek() != input.charAt(i)) {
                System.out.println(" No match at " + input.charAt(i));
                return false;
            } else {
                stack.pop();
            }
        }
     return true;
    }
    // **********************************************************
}
package com.company;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    //FIELDS
    private LinkedList<Character> stack;

    //CONSTRUCTOR
    public LinkedStack() {
        stack = new LinkedList<Character>();
    }

    public void push(Character employee) {
        stack.push(employee);
    }


    public Character pop() {
        return stack.pop();
    }

    public Character peek() {
        return stack.peek();
    }

    public boolean isEmpty () {
        return stack.isEmpty();
    }

    public void printStack () {
        ListIterator<Character> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
