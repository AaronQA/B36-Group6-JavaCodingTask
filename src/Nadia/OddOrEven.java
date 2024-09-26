package Nadia;

public class OddOrEven {

  /*Write a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void main(String[] args) {
        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println(identify(0));
        System.out.println(identify(-5));
        System.out.println(identify(-6));

    }

    public static String identify (int number){
        if (number % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

}
