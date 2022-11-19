package com.softmeth.pizzeria;

import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class StoreOrder implements Customizable {

    public static ArrayList<Order> allOrders = new ArrayList<>();

    @Override
    public boolean add(Object obj) {
        return false;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }
}