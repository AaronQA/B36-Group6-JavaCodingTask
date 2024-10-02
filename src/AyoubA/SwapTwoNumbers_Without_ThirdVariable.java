package AyoubA;

public class SwapTwoNumbers_Without_ThirdVariable {

    public static void main (String[] args) {
        int num1= 10;
        int num2 = 20;
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        System.out.print("After swapping:");
        swap2numbersWithoutThird(10,20);

    //    System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);



    }

    public static void swap2numbersWithoutThird(int num1, int num2){
        // Logic for swapping two numbers:
        num1 = num1 + num2;  // 10 + 20 = 30
        num2 = num1 - num2; //30 - 20 = 10
        num1= num1 - num2; //30-10 =20


        System.out.println("num1 = " + num1);
        System.out.println("num2 =" + num2 );

    }

}
