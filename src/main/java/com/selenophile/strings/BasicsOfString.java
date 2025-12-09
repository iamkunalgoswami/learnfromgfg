package com.selenophile.strings;

public class BasicsOfString {
    /*
    * Basic Declaration
    * */
    public void declareAndPrint(){
        String name = new String();
        printString(name);
        name = "Kunal";
        printString(name);
        String fullName = name.concat(" Goswami");
        printString(name);
        printString(fullName);

    }
    public void printString(String string){
        System.out.println("My String is "+string);
    }
    /*
    * Check the storage of the declared String
    * */
    public void checkStringPoolMemoryAllocation(){
        /*
        * Got Memory in String Constant Pool
        * And String Constant Pool is a special memory area on Heap
        * */
        String string1 = "TestString";
        String string2 = "TestString";
        System.out.println("Is string1 is sharing the same memory location of string2 - " + (string1 == string2));

        /*
        * Got Memory in Heap
        * */
        String string3 = new String("TestString");
        String string4 = new String("TestString");
        System.out.println("Is string3 is sharing the same memory location of string4 - " + (string3 == string4));

        /*
        * Using intern() method to get the memory reference from String Constant Pool
        * */
        String string5 = string4.intern();
        System.out.println("After Using intern() : Is string3 is sharing the same memory location of string5 - " + (string3 == string5));
        System.out.println("After Using intern() : Is string1 is sharing the same memory location of string5 - " + (string1 == string5));
        System.out.println("After Using intern() : Is string2 is sharing the same memory location of string5 - " + (string2 == string5));


    }
}
