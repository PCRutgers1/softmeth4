package com.softmeth.pizzeria;

public interface Customizable<E> {
    boolean add(Object obj);
    boolean remove(Object obj);
}