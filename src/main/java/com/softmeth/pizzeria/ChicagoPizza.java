package com.softmeth.pizzeria;

public class ChicagoPizza implements PizzaFactory{

    /**
     *
     */
    @Override
    public Pizza createDeluxe() {
        String [] toppings = {"Sausage", "Pepperoni", "Green Pepper", "Onion", "Mushroom"};
        Crust crust = Crust.DEEP_DISH;
        return new Deluxe(toppings,crust);
    }

    @Override
    public Pizza createMeatzza() {
        String [] toppings = {"Sausage", "Pepperoni", "Beef", "Ham"};
        Crust crust = Crust.STUFFED;
        Pizza meatzza = new Meatzza(toppings,crust);
        return meatzza;
    }

    @Override
    public Pizza createBBQChicken() {
        String [] toppings = {"BBQ Chicken", "Green Pepper", "Provolone", "Cheddar"};
        Crust crust = Crust.PAN;
        Pizza bbq = new BBQChicken(toppings,crust);
        return bbq;
    }

    @Override
    public Pizza createBuildYourOwn() {
        Crust crust = Crust.PAN;
        Pizza myPizza = new BuildYourOwn(crust);
        return myPizza;
    }
}