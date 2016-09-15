package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger burger = new Hamburger("Wholemeal", "Beef");
        //burger.getPrice();
        burger.addTopping("Tomato");
        //burger.getPrice();
        burger.addTopping("Cheese");
        //burger.getPrice();
        //burger.addTopping("Lettuce");
        //burger.getPrice();
        burger.addTopping("Beetroot");
        //burger.getPrice();
        burger.addTopping("Ketchup");
        //burger.getPrice();
        burger.addTopping("Onion");
        //burger.getPrice();
        burger.addTopping("Onion");
        //burger.getPrice();
        burger.addTopping("Onion");
        burger.getPrice();

        burger.burgerOrdered();

        HealthyBurger healthyBurger = new HealthyBurger("Lamb");
        healthyBurger.addTopping("Tomato");
        healthyBurger.getPrice();
        healthyBurger.burgerOrdered();

        healthyBurger.addTopping("Cheese");
        healthyBurger.addTopping("Ketchup");
        healthyBurger.addTopping("Pineapple");
        healthyBurger.addTopping("Onion");
        healthyBurger.addTopping("Beetroot");
        healthyBurger.addTopping("Tomato");
        healthyBurger.addTopping("Cheese");
        healthyBurger.addTopping("Cheese");
        healthyBurger.getPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger("Brioche", "Chicken", "Coke", "Crinkle cut");
        deluxeBurger.burgerOrdered();
        }
}
