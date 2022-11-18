package com.softmeth.pizzeria;

public class BuildYourOwn extends Pizza{

    /**
     * Set all the Attributes of a Build Your Own Pizza
     *
     * @param crust the Crust of the pizza
     */
    public BuildYourOwn(Crust crust) {
        super(crust);
    }
    private double price;

    /**
     * setter method for Price
     * sets the price of the Meatzza Pizza
     * @param price the price of the Pizza
     */
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return  this.price;
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
     * @return returns the price for the Build Your Own Pizza
     */
    @Override
    public double price() {
        return 0;
    }
}
