package com.softmeth.pizzeria;

import java.util.ArrayList;

public abstract class Pizza implements Customizable {
    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    public abstract double price();

    public Pizza( Crust crust,Size size){
        this.crust=crust;
        this.size=size;
        toppings = new ArrayList<Topping>();
    }
}