package Liudmila;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int

    //input: -35  output: -53

    public static void main(String[] args) {
        try {
            System.out.println(reverseNegativeIntNumber(256));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(reverseNegativeIntNumber(0));
        } catch (IllegalArgumentException e) {
           e.printStackTrace();
        }

        System.out.println(reverseNegativeIntNumber(-256));
        System.out.println(reverseNegativeIntNumber(-1256));
        System.out.println(reverseNegativeIntNumber(-56));
        System.out.println(reverseNegativeIntNumber(-2));
    }

    public static int reverseNegativeIntNumber(int number) {
        if (number >= 0) {
            throw new IllegalArgumentException("The number must be negative or must not be zero");
        }

        number = Math.abs(number);

        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

            number /= 10;
        }
        return Math.negateExact(reversedNumber);
    }
}

