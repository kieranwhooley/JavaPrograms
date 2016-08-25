package com.company;

public class Main {

    public static void main(String[] args) {

        /*Player player = new Player();
        player.name ="Rudiger" ;
        player.health = 20;
        player.weapon = "Sword"; //scope of variables in PLayer class set to public so can access these from Main class

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.health);
        damage = 11;
        //can change fields directly, not a good idea //player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.health);*///Direct access to health

        EnhancedPlayer player = new EnhancedPlayer("Rudiger", 50, "Sword");//passing in more than 100 sets it to default 100 in constructor
        System.out.println("Initial health is: " + player.getHealth());//access to health via getter
    }
}
