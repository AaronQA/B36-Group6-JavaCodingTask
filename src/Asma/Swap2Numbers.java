package Asma;

public class Swap2Numbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a is = " + a + ", b is = " + b);

        // Swap using a temporary variable
        int temp = a; // we are assigning 5 to temp
        a = b; // now a is 10
        b = temp; // now b is 5

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
