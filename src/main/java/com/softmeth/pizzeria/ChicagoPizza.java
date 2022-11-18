package com.softmeth.pizzeria;

public class ChicagoPizza implements PizzaFactory{

    @Override
    public Pizza createDeluxe() {
        String [] toppings = {"Sausage", "pepperoni", "green pepper", "onion", "mushroom"};
        Crust crust = Crust.DEEP_DISH;
        return new Deluxe(toppings,crust);
    }

    @Override
    public Pizza createMeatzza() {

        Pizza meatzza = new Meatzza();


        return meatzza;
    }

    @Override
    public Pizza createBBQChicken() {
        Pizza bbq = new BBQChicken();


        return bbq;
    }

    @Override
    public Pizza createBuildYourOwn() {
        Pizza buildMyOwn = new BuildYourOwn();


        return buildMyOwn;
    }


}