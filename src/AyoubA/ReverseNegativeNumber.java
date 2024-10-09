package AyoubA;

public class ReverseNegativeNumber {

    public static void main (String[] args) {


        System.out.println(reverseNumber(-12345));
        System.out.println(reverseNumber(-170));
        System.out.println(reverseNumber(12345));
        System.out.println(reverseNumber(-234));


    }


        public static int reverseNumber(int num) {
            // Check if number is negative
            boolean isNegative = num < 0;

            // Convert to positive if negative
            if (isNegative) {
                num = -num;
            }

            int reversed = 0;
            while (num > 0) {
                // Check for potential overflow
                if (reversed > (Integer.MAX_VALUE - num % 10) / 10) {
                    return 0;
                }

                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num = num / 10;
            }

            // Restore negative sign if original was negative
            return isNegative ? -reversed : reversed;
        }

    }

