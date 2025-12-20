package com.selenophile.strings;

public class MethodsInStringClass {
    String string1 = "Hello World";

    public void testMethods(){
        /*
        * int length()
        * Returns the number of characters in the String.
        * */
        System.out.println("Hello World - length() - " + string1.length());

        /*
        * char charAt(int i)
        * Returns the character at ith index.
        * */
        System.out.println("Hello World - charAt(2) - " + string1.charAt(2));

        /*
         * String substring(int i)
         * Return the substring from the ith index character to end.
         * */
        System.out.println("Hello World - substring(6) - " + string1.substring(6));

    }
}
