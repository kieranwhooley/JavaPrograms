package com.company;

/**
 * Created on 15/09/2016.
 */
public class Hamburger {

    public String breadRollType;
    public String meat;
    /*public String onion;
    public String lettuce;
    public String cheese;
    public String sauce;*/
    public double basePrice = 2;
    public double additionalPrice = 0;
    private int additionsAdded = 0;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public double getPrice() {
        System.out.println("Base price of burger: €" + basePrice +
                "\nAdditions: €" + additionalPrice + "\nTotal: €" + (basePrice + additionalPrice));
        return basePrice + additionalPrice;
    }

    public double addTopping(String topping){
        String toppingAdded = topping.toLowerCase();
        int numberOfToppingsAdded = checkCountOfToppingsAdded();
        while (numberOfToppingsAdded < 5){
            if (toppingAdded.equals("tomato")){
                additionalPrice += .15;
                additionsAdded++;
                return additionalPrice;
            } else if (toppingAdded.equals("onion")){
                additionalPrice += .25;
                additionsAdded++;
                return additionalPrice;
            } else if (toppingAdded.equals("ketchup")){
                additionalPrice += .05;
                additionsAdded++;
                return additionalPrice;
            } else if (toppingAdded.equals("cheese")){
                additionalPrice += .25;
                additionsAdded++;
                return additionalPrice;
            } else if (toppingAdded.equals("beetroot")){
                additionalPrice += .75;
                additionsAdded++;
                return additionalPrice;
            } else {
                System.out.println(topping + " is not a valid topping");
                break;
            }
        }
        return 0;
    }

    private int checkCountOfToppingsAdded() {
        if (additionsAdded >= 4){
            System.out.println("Maximum additional toppings added");
        }
        return additionsAdded;
    }
}


