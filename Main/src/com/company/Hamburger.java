package com.company;

import java.util.ArrayList;

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

    private double getBasePrice() {
        //System.out.println("Base price of burger: €" + basePrice);
        return basePrice;
    }

    private double getAdditionalPrice() {
        //System.out.println("Base price of burger: €" + additionalPrice);
        return additionalPrice;
    }

    /*private ArrayList<String> listOfToppingsAdded(String topping) {
        ArrayList<String> toppings = new ArrayList<String>();
        toppings.add(topping);
        return toppings;
    }*/

    public double getPrice() {
        System.out.println("Base price: €" + getBasePrice() +
                //"\nToppings added: " + listOfToppingsAdded() +
        "\nCost of additional toppings: €" + getAdditionalPrice() +
        "\nTotal price: €" + (getBasePrice() + getAdditionalPrice()));
        return getBasePrice() + getAdditionalPrice();
    }

    /*public double getPrice() {
        System.out.println("Base price of burger: €" + basePrice +
                "\nAdditions: €" +
                "\nTotal: €" + (basePrice + additionalPrice));
        return basePrice + additionalPrice;
    }*/

    public double addTopping(String topping){
        String toppingAdded = topping.toLowerCase();
        int numberOfToppingsAdded = checkCountOfToppingsAdded();
        while (numberOfToppingsAdded < 4){
            if (toppingAdded.equals("tomato")){
                additionalPrice += .1;
                additionsAdded++;
                //listOfToppingsAdded(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("onion")){
                additionalPrice += .2;
                additionsAdded++;
                //listOfToppingsAdded(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("ketchup")){
                additionalPrice += .3;
                additionsAdded++;
                //listOfToppingsAdded(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("cheese")){
                additionalPrice += .4;
                additionsAdded++;
               //listOfToppingsAdded(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("beetroot")){
                additionalPrice += .5;
                additionsAdded++;
                //listOfToppingsAdded(topping);
                return additionalPrice;
            } else {
                System.out.println(topping + " is not a valid topping");
                break;
            }
        }
        return additionsAdded;
    }

    private int checkCountOfToppingsAdded() {
        if (additionsAdded == 4){
            System.out.println("Maximum additional toppings added");
            return additionsAdded;
        }
        return additionsAdded;
    }
}


