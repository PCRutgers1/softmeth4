package com.softmeth.pizzeria;

/**
 *Its an Interface that provides a template for the add and remove
 *
 * @author Peter Chen, Jonathon Lopez
 */
public interface Customizable<E> {
    /**
     * Template other classes must implement
     */
    boolean add(Object obj);
    /**
     * Template other classes must implement
     */
    boolean remove(Object obj);
}