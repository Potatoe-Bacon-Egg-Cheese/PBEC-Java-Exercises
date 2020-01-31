//Sources
//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java
//https://www.codewars.com/kata/546e2562b03326a88e000020/train/java
//

public class MiguelPodThree {
    public static void main(String [] args){

//      First exercise
        System.out.println(persistence(39)); //Expected Output 3
        System.out.println(persistence(4)); //Already single digit expected output 0
        System.out.println(persistence(999));//Expected Output 4

//      Second Exercise
        System.out.println(squareDigits(9119));//Expected Output 811181
    }

//1.    Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
//    which is the number of times you must multiply the digits in num until you reach a single digit.

    public static int persistence(long n) {
        int result = 0;
        while (n > 9) {
            long multiply = 1;
            for (char t : String.valueOf(n).toCharArray()) {
                multiply *= Long.parseLong(String.valueOf(t));
            }
            n = multiply;
            result++;
        }
        return result;
    }

//2.  Welcome. In this kata, you are asked to square every digit of a number.
//
//    For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
//
//    Note: The function accepts an integer and returns an integer

    public static int squareDigits(int n) {

        String result = "";

        while (n != 0) {
            int digit = n % 10 ;
            result = digit*digit + result ;
            n /= 10 ;
        }

        return Integer.parseInt(result) ;
    }

//3.  Return the number (count) of vowels in the given string.
//
//    We will consider a, e, i, o, and u as vowels for this Kata.
//
//    The input string will only consist of lower case letters and/or spaces.

}
