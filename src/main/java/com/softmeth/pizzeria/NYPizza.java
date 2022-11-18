package com.softmeth.pizzeria;

public class NYPizza implements PizzaFactory{
    @Override
    public Pizza createDeluxe() {
        String [] toppings = {"Sausage", "Pepperoni", "Green Pepper", "Onion", "Mushroom"};
        Crust crust = Crust.BROOKLYN;
        return new Deluxe(toppings,crust);
    }

    @Override
    public Pizza createMeatzza() {
        String [] toppings = {"Sausage", "Pepperoni", "Beef", "Ham"};
        Crust crust = Crust.HAND_TOSSED;
        Pizza meatzza = new Meatzza(toppings,crust);
        return meatzza;
    }

    @Override
    public Pizza createBBQChicken() {
        String [] toppings = {"BBQ Chicken", "Green Pepper", "Provolone", "Cheddar"};
        Crust crust = Crust.THIN;
        Pizza bbq = new BBQChicken(toppings,crust);
        return bbq;
    }

    @Override
    public Pizza createBuildYourOwn() {
        Crust crust = Crust.HAND_TOSSED;
        Pizza myPizza = new BuildYourOwn(crust);
        return myPizza;
    }
}
