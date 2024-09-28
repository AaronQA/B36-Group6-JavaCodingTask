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
    }
}
