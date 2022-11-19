package com.softmeth.pizzeria;

/**
 *
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