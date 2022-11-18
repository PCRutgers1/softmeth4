package com.softmeth.pizzeria;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    @FXML
    private Text TypeOfCrustChicago, PriceOfPizzaChicago;

    RadioButton pizzaSize;

    private double price;
    Set<Topping> toppings = new HashSet<Topping>();

    @FXML
    private void updatePricing(ActionEvent e){
        String pizzaType = ChoosePizzaChicago.getValue();
        if(pizzaType == null)
            pizzaType = "Build Your Own Pizza";
        setPizzaPrice(pizzaType,((RadioButton) ChicagoPizzaSize.getSelectedToggle()).getText());
    }


    @FXML
    private void AddToppingToPizza(ActionEvent e) {
        if (MyToppingsListChicago.getItems().size() == 6) {
            ChicagoAddButton.setDisable(true);
        } else {
            ChicagoAddButton.setDisable(false);
        }
        String topping =
                ToppingsListChicago.getSelectionModel().getSelectedItem();
        if (!toppings.contains(Topping.findTopping(topping))) {
            MyToppingsListChicago.getItems().add(topping);
        }


        toppings.add(Topping.findTopping(topping));
        setPizzaPrice("Build Your Own Pizza", ((RadioButton) ChicagoPizzaSize.getSelectedToggle()).getText());
    }

    @FXML
    private void RemoveToppingFromPizza(ActionEvent e) {
        ChicagoAddButton.setDisable(false);
        String topping =
                MyToppingsListChicago.getSelectionModel().getSelectedItem();
        if (toppings.contains(Topping.findTopping(topping))) {
            MyToppingsListChicago.getItems().remove(topping);
        }
        toppings.remove(Topping.findTopping(topping));
    }



    @FXML
    /**
     * Event Handler for the Add to order button
     */ private void AddPizzaToOrder() {
        pizzaSize = (RadioButton) ChicagoPizzaSize.getSelectedToggle();
        String sizeOfPizza = pizzaSize.getText();
        String selectedPizzaType = ChoosePizzaChicago.getValue();
        PizzaFactory myPizza = new ChicagoPizza();
        Pizza newPizza;
        if (selectedPizzaType == null || selectedPizzaType.equals(
                "Build Your Own Pizza")) {
            newPizza = myPizza.createBuildYourOwn();
            newPizza.setToppings(toppings);
        } else if (selectedPizzaType.equals("Deluxe"))
            newPizza = myPizza.createDeluxe();
        else if (selectedPizzaType.equals("BBQ Chicken"))
            newPizza = myPizza.createBBQChicken();
        else newPizza = myPizza.createMeatzza();

        Size size = Size.findSize(sizeOfPizza);
        newPizza.setSize(size);
        newPizza.setPrice(price);
        Order.currentOrder.add(newPizza);
    }

    private void setButtons(Boolean state) {
        ChicagoAddButton.setDisable(state);
        ChicagoRemoveButton.setDisable(state);
    }

    private void setPizzaPrice(String pizzaType, String size) {
        if (pizzaType.equals("Build Your Own Pizza")) {
            if (size.equals("Large")) price = 12.99;
            else if (size.equals("Medium")) price = 10.99;
            else price = 8.99;
            if(toppings != null && toppings.size()>0){
                price = price + toppings.size() * 1.59;
            }
        } else if (pizzaType.equals("Deluxe")) {
            if (size.equals("Large")) price = 18.99;
            else if (size.equals("Medium")) price = 16.99;
            else price = 14.99;
        } else if (pizzaType.equals("BBQ Chicken")) {
            if (size.equals("Large")) price = 17.99;
            else if (size.equals("Medium")) price = 15.99;
            else price = 13.99;
        } else if (pizzaType.equals("Meatzza")) {
            if (size.equals("Large")) price = 19.99;
            else if (size.equals("Medium")) price = 17.99;
            else price = 15.99;
        }
        PriceOfPizzaChicago.setText(Double.toString(price));

    }

    private void setToppings(String pizzaType) {
        toppings = new HashSet<>();
        ArrayList<String> toppingsAsString = new ArrayList<String>();
        if (pizzaType.equals("Deluxe")) {
            for (String t : Topping.deluxeToppings) {
                toppings.add(Topping.findTopping(t));
                toppingsAsString.add(t);
            }
        } else if (pizzaType.equals("Meatzza")) {
            for (String t : Topping.meatzzaToppings) {
                toppings.add(Topping.findTopping(t));
                toppingsAsString.add(t);
            }
        } else if (pizzaType.equals("BBQ Chicken")) {
            for (String t : Topping.bbqToppings) {
                toppings.add(Topping.findTopping(t));
                toppingsAsString.add(t);
            }
        }
        MyToppingsListChicago.setItems(
                FXCollections.observableList(toppingsAsString));
    }

    @FXML
    void ChangePizzaSelection(ActionEvent e) {
        String pizzaType = ChoosePizzaChicago.getValue();
        setToppings(pizzaType);
        if (pizzaType.equals("Build Your Own Pizza")) {
            setButtons(false);
            TypeOfCrustChicago.setText("Pan");
            setPizzaPrice(pizzaType,
                    ((RadioButton) ChicagoPizzaSize.getSelectedToggle()).getText());
        } else if (pizzaType.equals("Deluxe")) {
            setButtons(true);
            TypeOfCrustChicago.setText("Deep Dish");
            setPizzaPrice(pizzaType,
                    ((RadioButton) ChicagoPizzaSize.getSelectedToggle()).getText());
        } else if (pizzaType.equals("BBQ Chicken")) {
            setButtons(true);
            TypeOfCrustChicago.setText("Pan");
            setPizzaPrice(pizzaType,
                    ((RadioButton) ChicagoPizzaSize.getSelectedToggle()).getText());
        } else if (pizzaType.equals("Meatzza")) {
            setButtons(true);
            TypeOfCrustChicago.setText("Stuffed");
            setPizzaPrice(pizzaType,
                    ((RadioButton) ChicagoPizzaSize.getSelectedToggle()).getText());
        }
    }
}