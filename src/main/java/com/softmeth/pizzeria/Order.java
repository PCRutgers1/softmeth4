package com.softmeth.pizzeria;

import java.util.ArrayList;

public class Order implements Customizable {
    public static int CurrIdMax = 0;
    private int orderId;
    public static ArrayList<Pizza> currentOrder = new ArrayList<Pizza>();x
    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }
}