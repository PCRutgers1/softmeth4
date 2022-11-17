package com.softmeth.pizzeria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChicagoPizzaController {
    @FXML
    private ToggleGroup ChicagoPizzaSize;

    @FXML
    private ListView<String> ToppingsListChicago, MyToppingsListChicago;
    @FXML
    private ComboBox<String> ChoosePizzaChicago;

    @FXML
    private Button ChicagoAddButton, ChicagoRemoveButton;

    RadioButton pizzaSize;

    Set<String> toppings = new HashSet<String>();


    @FXML
    private void AddToppingToPizza(ActionEvent e){
        if(MyToppingsListChicago.getItems().size() == 6){
            ChicagoAddButton.setDisable(true);
        }else{
            ChicagoAddButton.setDisable(false);
        }
        String topping =ToppingsListChicago.getSelectionModel().getSelectedItem();
        if(!toppings.contains(topping)){
            MyToppingsListChicago.getItems().add(topping);
        }
        toppings.add(topping);
    }
    @FXML
    private void RemoveToppingFromPizza(ActionEvent e){
        ChicagoAddButton.setDisable(false);
        String topping =MyToppingsListChicago.getSelectionModel().getSelectedItem();
        if(toppings.contains(topping)){
            MyToppingsListChicago.getItems().remove(topping);
        }
        toppings.remove(topping);
    }
    @FXML
    /**
     * Event Handler for the Add to order button
     */ private void AddPizzaToOrder() {
        pizzaSize = (RadioButton) ChicagoPizzaSize.getSelectedToggle();
        String selectedPizzaType = ChoosePizzaChicago.getValue();
    }

    private void setButtons(Boolean state) {
        ChicagoAddButton.setDisable(state);
        ChicagoRemoveButton.setDisable(state);
    }

    @FXML
    void ChangePizzaSelection(ActionEvent e) {
        String pizzaType = ChoosePizzaChicago.getValue();
        if (pizzaType.equals("Build your own pizza")) {
            setButtons(false);
        } else if (pizzaType.equals("Deluxe")) {
            setButtons(true);
        } else if (pizzaType.equals("BBQ Chicken")) {
            setButtons(true);
        } else if (pizzaType.equals("Meatzza")) {
            setButtons(true);
        }
    }
}