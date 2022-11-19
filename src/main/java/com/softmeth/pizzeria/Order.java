package com.softmeth.pizzeria;

import java.util.ArrayList;

public class Order implements Customizable {
    public static int currIdMax = 0;
    private int orderId;
    public static ArrayList<Pizza> currentOrder = new ArrayList<Pizza>();
    private ArrayList<Pizza> currentOrderPizzas;

    public Order(){
        this.orderId = Order.currIdMax;
        Order.currIdMax += 1;
        this.currentOrderPizzas.addAll(currentOrder);
        Order.currentOrder.clear();
    }

    /**
     * This method adds an object obj to the order
     * @param obj the Object being added
     * @return true if the object is added, otherwise false
     */
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