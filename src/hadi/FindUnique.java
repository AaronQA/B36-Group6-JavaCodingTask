package hadi;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {

    public static void main(String[] args) {

        System.out.println(findUnique("AAABBBCCCDEF"));
        System.out.println(findUnique(" AAAasadddffg"));
        System.out.println(solution2("AAABBBCCCDEF"));

    }

    static String findUnique(String str) {

        if (str.isEmpty()) {
            throw new IllegalArgumentException("You must provide at least 1 character.");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    static String solution2(String str) {

        if (str.isEmpty() || str.isBlank() || str == null) {
            throw new IllegalArgumentException("Parameter cannot be empty, blank or null.");
        }

        Map<Character, Integer> frequencies = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!(frequencies.containsKey(str.charAt(i)))) {
                frequencies.put(str.charAt(i), 1);
            } else {
                frequencies.put(str.charAt(i), frequencies.get(str.charAt(i)) + 1);
            }
        }

        for (Character each : frequencies.keySet()) {
            if (frequencies.get(each) == 1) {
                result.append(each);
            }
        }
        return result.toString();
    }
}
