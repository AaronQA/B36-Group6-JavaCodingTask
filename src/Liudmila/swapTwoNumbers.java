package Liudmila;
public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable

    public static void main(String[] args) {

        swapTwoIntNumbers(1, 2);
        swapTwoIntNumbers(-5, 2);
        swapTwoIntNumbers(-5, -2);
        swapTwoIntNumbers(5, -2);
        swapTwoIntNumbers(0, -2);
        swapTwoIntNumbers(-5, 0);
        swapTwoIntNumbers(5, 0);

    }

    public static void swapTwoIntNumbers(int firstNumber, int secondNumber){
        firstNumber = firstNumber + secondNumber;

        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;

        System.out.println("Swapped numbers: " + "\t" +  firstNumber + "\t" + secondNumber);
    }
}



