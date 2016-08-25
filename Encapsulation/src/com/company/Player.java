package com.company;

/**
 * Created on 25/08/2016.
 */
public class Player {

    public String name; //public String fullname; change field name and makes fields in main not work
    public int health;//forgetting to initialize also causes problems if no constructor
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives player has
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
