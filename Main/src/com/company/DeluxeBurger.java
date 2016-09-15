package com.company;

/**
 * Created on 15/09/2016.
 */
public class DeluxeBurger extends Hamburger {

    public double basePrice = 3.00;
    public double additionalPrice = 0;
    private String chips;
    private String drink;

    public DeluxeBurger(String breadRollType, String meat, String drink, String chips) {
        super(breadRollType, meat);
        this.drink = drink;
        this.chips = chips;
    }

    @Override
    public void burgerOrdered() {
        System.out.println("***DELUXE BURGER***\nBread roll type: " + getBreadRollType() +
                "\nMeat type: " + getMeat() +
        "\nDrink: " + drink + "\nChips: " + chips);
    }

    private double getBasePrice() {
        //System.out.println("Base price of burger: €" + basePrice);
        return basePrice;
    }

    private double getAdditionalPrice() {
        //System.out.println("Base price of burger: €" + additionalPrice);
        return additionalPrice;
    }

    public double getPrice() {
        System.out.println("Base price: €" + basePrice + "\nIncludes drink and chips\n"
        + "Total price: € " + basePrice);//figure out how to calculate price from here for additions to deluxe burger
        return basePrice;
    }
    //also figure out how to display the toppings in the burgerOrdered method including the price of each
}
