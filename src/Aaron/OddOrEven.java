package Aaron;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(oddOrEven(5));

    }

    static String oddOrEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
