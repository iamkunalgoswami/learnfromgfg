package com.selenophile;

import com.selenophile.strings.BasicsOfString;

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
        BasicsOfString basicsOfString = new BasicsOfString();
        basicsOfString.declareAndPrint();
        basicsOfString.checkStringPoolMemoryAllocation();
    }
}
