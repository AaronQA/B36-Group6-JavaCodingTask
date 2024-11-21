package Medeni;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC")); // Output: ABC
        System.out.println(removeDup("kkkllmmnnnnn")); // Output: klmn
        System.out.println(removeDup("")); // Output: klmn
        System.out.println(removeDup("    ")); // Output: klmn
        System.out.println(removeDup(null)); // Output: klmn
    }
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static String removeDup(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (sb.toString().indexOf(str.charAt(i)) == -1) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();  // Output: ABC
    }



    }
