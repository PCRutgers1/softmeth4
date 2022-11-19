package com.softmeth.pizzeria;

public class Meatzza extends Pizza{
    private double price;
    private String pizzaType;
    /**
     * Set all the Attributes of a Meatzza Pizza
     *
     * @param toppings the list of all the Toppings of a pizza
     * @param crust the Crust of the pizza
     */
    public Meatzza(String[] toppings, Crust crust, String pizzaType) {
        super(toppings, crust);
        this.pizzaType = pizzaType;
    }
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * This method adds an object to something
     * @param obj the Object being added
     */
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
        return this.price;
    }
}
