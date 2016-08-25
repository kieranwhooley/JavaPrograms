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

        printer2.printPages(100);
        printer2.addMoreToner(30);
        printer.printPages(14);
        printer2.addMoreToner(30);
        printer2.addMoreToner(30);
        printer2.addMoreToner(30);
        System.out.println("Number of pages printed so far: " + printer.getNumberOfPagesPrinted());
        System.out.println("Toner level is : " + printer.getTonerLevel() + "%");

    }
}
