package com.softmeth.pizzeria;

import java.util.ArrayList;

public abstract class Pizza implements Customizable {
    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    public abstract double price();

    public Pizza(String [] toppings, Crust crust,Size size, double price) {
        this.crust = crust;
        this.size = size;
        this.toppings = new ArrayList<Topping>();
    }
}
