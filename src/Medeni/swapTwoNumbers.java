package Medeni;

public class swapTwoNumbers {
    public static void main(String[] args) {

        //Swap two int variables' values without using a third variable


        int a = 1;
        int b = 2;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;  //1+2=3
        b = a - b;  //3-2=1
        a = a - b;  //3-1=2

        System.out.println("After swapping: a = " + a + ", b = " + b);




    }
}
