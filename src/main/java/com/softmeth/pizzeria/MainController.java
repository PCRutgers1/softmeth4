package com.softmeth.pizzeria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {
    String[] orderOptions = {"Build Your Own Pizza", "Deluxe", "BBQ Chicken", "Meatzza"};

    @FXML
    void orderChicagoPizza(ActionEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("ChicagoView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setTitle("Order Chicago Style Pizza");
            stage.setResizable(false);
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
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("CurrentOrderView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setTitle("View Current Order");
            stage.setScene(scene);
            stage.show();
        }catch(Exception ignored){
        }

    }
    @FXML
    void viewStoreOrders(ActionEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("StoreOrderView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setTitle("View ALl Store Orders");
            stage.setScene(scene);
            stage.show();
        }catch(Exception ignored){
        }
    }
}
