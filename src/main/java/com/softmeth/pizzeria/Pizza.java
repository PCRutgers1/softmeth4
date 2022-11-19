package com.softmeth.pizzeria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public abstract class Pizza implements Customizable {
    private ArrayList<Topping> toppings;
    private Crust crust;
    private Size size;
    public abstract double price();
    public abstract void setPrice(double price);

    public Pizza(Crust crust){
        this.crust = crust;
    }
    public void setToppings(Set<Topping> toppings){
        this.toppings = new ArrayList<>();
        this.toppings.addAll(toppings);
    }

    public Pizza(String [] toppings, Crust crust) {
        this.crust = crust;
        this.toppings = new ArrayList<Topping>();
    }
    public void setSize(Size size){
        this.size = size;
    }

}
