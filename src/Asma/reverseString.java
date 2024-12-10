package Asma;

public class reverseString {

    public static void main(String[] args) {


        System.out.println(reverse1("Testing is fun"));
        System.out.println(reverse2("Testing is fun"));


    }

    public static String reverse1(String word) {

        String result = "";
        if (word.isEmpty() || word.isBlank()) {
            throw new IllegalArgumentException("Input cannot be empty or blank");
        }
        for (int i = word.length() - 1; i >= 0; i--) { // gets the index of the last character
            result += word.charAt(i); // retrieves the character at index i and added to result to build the result
        }
        return result;
    }


    //Solution with StringBuilder for efficient string manipulation
    //In solution 1 concatenating strings in a loop using += is inefficient cuz creates a new string object each time
    public static String reverse2(String word) {
        if (word == null || word.isBlank()||word.isEmpty()){
            throw new IllegalArgumentException("Input cannot be null, empty, or blank");
        }
        // Use StringBuilder to reverse the word using method
        StringBuilder result = new StringBuilder(word);
        return result.reverse().toString(); //to explicitly convert the StringBuilder to a String.
        
    }
}




