package Asma;

public class passwordValidation {


        public static void main(String[] args) {

            System.out.println(isValidPassword("Benghazi@19"));
            System.out.println(isValidPassword("Benghazi@")); // No digit
            System.out.println(isValidPassword("benghazi1"));// No special characters
            System.out.println(isValidPassword("Benghazi@1 ")); // contains space
            System.out.println(isValidPassword("benghazi123!")); // No uppercase

        }
        public static boolean isValidPassword(String password) {
            // Check if password is at least 6 characters and doesn't contain spaces
            if (password.length() < 6 || password.contains(" ")){
                return false;
            }
            //check different conditions
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialChar = false;
            boolean hasDigit = false;
            // Loop through each character of the password to check the conditions
            for (int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);

                //The Character class provides utility methods that help to determine the type of character.
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }
            // Return true if all conditions are met
            return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
        }



    }

