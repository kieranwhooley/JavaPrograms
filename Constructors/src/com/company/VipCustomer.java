package com.company;

/**
 * Created on 18/08/2016.
 */
public class VipCustomer {

    private String vipName;
    private double cardLimit;
    private String vipEmail;

    public VipCustomer() {
        this("Default VIP name", 5000, "Default VIP email");
    }

    public VipCustomer(String vipName, String vipEmail) {
        this(vipName, 10000, vipEmail);
    }

    public VipCustomer(String vipName, double cardLimit, String vipEmail) {
        this.vipName = vipName;
        this.cardLimit = cardLimit;
        this.vipEmail = vipEmail;
    }

    public String getVipName() {
        return vipName;
    }

    public double getCardLimit() {
        return cardLimit;
    }

    public String getVipEmail() {
        return vipEmail;
    }
}
