package com.softmeth.pizzeria;

public class Deluxe extends Pizza{
    private double price;
    public Deluxe(String[] toppings, Crust crust) {
        super(toppings, crust);
    }

    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public double price() {
        return this.price;
    }
}
