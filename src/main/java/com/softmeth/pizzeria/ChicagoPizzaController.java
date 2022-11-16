package com.softmeth.pizzeria;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ChicagoPizzaController {
    @FXML
    private ToggleGroup ChicagoPizzaSize;

    RadioButton pizzaSize;
    @FXML
    /**
     * Event Handler for the Add to order button
     */
    private void AddPizzaToOrder(){
        pizzaSize = (RadioButton) ChicagoPizzaSize.getSelectedToggle();

    }

}