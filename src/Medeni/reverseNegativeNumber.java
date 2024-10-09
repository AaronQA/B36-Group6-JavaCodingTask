package Medeni;

public class reverseNegativeNumber {
       //Write a return method that can reverse digits of a negative number and return it as int
       //input: -35  output: -53
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-35));
        System.out.println(reverseNegativeNumber(-123));

    }

    public static int reverseNegativeNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }
}
