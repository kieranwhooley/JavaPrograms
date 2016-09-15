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
    public int additionsAdded = 0;
    //public ArrayList<String> listOfToppingsAdded;

    public Hamburger(String breadRollType, String meat) {
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void burgerOrdered() {
        System.out.println("***HAMBURGER***\nBread roll type: " + getBreadRollType() +
                "\nMeat type: " + getMeat() );
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

   /*public String getListOfToppings() {
        for (String topping : listOfToppingsAdded){
            System.out.println(topping);
        } return "";
    }*/

    public double getPrice() {
        System.out.println("Base price: €" + getBasePrice() +
                //"\nToppings added: " + getListOfToppings() +
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
                System.out.println(topping + " added");
                additionalPrice += .1;
                additionsAdded++;
                //listOfToppingsAdded.add(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("onion")){
                System.out.println(topping + " added");
                additionalPrice += .2;
                additionsAdded++;
                //listOfToppingsAdded.add(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("ketchup")){
                System.out.println(topping + " added");
                additionalPrice += .3;
                additionsAdded++;
                //listOfToppingsAdded.add(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("cheese")){
                System.out.println(topping + " added");
                additionalPrice += .4;
                additionsAdded++;
                //listOfToppingsAdded.add(topping);
                return additionalPrice;
            } else if (toppingAdded.equals("beetroot")){
                System.out.println(topping + " added");
                additionalPrice += .5;
                additionsAdded++;
                //listOfToppingsAdded.add(topping);
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
            System.out.println("Maximum additional toppings added to Hamburger or Deluxe Burger is 4");
            return additionsAdded;
        }
        return additionsAdded;
    }
}


