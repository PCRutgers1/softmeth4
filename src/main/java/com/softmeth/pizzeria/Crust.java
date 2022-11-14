package com.softmeth.pizzeria;

public enum Crust {
    BROOKLYN("Brooklyn"), THIN("Thin"), HAND_TOSSED("Hand Tossed"), PAN("Pan"),
    STUFFED("Stuffed"), DEEP_DISH("Deep Dish"), INVALID("None");
    private final String crust;
    private Crust(String crust) {
        this.crust = crust;
    }
    public static Crust findCrust(String crust) {
        Crust[] allTime = Crust.values();

        for (Crust c : allTime) {
            if (c.name().equalsIgnoreCase(crust)) return c;
        }
        return INVALID;
    }
}
