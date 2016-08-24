package com.company;

/**
 * Created on 24/08/2016.
 */
public class Window {

    private String glazeType;
    private String tintType;
    private Dimensions windowSize;

    public Window(Dimensions windowSize, String glazeType, String tintType) {
        this.windowSize = windowSize;
        this.glazeType = glazeType;
        this.tintType = tintType;
    }

    public void openWindow() {
        System.out.println("Window is now open");
    }

    public void closeWindow() {
        System.out.println("Window is now closed");
    }

    public String getGlazeType() {
        return glazeType;
    }

    public String getTintType() {
        return tintType;
    }

    public Dimensions getWindowSize() {
        return windowSize;
    }
}
