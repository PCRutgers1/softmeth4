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

    /**
     * Converts a pizza object to a string
     *
     * @return converts a pizza to a string
     */
    public String toString() {
        String pizzaType = "";
        if (this instanceof Deluxe)
            pizzaType = "Deluxe";
        else if (this instanceof Meatzza)
            pizzaType = "Meatzza";
        else if (this instanceof BBQChicken)
            pizzaType = "BBQ Chicken";
        else
            pizzaType = "Build Your Own Pizza";
        return pizzaType + "(" + this.getPizzaType() + " Style - " + this.crust.getCrust() +
                ",)" + this.toppingsToString() + ", " + this.size + ", $" + String.format("%.2f", this.price());
    }

    /**
     * Converts a topping object to a string
     *
     * @return converts toppings to a string
     */
    public String toppingsToString() {
        String top = "";
        for (Topping t : this.toppings)
            top = top + ", " + t.getTopping();
        return top;

    }

    /**
     * Set all the Attributes of a Pizza
     *
     * @param toppings A string list of all the Toppings
     * @param crust    The Crust of the pizza
     */
    public Pizza(String[] toppings, Crust crust) {
        this.crust = crust;
        this.toppings = new ArrayList<>();
        if (toppings != null)
            for (String t : toppings) {
                this.toppings.add(Topping.findTopping(t));
            }
    }
    public void setSize(Size size){
        this.size = size;
    }

}
