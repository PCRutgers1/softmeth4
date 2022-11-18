package com.softmeth.pizzeria;

public class Meatzza extends Pizza{
    private double price;

    /**
     * Set all the Attributes of a Meatzza Pizza
     *
     * @param toppings the list of all the Toppings of a pizza
     * @param crust the Crust of the pizza
     */
    public Meatzza(String[] toppings, Crust crust) {
        super(toppings, crust);
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
     * @return returns the price for the Meatzza Pizza
     */
    @Override
    public double price() {
        return 0;
    }
}
