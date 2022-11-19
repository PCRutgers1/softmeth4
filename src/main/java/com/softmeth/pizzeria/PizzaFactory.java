package com.softmeth.pizzeria;

public interface PizzaFactory {
    /**
     * Template other classes must implement
     */
    Pizza createDeluxe();
    /**
     * Template other classes must implement
     */
    Pizza createMeatzza();
    /**
     * Template other classes must implement
     */
    Pizza createBBQChicken();
    /**
     * Template other classes must implement
     */
    Pizza createBuildYourOwn();
}