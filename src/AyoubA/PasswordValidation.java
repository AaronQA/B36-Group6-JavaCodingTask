package AyoubA;

public class PasswordValidation {


     /*String -- Password Validation Task
    Write a return method that can verify if a password is valid or not.
    Requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false*/

    public static boolean isValidPassword (String password) {
        // Check if the password length is at least 6 and does not contain spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false; // Invalid password
        }

        // Initialize flags for required criteria
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Loop through each character in the password
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i); // Get the character at position i

            // Check for uppercase letters
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            // Check for lowercase letters
            else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }
            // Check for digits
            else if (Character.isDigit(c)) {
                hasDigit = true;
            }
            // Check for special characters
            else {
                hasSpecialChar = true; // Anything that is not a letter or digit is considered a special character
            }
        }

        // Return true if all conditions have been met
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    public static void main (String[] args) {
        // Test passwords
        String[] passwords = {
                "Short" ,          // false - too short
                "Password123!" ,   // true
                "Password123" ,    // false - missing special character
                "password123!" ,    // false - missing uppercase
                "PassWord123" ,    // false - missing special character
                "Password 123!"   // false - contains space
        };

        // Check each password and print results
        for (String password : passwords) {
            System.out.println(password + ": " + isValidPassword(password));
        }
    }
}






