package hadi;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println("reverseNegativeNumber(-35) = " + reverseNegativeNumber(-35));
        System.out.println("reverseNegativeNumber(-123456) = " + reverseNegativeNumber(-123456));
        System.out.println("solution2(-35) = " + solution2(-35));
        System.out.println("solution2(-123456) = " + solution2(-123456));

        try {
            System.out.println(reverseNegativeNumber(35));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(reverseNegativeNumber(0));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("reverseNegativeNumber(-679893249) = " + reverseNegativeNumber(-679893249));
    }

    static int reverseNegativeNumber(int number) {

        if (number >= 0) {
            throw new IllegalArgumentException("Number must be less than zero. Number " + number);
        }

        String str = Integer.toString(number);
        StringBuilder reversed = new StringBuilder();
        reversed.append("-");

        for (int i = str.length() - 1; i >= 1; i--) {
            reversed.append(str.charAt(i));
        }
        return Integer.parseInt(reversed.toString());
    }

    static int solution2(int number) {

        if (number >= 0) {
            throw new IllegalArgumentException("Number must be less than zero. Number: " + number);
        }

        StringBuilder reversed = new StringBuilder();
        reversed.append("-");

        while (number != 0) {
            int remainder = number % 10;
            reversed.append(remainder * -1); // remainder is negative. so I multiplied remainder with (-1) to make it positive
            number = number / 10;
        }
        return Integer.parseInt(reversed.toString());
    }

}
