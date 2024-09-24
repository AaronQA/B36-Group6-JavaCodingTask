package Jamal;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(identify(5));
        System.out.println(identify(6));
        System.out.println(identify(0));
        System.out.println(identify(-46));
        System.out.println(identify(-53));


    }

    public static String identify(int number){

        if(number % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }


}
