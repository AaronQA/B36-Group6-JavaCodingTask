package Medeni;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(isOddEven(-5));
        System.out.println(isOddEven(3));
        System.out.println(isOddEven(5));
    }

     public static  String isOddEven(int num) {
         if (num % 2 == 0) {
             return "even";
         }else {
             return "odd";
     }


    }
}