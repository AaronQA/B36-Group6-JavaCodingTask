package hadi;

import java.util.Stack;

public class Reverse {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

        try {
            System.out.println(reverse(""));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println(stackSolution("ABCD"));

        try {
            System.out.println(stackSolution(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println(stackSolution("Java is fun."));

    }

    static String reverse(String str) {

        if (str.isEmpty() || str.isBlank()) {
            throw new IllegalArgumentException("Parameter cannot be empty or blank!");
        }

        if (str == null) {
            throw new NullPointerException("Parameter cannot be null!");
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }



    static String stackSolution(String str) {

        if (str.isEmpty() || str.isBlank()) {
            throw new IllegalArgumentException("Parameter cannot be empty or blank!");
        }

        if (str == null) {
            throw new NullPointerException("Parameter cannot be null!");
        }

        Stack<Character> characters = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length() ; i++) {
            characters.push(str.charAt(i));
        }

        while (!(characters.isEmpty())) {
            result.append(characters.pop());
        }
        return result.toString();
    }
}
