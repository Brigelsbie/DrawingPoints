import java.util.Scanner;

/**
 * CS152 Lab 4 -- Welcome to Methods.
 *
 * Implement all the methods described below.
 *
 * Student name: Mason Briggs
 */

public class MethodPractice {


    /**
     * Returns middle value of its arguments.
     *
     * @param x First argument
     * @param y Second argument
     * @param z Third argument
     * @return Middle value of x, y and z
     */
    public static int middleOfThree(int x, int y, int z) {

        if ((x < y && y < z) || (z < y && y < x)) {//this checks y is middle
            System.out.println(y + " is the middle");
        }

        if ((y < x && x < z) || (z < x && x < y)) {// this checks if x is middle
            System.out.println(x + " is the middle");
        }

        else {
            System.out.println(z + " is the middle"); // z is the only option left
        }
        return x;
    }



    /**
     * Is the character given a vowel?
     * A vowel is one of a, e, i, o, or u (upper or lower case)
     * @param c Character to check
     * @return True if c is a vowel, false if not
     */
    public static boolean isVowel(char c) {

        // this Method I learned after hasVowel
        // I went back to try indexOf() instead of the ugly
        // hardcode and it compiled the same score
        // but I left the hardcode as history of first attempt

        String v = "aeiouAEIOU"; // string contains all vowels
        if (v.indexOf(c) != -1) { // if there are not none vowels

            return true;
        }
        return false;
    }
    // this is hardcode when index through list and checking that c is not vowel
    // Index through a list is a better solution. But it was fighting me.
    // I was thinking something like  charAt."AEIOUaeiou", but I struggled so I hardcoded
    // and it would be better to index then loop through probably?
    // for (charAt.index(i)){
    //  if... but boolean seemed simpler...but not always good.
    // I know there are built in Upper and Lower functions but don't know how
    // to use them


    //        if ((c != 'a' &&  c != 'e' && c != 'i' &&  c != 'o' && c != 'u'
//        && c != 'A' &&  c != 'E' && c != 'I' &&  c != 'O' && c != 'U')){
//            return false;
//        }
//        return true;
//    }

    /**
     * Does the given string contain a vowel?
     * @param s String to check
     * @return True if s contains a vowel, false if not
     */
    public static boolean hasVowel(String s) {
        // Ok, going to try to assign the vowels to an index
        // and looked up indexOf() in w3schools.com
        // checks index given "s" if vowel is preset
        // as indexOf assigns int value to String v
        // v > 0 = vowel present else false
        // charAt also returns int value, but this indexOf
        // came up while looking at charAt(i) options and seems easier
        // or more efficient than a for loop?

        String v = "aeiouAEIOU"; // string contains all vowels
        if (v.indexOf(s) > 0 ){

            return true;
        }
        return false;
    }

    /**
     * Create a new string containing the characters of the
     * given string in reverse order.
     * @param s The string to reverse
     * @return Reversed string.
     */
    public static String reverseString(String s) {
        // should probably convert String to int
        // I'm pretty sure this was in a lecture
        // And it was a lob assignment which I lost



//        // Have to return something here to make the file compile
        return "this string is junk";
    }

    /**
     * Average the length of up to five vowelless strings.
     * Any strings containing vowels are not included in this calculation.
     * @param a First string
     * @param b Second string
     * @param c Third string
     * @param d Fourth string
     * @param e Fifth string
     * @return Average length of the vowelless input strings.
     *         If all have vowels, returns -1000.
     */
//    public static double averageUnvowelledLength(String a, String b, String c,
//                                                 String d, String e) {
//        // TODO: REPLACE THE METHOD BODY
//
//        // This is an obviously wrong return value
//        // that exists only to allow the file to compile
//        return -4.2;
//    }
//
//
//    // WRITE A METHOD FROM SCRATCH
//    // Write a method call countVowels that returns the number
//    // of vowels in the given string.
//    // The method should take a single String argument and return an int
//    // Don't forget to use the public static modifiers

//    public static int countVowels (String str) {
//        int count = 0;
//        int len = str.length();
//
//        // String v = "aeiouAEIOU"; I wanted to use indexOf again but failed
//        // So I went back to hardcoding. I think I misunderstood indexOf
//
//        for ( int i = 0; i < str.length(); i++){
//            if (str.charAt(i) =='a' || str.charAt(i) == 'e'
//                    || str.charAt(i) =='i' || str.charAt(i) == 'o'
//                    || str.charAt(i) =='u' || str.charAt(i) == 'A'
//                    || str.charAt(i) =='E' || str.charAt(i) =='I'
//                    || str.charAt(i) =='O' || str.charAt(i) =='U')
//            {
//                count++;
//
//        }
//
//        return count;
//    }
//
//
//    // WRITE A METHOD FROM SCRATCH
//    //
//    // Write a method called totalMealPrice that takes two
//    // arguments, an int meal which is the cost of a meal, and a
//    // double tip which represents the tip percentage one would add to
//    // the bill.
//    // The method must return a double which equals how much should be
//    // paid.
//    //
//    // int meal must be greater than 0
//    // double tip must be 0 or greater and .9 or less (no tips over 90%)
//    // If either number is invalid, return -1;
//    //
//    // Don't forget to use the public static modifiers
//
//



        // This code tests your program's completeness.
        public static void main(String[] args) {
            int numCorrect = 0;

            if( middleOfThree(1, 2, 3) == 2) { numCorrect++; }
            if( middleOfThree(4, -5, 3) == 3) { numCorrect++; }
            if( middleOfThree(5, 7, 0) == 5) { numCorrect++; }
            if( middleOfThree(-1, -2, 3) == -1) { numCorrect++; }

            if( !isVowel('x') ) { numCorrect++; }
            if( !isVowel('5') ) { numCorrect++; }
            if( isVowel('A') ) { numCorrect++; }
            if( isVowel('E') ) { numCorrect++; }
            if( isVowel('i') ) { numCorrect++; }
            if( isVowel('o') ) { numCorrect++; }
            if( isVowel('U') ) { numCorrect++; }
//
            if( !hasVowel("") ) { numCorrect++; }
            if( hasVowel("banana") ) { numCorrect++; }
            if( hasVowel("Old") ) { numCorrect++; }
            if( !hasVowel("rhythm") ) { numCorrect++; }
            if( !hasVowel("L33T") ) { numCorrect++; }
//
//        if( reverseString("").equals("")) { numCorrect++; }
//        if( reverseString("abcde").equals("edcba")) { numCorrect++; }
//        if( reverseString("Hello, World!").equals("!dlroW ,olleH")) { numCorrect++; }
//
//        if( averageUnvowelledLength("", "abc", "banana", "oops", "xyz") == 1.5) { numCorrect++; }
//        if( averageUnvowelledLength("The quick", "brown fox", "jumped", "over the", "lazy dog") == -1000.0) { numCorrect++; }
//        if( averageUnvowelledLength("123", "4567", "890", "jkl;vbnm", "!@#$%^*&") == 5.2) { numCorrect++; }
//
//         Uncomment these tests AFTER IMPLEMENTING countVowels
//         if( countVowels("L33T rhythm") == 0) { numCorrect++; }
//         if( countVowels("abcdefghijklmNOPQRSTUVWZYZ") == 5) { numCorrect++; }
//         if( countVowels("One TWO 3 four FIVE") == 7) { numCorrect++; }

//        // Uncomment these tests AFTER IMPLEMENTING totalMealPrice
//        // if( totalMealPrice( 0, .3 ) == -1 ) { numCorrect++; }
//        // if( totalMealPrice( 10, .2 ) == 12.0 ) { numCorrect++; }
//        // if( totalMealPrice( 100, .5 ) == 150 ) { numCorrect++; }
//        // if( totalMealPrice( 100, .91 ) == -1 ) { numCorrect++; }
//        // if( totalMealPrice( 120, .32 ) == 158.4 ) { numCorrect++; }
//
            System.out.println( "Your program's completeness is currently: "
                    + numCorrect + "/30" );
        }

    }

