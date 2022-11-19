package com.softmeth.pizzeria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.AccessibleAction;
import javafx.scene.control.ListView;

public class CurrentOrderController {
    @FXML
    ListView<Pizza> ListOfAllCurrentOrders;
    @FXML
    private void placeOrder(ActionEvent e){
        StoreOrder.allOrders.add(new Order());

    }


    @FXML
    private void clearOrder(ActionEvent e){
        Order.currentOrder.clear();
    }

}
