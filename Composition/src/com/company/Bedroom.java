package com.company;

/**
 * Created on 24/08/2016.
 */
public class Bedroom {

    private String bedType;
    private Heater heater;
    private Window window;
    private Wardrobe wardrobe;

    public Bedroom(String bedType, Heater heater, Window window, Wardrobe wardrobe) {
        this.bedType = bedType;
        this.heater = heater;
        this.window = window;
        this.wardrobe = wardrobe;
    }

    public void OpenOrCloseWindow(boolean willIOpen){
        if (willIOpen){
            window.openWindow();
        } else {
            window.closeWindow();
        }
    }

    public String getBed() {
        return bedType;
    }

    public void setTemperatureInRoom( double roomTemp){
        heater.heaterTempurature(roomTemp);
    }

    public Heater getHeater() {
        return heater;
    }

    public Window getWindow() {
        return window;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
