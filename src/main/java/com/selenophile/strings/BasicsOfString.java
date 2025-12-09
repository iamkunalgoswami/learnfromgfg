package com.selenophile.strings;

public class BasicsOfString {
    /*
    * Basic Declaration
    * */
    public void declareAndPrint(){
        String name = new String();
        printName(name);
        name = "Kunal";
        printName(name);
        String fullName = name.concat(" Goswami");
        printName(name);
        printName(fullName);

    }
    public void printName(String name){
        System.out.println("My name is "+name);
    }
}
