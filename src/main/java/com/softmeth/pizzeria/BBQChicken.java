package com.softmeth.pizzeria;

public class BBQChicken extends Pizza{
    public BBQChicken(String[] toppings, Crust crust, Size size) {
        super(toppings, crust, size);
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
        return 0;
    }
}
