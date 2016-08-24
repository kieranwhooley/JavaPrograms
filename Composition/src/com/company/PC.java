package com.company;

/**
 * Created on 24/08/2016.
 */
public class PC {

    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public void powerUp() { //public method can access private ones below but they cannot be called directly
        theCase.pressPowerButton();//in Case object
        drawLogo();
    }

    public void drawLogo(){
        //Fancy graphics two ways of calling method
        //getMonitors().drawPixelAt(1200, 50, "Yellow");
        monitors.drawPixelAt(1200,50, "Yellow");//better way
    }


    /*
    You can remove these and access them directly from Case, Monitor and Motherboard classes instead
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitors() {
        return monitors;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/
}
