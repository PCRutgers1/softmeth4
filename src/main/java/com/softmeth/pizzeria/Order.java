package com.softmeth.pizzeria;

import java.util.ArrayList;
/**
 *
 *
 * @author Peter Chen, Jonathon Lopez
 */
public class Order implements Customizable {
    public static int currIdMax = 0;
    private int orderId;
    private double orderTotal;
    public static ArrayList<Pizza> currentOrder = new ArrayList<Pizza>();
    private ArrayList<Pizza> currentOrderPizzas;

    /**
     * Creates a new Current Order and gives it an ID
     *
     */
    public Order(double orderTotal){
        this.orderTotal = orderTotal;
        this.orderId = Order.currIdMax;
        this.currentOrderPizzas = new ArrayList<>();
        Order.currIdMax += 1;
        this.currentOrderPizzas.addAll(currentOrder);
    }

    /**
     * getter method for the orderID
     * @return this order's order id
     */
    public int getOrderId(){
        return this.orderId;
    }
    /**
     * getter method for the ordertotal
     * @return this order's order total amount
     */
    public double getOrderTotal(){
        return this.orderTotal;
    }
    /**
     * getter method for hte orderID
     * @return this order's order id
     */
    public ArrayList<Pizza> getCurrentOrderPizzas(){
        return this.currentOrderPizzas;
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

    /**
     * This method adds an object obj to the order
     * @param obj the Object being added
     * @return true if the object is removed, otherwise false
     */
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