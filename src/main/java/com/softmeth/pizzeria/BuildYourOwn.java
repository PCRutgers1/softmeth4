package com.softmeth.pizzeria;

public class BuildYourOwn extends Pizza{
    public BuildYourOwn(String[] toppings, Crust crust, Size size) {
        super(toppings, crust, size);
    }

    @Override
    public boolean add(Object obj) {
        return false;
    }

    /**
     * This method removes an object from something
     * @param obj the Object being removed
     */
    @Override
    public boolean remove(Object obj) {
        return false;
    }

    /**
     * Getter method for Price
     *
     * @return returns the price for the Build Your Own Pizza
     */
    @Override
    public double price() {
        return 0;
    }
}
