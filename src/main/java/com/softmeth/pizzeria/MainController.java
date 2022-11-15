package com.softmeth.pizzeria;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.util.Callback;

public class MainController {
    String[] orderOptions = {"Build Your Own Pizza", "Deluxe", "BBQ Chicken", "Meatzza"};

    @FXML
    void orderChicagoPizza(ActionEvent e){
        try {
            ComboBox combo_box =
                    new ComboBox(FXCollections
                            .observableArrayList(orderOptions));
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("ChicagoView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setTitle("Order Chicago Style Pizza");

            stage.setScene(scene);
            stage.show();
        }catch(Exception ignored){
        }
    }
    @FXML
    void orderNYPizza(ActionEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("NYView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setTitle("Order New York Style Pizza");
            stage.setScene(scene);
            stage.show();
        }catch(Exception ignored){
        }
    }
    @FXML
    void viewCurrentOrder(ActionEvent e){
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaStoreMain.class.getResource("MainView.fxml"));

    }
    @FXML
    void viewStoreOrders(ActionEvent e){
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaStoreMain.class.getResource("MainView.fxml"));

    }
}
