package com.softmeth.pizzeria;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.AccessibleAction;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.util.ArrayList;
/**
 * The Controller class part of the MVC design pattern. This will
 * handle all the button on click events and will perform the necessary
 * checks to determine which methods should be called. Upon determination
 * it will call the corresponding model to create/alter that data
 *
 * @author Peter Chen, Jonathon Lopez
 */
public class CurrentOrderController {
    @FXML
    ListView<String> ListOfAllCurrentOrders;

    @FXML
    Text subtotal, salesTax, orderTotal;

    /**
     * Event Handler for Placing the entire order
     */
    @FXML
    private void placeOrder(ActionEvent e){
        StoreOrder.allOrders.add(new Order());

    }

    /**
     * It loads all the Pizza into a list view
     */
    public void initialize(){
        ArrayList<String> myCurrentOrder = new ArrayList<>();
        double totalPrice = 0;
        for(Pizza p : Order.currentOrder){
            myCurrentOrder.add(p.toString());
            totalPrice += p.price();
        }
        double tax = totalPrice * 0.06625;
        subtotal.setText(String.format("%.2f", totalPrice));
        subtotal.setText(String.format("%.2f", tax));
        orderTotal.setText(String.format("%.2f",totalPrice + tax));
        ListOfAllCurrentOrders.setItems(
                FXCollections.observableList(myCurrentOrder));
    }

    /**
     * Event Handler for Clears all items in current order
     */
    @FXML
    private void clearOrder(ActionEvent e){
        Order.currentOrder.clear();
    }

}
