package hadi;

public class ArrayFindMinimum {

    public static void main(String[] args) {

        System.out.println("minimumNumber(new int[]{99, 12, 23, 32, 44, 57, 6}) = " +
                minimumNumber(new int[]{99, 12, 23, 32, 44, -57, 6}));

    }

    static int minimumNumber(int[] array) {

        int minimum = array[0];
        for (int each : array) {
            if (each < minimum) {
                minimum = each;
            }
        }

        return minimum;
    }


}
