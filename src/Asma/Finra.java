package Asma;

public class Finra {
    public static void main(String[] args) {

                    Finra(500,60);
    }
    //Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
    //print "FIN" instead of the number and
    //for numbers which are a multiple of 5, print "RA" instead of the number.
    //for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
    public static void Finra(int startingNum, int endingNum){


        // we use for loop to iterate from 1 to 30 i represent each value in each iteration
        for(int i = startingNum; i<=endingNum; i++){

            if(i % 3== 0 &&i % 5 == 0){
                System.out.println("FINRA");
            }else if(i % 3 == 0){
                System.out.println("FIN");
            } else if(i %5== 0){
                System.out.println("RA");

            }else{
                System.out.println(i);
            }
        }
    }
}
