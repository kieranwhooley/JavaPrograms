package com.company;

/**
 * Created on 15/09/2016.
 */
public class HealthyBurger extends Hamburger{
    //add in a different base price for Healthy Burger for calculations
    public HealthyBurger(String meat) {
        super("Brown rye", meat);
    }

    public void burgerOrdered() {
        System.out.println("***HEALTHY BURGER***\nBread roll type: " + getBreadRollType() +
                "\nMeat type: " + getMeat() );
    }

    public double addTopping(String topping){
        String toppingAdded = topping.toLowerCase();
        int numberOfToppingsAdded = checkCountOfToppingsAdded();
        while (numberOfToppingsAdded < 6){
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
        if (additionsAdded == 6){
            System.out.println("Maximum additional toppings added to Healthy Burger is 6");
            return additionsAdded;
        }
        return additionsAdded;
    }
}
