package com.company;

/**
 * Created on 15/09/2016.
 */
public class DeluxeBurger extends Hamburger {

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
}
