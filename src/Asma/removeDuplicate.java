package Asma;

public class removeDuplicate {

    public static void main(String[] args) {
/*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

        System.out.println(removeDuplicates("AAABBBCCC"));
    }

    public static String removeDuplicates(String input) {
        String result = ""; //to hold the final result

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the current character is already in the result string
            if (result.indexOf(currentChar) == -1) {  // -1 means it's not found
                result += currentChar;  // Add it to the result
            }

        }
        return result;
    }
}

