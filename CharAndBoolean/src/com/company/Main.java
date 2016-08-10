package com.company;

public class Main {

    public static void main(String[] args) {
        //width of 16, 2 bytes
        char myChar = '\u00A9';
        //char supports unicode
        //unicode-table.com/en/#control-character/
        System.out.println(myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        //CHALLENGE
        char anotherChar = '\u00AE';
        System.out.println(anotherChar);

    }
}
