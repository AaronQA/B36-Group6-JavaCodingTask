package Asma;

public class Swap2Numbers {
    public static void main(String[] args) {


        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a is = " + a + ", b is = " + b);

        // Swap without using a temporary variable
        a = a+b; // a+b= 15
        b = a-b; // a-b= 5
        a = a-b; // a-b= 10

        System.out.println("After swapping: a is = " + a + ", b is = " + b);
    }

    }




