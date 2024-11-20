package hadi;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("AAABBBCCC"));

    }


    static String removeDup(String str) {

        if (str.isEmpty()) {
            throw new IllegalArgumentException("You need to write at least 1 character!");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!result.toString().contains(str.charAt(i) + "")) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
