package com.softmeth.pizzeria;

/**
 * It's an Interface that provides a template for the creations of different types of pizza
 *
 * @author Peter Chen, Jonathon Lopez
 */
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