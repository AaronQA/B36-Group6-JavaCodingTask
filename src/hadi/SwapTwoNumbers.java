package hadi;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int x = 15;
        int y = 10;

        System.out.println("Before swap; x: " + x + " y: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap; x: " + x + " y: " + y);

        swapNumbers(10, 15);
    }

    static void swapNumbers(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("num1: " + num1 + " num2: " + num2);
    }
}
