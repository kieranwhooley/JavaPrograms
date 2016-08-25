package com.company;

/**
 * Created on 25/08/2016.
 */
public class Printer {

    private int tonerLevel = 0;
    private int numberOfPagesPrinted = 0;
    private boolean duplexPrinter = false;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel > 0 && tonerLevel < 100) {
            this.tonerLevel = tonerLevel;
        }
        this.duplexPrinter = duplexPrinter;
    }

    public void printPages(int numberOfCopies) {
        numberOfPagesPrinted += numberOfCopies;
        System.out.println("Total number of pages printed: " + numberOfPagesPrinted);
        if (duplexPrinter == true){
            int reduceTonerBy = numberOfCopies * 2;
            System.out.println("Printer was a duplex. Pages printed on both sides");
            reduceTonerLevel(reduceTonerBy);
        } else {
            int reduceTonerBy = numberOfCopies;
            System.out.println("Printer was not a duplex. Pages printed on only one side");
            reduceTonerLevel(reduceTonerBy);
        }
    }

    public void addMoreToner(int moreToner) {
        int maxTonerLevel = 100;
        tonerLevel += moreToner;
        if (tonerLevel > maxTonerLevel) {
            int leftOverToner = tonerLevel - maxTonerLevel;
            System.out.println("Toner is now at 100% capacity\n" + leftOverToner + " leftover");
        } else {
            System.out.println("Toner topped up. It is now " + tonerLevel + "% full");
        }
    }

    private void reduceTonerLevel (int reduceTonerBy) {
        tonerLevel -= reduceTonerBy;
        System.out.println("Toner level reduced to " + tonerLevel + "% after printing " + numberOfPagesPrinted + " pages");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
