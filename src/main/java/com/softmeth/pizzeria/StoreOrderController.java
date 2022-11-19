package com.softmeth.pizzeria;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * The Controller class part of the MVC design pattern. This will
 * handle all the button on click events and will perform the necessary
 * checks to determine which methods should be called. Upon determination,
 * it will call the corresponding model to create/alter that data
 *
 * @author Peter Chen, Jonathon Lopez
 */
public class StoreOrderController {
    @FXML
    ComboBox<Integer> OrderNumber;
    @FXML
    ListView<String> StoreOrderList;

    public void initialize() {
        ArrayList<Integer> AllOrderNums = new ArrayList<>();

        for (Order o : StoreOrder.allOrders) {
            AllOrderNums.add(o.getOrderId());
        }

        OrderNumber.setItems(FXCollections.observableList(AllOrderNums));
    }

    @FXML
    public void OrderNumChange(ActionEvent e){
        ArrayList<String> newOrderList = new ArrayList<>();
        int newOrderNumSelected = OrderNumber.getValue();

        Order selectedOrder = null;
        for(Order o: StoreOrder.allOrders){
            if (o.getOrderId() == newOrderNumSelected){
                selectedOrder = o;
                break;
            }
        }

        for(Pizza p: selectedOrder.getCurrentOrderPizzas()){
            newOrderList.add(p.toString());
        }
        StoreOrderList.setItems(FXCollections.observableList(newOrderList));

    }

}