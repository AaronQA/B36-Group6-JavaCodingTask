package hadi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(solution2("AAABBCDD"));

        System.out.println(frequencyOfChars("Java is fun."));
        System.out.println(solution2("Java is fun."));

        try {
            System.out.println(frequencyOfChars(""));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    static String frequencyOfChars(String str) {

        if (str.isEmpty()) {
            throw new RuntimeException("You must provide at least 1 character!");
        }

        StringBuilder result = new StringBuilder();

        for (int j = 0; j < str.length(); j++) {

            char each = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == each) {
                    frequency++;
                }
            }

            if (!(result.toString().contains(each + ""))) {
                result.append(each).append(frequency);
            }
        }
        return result.toString();
    }


    static String solution2(String str) {

        if (str.isEmpty()) {
            throw new RuntimeException("You must provide at least 1 character!");
        }

        StringBuilder result = new StringBuilder();

        List<Character> characters = new ArrayList<>();

        for (char each : str.toCharArray()) {
            characters.add(each);
        }

        for (int i = 0; i < str.length(); i++) {
            if (!(result.toString().contains(str.charAt(i) + ""))) {
                result.append(str.charAt(i))
                        .append(Collections.frequency(characters, str.charAt(i)));
            }
        }
        return result.toString();
    }

}
