package Asma;

public class reverseString {

    public static void main(String[] args) {


        System.out.println(reverse("Testing is fun"));

    }

    public static String reverse(String word){

        String result ="";
        if(word.isEmpty()||word.isBlank()){
            throw new IllegalArgumentException("Input cannot be empty or blank");


        }for(int i =word.length()-1; i>=0;i--){
            result+=word.charAt(i);
        }
        return result;
    }


}
