package com.softmeth.pizzeria;

public enum Size {
    DELUXE_SMALL("Deluxe Small",14.99),
    DELUXE_MEDIUM("Deluxe Medium",16.99),
    DELUXE_LARGE("Deluxe Large",18.99),
    BBQ_SMALL("BBQ Small",13.99),
    BBQ_MEDIUM("BBQ Medium",15.99),
    BBQ_LARGE("BBQ Large",17.99),
    MEATZZA_SMALL("Meatzza Samll",15.99),
    MEATZZA_MEDIUM("Meatzza Medium",17.99),
    MEATZZA_LARGE("Meatzza Large",18.99),
    SMALL("Small",8.99),
    MEDIUM("Medium",10.99),
    LARGE("Large",12.99),INVALID("",0);

    private final String size;
    private final double price;

    Size(String s, double v) {
        this.size=s;
        this.price=v;
    }
    public String getSize() {
        return this.size;
    }
    public double getPrice() {
        return this.price;
    }
    public static Size findSize(String size) {
        Size[] allSizes = Size.values();

        for (Size c : allSizes) {
            if (c.size.equalsIgnoreCase(size)) return c;
        }
        return INVALID;
    }
}