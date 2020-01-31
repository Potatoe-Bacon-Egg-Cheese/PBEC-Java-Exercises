public class Problems {


    //        https://edabit.com/challenge/SSiwbDE337QvJ9FCZ
    //        1.Create a function which returns the word in the string, but with all the fog letters removed. However, if the string is clear from fog, return "It's a clear day!".

    //        https://edabit.com/challenge/nfc7H9CQFqJp54uEh
    //        2.Create a function that takes three integer arguments (a, b, c) and returns the number of equal values.

    //        https://edabit.com/challenge/RSbXRKoom6ED9Xe9i
//            3.A pair of strings form a strange pair if both of the following are true:
//              .The 1st string's first letter = 2nd string's last letter.
//              .The 1st string's last letter = 2nd string's first letter.
//            Create a function that returns true if a pair of strings constitutes a strange pair, and false otherwise.

    public static class Challenge {
        public static String clearFog(String str) {
            String noFog = str.replaceAll("[fog]", "");
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'f') {
                    return noFog;
                }
            }
            return "It's a clear day!";
        }

        public static int equal(int a, int b, int c) {

            if (a == b && b == c) {
                return 3;
            }
            if (a ==b || a == c || b == c){
                return 2;
            }
            return 0;
        }


        public static boolean isStrangePair(String s1, String s2) {
            if(s1.length() == 0 || s2.length() == 0) return s1.length() == 0 && s2.length() == 0;
            return s1.charAt(0) == s2.charAt(s2.length()-1) && s2.charAt(0) == s1.charAt(s1.length()-1);
        }


    }


    public static void main(String[] args){
    }
}
