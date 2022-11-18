package com.softmeth.pizzeria;

import java.util.ArrayList;

public class Order implements Customizable {
    public static int CurrIdMax = 0;
    private int orderId;
    public static ArrayList<Pizza> currentOrder = new ArrayList<Pizza>();

    @Override
    public boolean add(Object obj) {
        try {
            currentOrder.add((Pizza) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean remove(Object obj) {
        try {
            currentOrder.remove((Pizza) obj);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}