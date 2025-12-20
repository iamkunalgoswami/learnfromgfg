package com.selenophile;

import com.selenophile.strings.BasicsOfString;
import com.selenophile.strings.MethodsInStringClass;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        /*
        * BasicsOfString
        * */
        System.out.println("\n********************************** BasicsOfString **********************************\n");

        BasicsOfString basicsOfString = new BasicsOfString();
        basicsOfString.declareAndPrint();
        basicsOfString.checkStringPoolMemoryAllocation();
        System.out.println(basicsOfString.reverseStringUsingConcat("Reverse"));
        System.out.println("Is Palindrome - " + basicsOfString.checkPalindrome("Dad"));

        /*
         * MethodsInStringClass
         * */
        System.out.println("\n********************************** MethodsInStringClass **********************************\n");

        MethodsInStringClass methodsInStringClass = new MethodsInStringClass();
        methodsInStringClass.testMethods();
    }
}
