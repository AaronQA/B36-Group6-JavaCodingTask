package hadi;

public class PasswordValidation {

    public static void main(String[] args) {

        System.out.println(validate("A Bcc!2"));
        System.out.println(validate("XyZ1@"));
        System.out.println(validate("AbC1A@x"));
        System.out.println(validate("x!1Gt4afR"));

        try {
            System.out.println(validate(""));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(validate(null));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        System.out.println("validate(\"Password\") = " + validate("Password"));


    }


    static boolean validate(String password) {

        if (password.isBlank() || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty or blank!");
        }

        if (password == null) {
            throw new NullPointerException("Password cannot be null!");
        }

        if (!password.contains(" ") && password.length() > 5) {

            char[] characters = password.toCharArray();

            boolean isUpperCase = false;
            boolean isLowerCase = false;
            boolean isSpecialCharacter = false;
            boolean isDigit = false;

            for (char eachCharacter : characters) {
                if (Character.isUpperCase(eachCharacter)) {
                    isUpperCase = true;
                } else if (Character.isLowerCase(eachCharacter)) {
                    isLowerCase = true;
                } else if (Character.isDigit(eachCharacter)) {
                    isDigit = true;
                } else {
                    boolean conditionToSpecialChar = !Character.isLetter(eachCharacter) && !Character.isDigit(eachCharacter);
                    if (conditionToSpecialChar) {
                        isSpecialCharacter = true;
                    }
                }
            }
            if (isDigit && isUpperCase && isLowerCase && isSpecialCharacter) {
                return true;
            }
        }

        return false;
    }
}
