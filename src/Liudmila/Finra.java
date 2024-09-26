package Liudmila;

public class Finra {
    public static void main(String[] args) {
        try{
            printFinra(0, -8);
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("============================");
        try{
            printFinra(3, 1);
        }catch(RuntimeException e){
            e.printStackTrace();
        }
    }

    public static void printFinra(int start, int end) {

        if (end <= start) {
            throw new IllegalArgumentException("Start must be less than end");

        }
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA");
            } else if (i % 3 == 0) {
                System.out.print("FIN" + " ");
            } else if (i % 5 == 0) {
            } else {
            }
        }
        System.out.println();
    }
}
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
//print "FIN" instead of the number and
//for numbers which are a multiple of 5, print "RA" instead of the number.
//for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

