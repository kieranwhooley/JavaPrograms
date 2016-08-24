package com.company;

/**
 * Created on 24/08/2016.
 */
public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;//has a resolution

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;

    }

    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Drawing pixel at: " + x + " , " + y + " in colour: " + colour );
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
