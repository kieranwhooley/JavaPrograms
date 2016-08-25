package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(100, true);
        /*printer.printPages(5);
        printer.printPages(5);

        printer.setTonerLevel(15);
        printer.setTonerLevel(45);
        printer.setTonerLevel(20);
        printer.setTonerLevel(35);*/

        printer.printPages(3);
        printer.addMoreToner(7);

        Printer printer2 = new Printer(50, false);

        printer2.printPages(2);
        printer2.addMoreToner(30);

    }
}
