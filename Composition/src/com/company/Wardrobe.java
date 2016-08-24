package com.company;

/**
 * Created on 24/08/2016.
 */
public class Wardrobe {

    private String madeOf;
    private Dimensions wardrobeDimensions;

    public Wardrobe(String madeOf, Dimensions wardrobeDimensions) {
        this.madeOf = madeOf;
        this.wardrobeDimensions = wardrobeDimensions;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public Dimensions getWardrobeDimensions() {
        return wardrobeDimensions;
    }
}
