package com.softmeth.pizzeria;

public class ChicagoPizza implements PizzaFactory{

    /**
     * Creates a new pizza of type Deluxe and corresponding
     * toppings of Sausage, Pepperoni, Green Pepper, Onion, and Mushroom
     * and crust of Deep Dish
     * @return returns the new Deluxe pizza
     */
    @Override
    public Pizza createDeluxe() {
        String [] toppings = {"Sausage", "Pepperoni", "Green Pepper", "Onion", "Mushroom"};
        Crust crust = Crust.DEEP_DISH;
        return new Deluxe(toppings,crust, "Chicago");
    }

    @Override
    public Pizza createMeatzza() {
        String [] toppings = {"Sausage", "Pepperoni", "Beef", "Ham"};
        Crust crust = Crust.STUFFED;
        Pizza meatzza = new Meatzza(toppings,crust, "Chicago");
        return meatzza;
    }

    @Override
    public Pizza createBBQChicken() {
        String [] toppings = {"BBQ Chicken", "Green Pepper", "Provolone", "Cheddar"};
        Crust crust = Crust.PAN;
        Pizza bbq = new BBQChicken(toppings,crust, "Chicago");
        return bbq;
    }

    @Override
    public Pizza createBuildYourOwn() {
        Crust crust = Crust.PAN;
        Pizza myPizza = new BuildYourOwn(crust, "Chicago");
        return myPizza;
    }
}