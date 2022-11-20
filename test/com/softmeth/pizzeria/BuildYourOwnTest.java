package com.softmeth.pizzeria;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BuildYourOwnTest {


    //Test the price method, where there is no toppings and make sure that the base pizza has the right price
    @Test
    void price() {
        // the toppings that we will use
        Set<Topping> toppings = new HashSet<>();


        //we first create a new Chicago pizza and give it the correct crust for it
        Crust crust = Crust.PAN;
        BuildYourOwn buildYourOwnPizzaChicago = new BuildYourOwn(crust, "Chicago");

        //set the pizza size to small and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.SMALL);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Small", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),8.99);

        //set the pizza size to medium and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.MEDIUM);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Medium", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),10.99);


        //set the pizza size to large and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.LARGE);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Large", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),12.99);


        //we now create a new NY pizza and give it the correct crust for it
        //we are testing the same things as above except now wtih new york type pizzas
        Crust crustNY = Crust.HAND_TOSSED;
        BuildYourOwn buildYourOwnPizzaNY = new BuildYourOwn(crustNY, "New York");

        //set the pizza size to small and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.SMALL);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Small", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),8.99);

        //set the pizza size to medium and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.MEDIUM);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Medium", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),10.99);


        //set the pizza size to large and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.LARGE);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Large", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),12.99);

    }

    //Test the price method, where there is 1 topping and make sure that the base pizza has the right price for Chicago Pizza types
    @Test
    void testPriceWithToppingsChicago(){
        // the toppings that we will use
        Set<Topping> toppings = new HashSet<>();


        //we first create a new Chicago pizza and give it the correct crust for it
        Crust crust = Crust.PAN;
        BuildYourOwn buildYourOwnPizzaChicago = new BuildYourOwn(crust, "Chicago");


        //add toppings one by one so that we can double-check that we still get the correct amount
        //here we add one topping and make sure that we still get the correct price for each pizza size
        toppings.add(Topping.findTopping("Mushroom"));
        buildYourOwnPizzaChicago.setToppings(toppings);

        //set the pizza size to small and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.SMALL);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Small", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),8.99 + 1.59);

        //set the pizza size to medium and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.MEDIUM);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Medium", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),10.99 + 1.59);


        //set the pizza size to large and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.LARGE);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Large", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),12.99 + 1.59);
    }


    //Test the price method, where there are 7 toppings and make sure that the base pizza has the right price for Chicago Pizza types
    @Test
    void testPriceWithToppingsChicagoWithMoreThanOne(){
        // the toppings that we will use
        Set<Topping> toppings = new HashSet<>();


        //we first create a new Chicago pizza and give it the correct crust for it
        Crust crust = Crust.PAN;
        BuildYourOwn buildYourOwnPizzaChicago = new BuildYourOwn(crust, "Chicago");


        //add toppings one by one so that we can double-check that we still get the correct amount
        //here we add one topping and make sure that we still get the correct price for each pizza size
        toppings.add(Topping.findTopping("Mushroom"));
        toppings.add(Topping.findTopping("Spinach"));
        toppings.add(Topping.findTopping("Cheddar"));
        toppings.add(Topping.findTopping("Beef"));
        toppings.add(Topping.findTopping("Bacon"));
        toppings.add(Topping.findTopping("Pineapple"));
        toppings.add(Topping.findTopping("Sausage"));
        buildYourOwnPizzaChicago.setToppings(toppings);

        //set the pizza size to small and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.SMALL);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Small", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),8.99 + 1.59 *7);

        //set the pizza size to medium and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.MEDIUM);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Medium", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),10.99 + 1.59*7);


        //set the pizza size to large and make sure that we get the right amount for that
        buildYourOwnPizzaChicago.setSize(Size.LARGE);
        buildYourOwnPizzaChicago.setPrice(buildYourOwnPizzaChicago.setPizzaPrice("Large", toppings));
        assertEquals(buildYourOwnPizzaChicago.price(),12.99 + 1.59*7);
    }


    //Test the price method, where there is 1 topping and make sure that the base pizza has the right price for NY Pizza types
    @Test
    void testPriceWithToppingsNY(){
        // the toppings that we will use
        Set<Topping> toppings = new HashSet<>();


        //we first create a New York pizza and give it the correct crust for it
        Crust crust = Crust.HAND_TOSSED;
        BuildYourOwn buildYourOwnPizzaNY = new BuildYourOwn(crust, "New York");


        //add toppings one by one so that we can double-check that we still get the correct amount
        //here we add one topping and make sure that we still get the correct price for each pizza size
        toppings.add(Topping.findTopping("Chicken"));
        buildYourOwnPizzaNY.setToppings(toppings);

        //set the pizza size to small and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.SMALL);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Small", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),8.99 + 1.59);

        //set the pizza size to medium and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.MEDIUM);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Medium", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),10.99 + 1.59);


        //set the pizza size to large and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.LARGE);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Large", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),12.99 + 1.59);
    }

    //Test the price method, where there are 7 toppings and make sure that the base pizza has the right price for NY Pizza types
    @Test
    void testPriceWithToppingsNYithMoreThanOne(){
        // the toppings that we will use
        Set<Topping> toppings = new HashSet<>();

        //we first create a new Chicago pizza and give it the correct crust for it
        Crust crust = Crust.PAN;
        BuildYourOwn buildYourOwnPizzaNY = new BuildYourOwn(crust, "Chicago");


        //add toppings one by one so that we can double-check that we still get the correct amount
        //here we add one topping and make sure that we still get the correct price for each pizza size
        toppings.add(Topping.findTopping("Mushroom"));
        toppings.add(Topping.findTopping("Spinach"));
        toppings.add(Topping.findTopping("Cheddar"));
        toppings.add(Topping.findTopping("Beef"));
        toppings.add(Topping.findTopping("Bacon"));
        toppings.add(Topping.findTopping("Pineapple"));
        toppings.add(Topping.findTopping("Sausage"));
        buildYourOwnPizzaNY.setToppings(toppings);

        //set the pizza size to small and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.SMALL);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Small", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),8.99 + 1.59 *7);

        //set the pizza size to medium and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.MEDIUM);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Medium", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),10.99 + 1.59*7);


        //set the pizza size to large and make sure that we get the right amount for that
        buildYourOwnPizzaNY.setSize(Size.LARGE);
        buildYourOwnPizzaNY.setPrice(buildYourOwnPizzaNY.setPizzaPrice("Large", toppings));
        assertEquals(buildYourOwnPizzaNY.price(),12.99 + 1.59*7);
    }

}
