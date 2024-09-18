package Medeni;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(isOddEven(6));
    }

     public static  String isOddEven(int num) {
         if (num % 2 == 0) {
             return "even";
         }else {
             return "odd";
     }

//            int n=5;
//        //for (int n = 1; n <= 1; n++) {
//            if (n % 2 == 0) {
//                System.out.println("Even number");
//            } else {
//                System.out.println("Odd number");
//            }

    }
}