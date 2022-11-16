package com.softmeth.pizzeria;

public class BuildYourOwn extends Pizza{
    public BuildYourOwn(String[] toppings, Crust crust, Size size,
                        double price) {
        super(toppings, crust, size, price);
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
