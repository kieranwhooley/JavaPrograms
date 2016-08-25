package com.company;

/**
 * Created on 25/08/2016.
 */
public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {//if more than 100 passed in it defaults to 100
            this.hitPoints = health;//validation of health value etc when creating player
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives player has
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
