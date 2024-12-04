package Asma;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        System.out.println(oddOrEven(3));
        System.out.println(oddOrEven(3));
        System.out.println(oddOrEven(3));

    }


    static String oddOrEven ( int num){
            if (num % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }

        }

    }
