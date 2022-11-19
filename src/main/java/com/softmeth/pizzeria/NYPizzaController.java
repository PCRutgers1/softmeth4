package com.softmeth.pizzeria;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NYPizzaController {
    @FXML
    private ToggleGroup NYPizzaSize;

    @FXML
    private ListView<String> ToppingsListNY, MyToppingsListNY;
    @FXML
    private ComboBox<String> ChoosePizzaNY;

    @FXML
    private Button NYAddButton, NYRemoveButton;

    @FXML
    private Text TypeOfCrustNY, PriceOfPizzaNY;

    @FXML
    private TextArea NYOutput;

    RadioButton pizzaSize;

    private double price;
    Set<Topping> toppings = new HashSet<Topping>();

    @FXML
    private void updatePricing(ActionEvent e){
        String pizzaType = ChoosePizzaNY.getValue();
        if(pizzaType == null)
            pizzaType = "Build Your Own Pizza";
        setPizzaPrice(pizzaType,((RadioButton) NYPizzaSize.getSelectedToggle()).getText());
    }


    @FXML
    private void AddToppingToPizza(ActionEvent e) {
        if (MyToppingsListNY.getItems().size() == 6) {
            NYAddButton.setDisable(true);
        } else {
            NYAddButton.setDisable(false);
        }
        String topping =
                ToppingsListNY.getSelectionModel().getSelectedItem();
        if (!toppings.contains(Topping.findTopping(topping))) {
            MyToppingsListNY.getItems().add(topping);
        }


        toppings.add(Topping.findTopping(topping));
        setPizzaPrice("Build Your Own Pizza", ((RadioButton) NYPizzaSize.getSelectedToggle()).getText());
    }

    @FXML
    private void RemoveToppingFromPizza(ActionEvent e) {
        NYAddButton.setDisable(false);
        String topping =
                MyToppingsListNY.getSelectionModel().getSelectedItem();
        if (toppings.contains(Topping.findTopping(topping))) {
            MyToppingsListNY.getItems().remove(topping);
        }
        toppings.remove(Topping.findTopping(topping));
        setPizzaPrice("Build Your Own Pizza", ((RadioButton) NYPizzaSize.getSelectedToggle()).getText());
    }



    @FXML
    /**
     * Event Handler for the Add to order button
     */ private void AddPizzaToOrder() {
        pizzaSize = (RadioButton) NYPizzaSize.getSelectedToggle();
        String sizeOfPizza = pizzaSize.getText();
        String selectedPizzaType = ChoosePizzaNY.getValue();
        PizzaFactory myPizza = new NYPizza();
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

        NYOutput.setText(NYOutput.getText() + "Successfully added Pizza To Order \n");
        Order.currentOrder.add(newPizza);
    }

    private void setButtons(Boolean state) {
        NYAddButton.setDisable(state);
        NYRemoveButton.setDisable(state);
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
        PriceOfPizzaNY.setText(String.format("%.2f", price));

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
        MyToppingsListNY.setItems(
                FXCollections.observableList(toppingsAsString));
    }

    @FXML
    void ChangePizzaSelection(ActionEvent e) {
        String pizzaType = ChoosePizzaNY.getValue();
        setToppings(pizzaType);
        if (pizzaType.equals("Build Your Own Pizza")) {
            setButtons(false);
            TypeOfCrustNY.setText("Hand Tossed");
            setPizzaPrice(pizzaType,
                    ((RadioButton) NYPizzaSize.getSelectedToggle()).getText());
        } else if (pizzaType.equals("Deluxe")) {
            setButtons(true);
            TypeOfCrustNY.setText("Brooklyn");
            setPizzaPrice(pizzaType,
                    ((RadioButton) NYPizzaSize.getSelectedToggle()).getText());
        } else if (pizzaType.equals("BBQ Chicken")) {
            setButtons(true);
            TypeOfCrustNY.setText("Thin");
            setPizzaPrice(pizzaType,
                    ((RadioButton) NYPizzaSize.getSelectedToggle()).getText());
        } else if (pizzaType.equals("Meatzza")) {
            setButtons(true);
            TypeOfCrustNY.setText("Hand Tossed");
            setPizzaPrice(pizzaType,
                    ((RadioButton) NYPizzaSize.getSelectedToggle()).getText());
        }
    }
}