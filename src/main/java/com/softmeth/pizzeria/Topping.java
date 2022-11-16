package com.softmeth.pizzeria;

public enum Topping {
    PINEAPPLE("Pineapple"),
    CHICKEN("Chicken"),
    SAUSAGE("Sausage"),
    PEPPERONI("Pepperoni"),
    BEEF("Beef"),
    HAM("Ham"),
    GREEN_PEPPERS("Green Peppers"),
    PEPPERS("Peppers"),
    MUSHROOMS("Mushrooms"),
    ONIONS("Onions"),
    BBQ_CHICKEN("BBQ Chicken"),
    SPINACH("Spinach"),
    PROVOLONE("Provolone"),
    CHEDDAR("Cheddar"),
    OLIVES("Olives"),
    BACON("Bacon"),
    INVALID("None");


    private final String topping;

    Topping(String topping) {
        this.topping=topping;
    }

    public static Topping findCrust(String topping) {
        Topping[] allToppings = Topping.values();

        for (Topping t : allToppings) {
            if (t.name().equalsIgnoreCase(topping)) return t;
        }
        return INVALID;
    }
}