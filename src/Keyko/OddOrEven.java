package Keyko;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println(identify(0));
        System.out.println(identify(-3));
        System.out.println(identify(-10));

    }

    public static String identify(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }

    }
}
/*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/