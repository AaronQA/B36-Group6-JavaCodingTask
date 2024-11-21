package Medeni;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // Output: A3B2C1D2
//        System.out.println(frequencyOfChars("Hello World")); // Output: H1e1l2o1W1r1d1
//        System.out.println(frequencyOfChars("")); // Output: ""
//        System.out.println(frequencyOfChars("a")); // Output: a1
//        System.out.println(frequencyOfChars("aa")); // Output: a2
//        System.out.println(frequencyOfChars("aabbcc")); // Output: a2b2c2
    }


    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static String frequencyOfChars(String str) {
        StringBuilder result = new StringBuilder();
        int count;

        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while ((i + 1) < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(str.charAt(i));
            result.append(count);
        }
        return result.toString();

    }

}


