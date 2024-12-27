package hadi;

import java.util.Arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZerosWithTwoPointer(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));
        System.out.println(Arrays.toString(moveZerosToEnd(new int[]{1, 0, 2, 0, 3, 0, 4, 0})));

    }


    static int[] moveZerosWithTwoPointer(int[] array) {

        int leftPointer = 0;
        int rightPointer = 0;

        while (rightPointer < array.length) {
            if (array[rightPointer] != 0) {
                // Swap elements
                int temp = array[leftPointer];
                array[leftPointer] = array[rightPointer];
                array[rightPointer] = temp;
                leftPointer++;
            }
            rightPointer++;
        }
        return array;
    }

    static int[] moveZerosToEnd(int[] array) {

        int[] result = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[index++] = array[i];
            }
        }
        return result;
    }
}
