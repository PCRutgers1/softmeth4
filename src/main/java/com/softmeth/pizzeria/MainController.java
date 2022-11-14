package com.softmeth.pizzeria;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {


    @FXML
    void orderChicagoPizza(ActionEvent e){
        System.out.println("Chicago");
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainController.class.getResource("ChicagoView.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 500);
            Stage stage = new Stage();
            stage.setTitle("Order Chicago Style Pizza");
            stage.setScene(scene);
            stage.show();
        }catch(Exception exp){

        }
    }
    @FXML
    void orderNYPizza(ActionEvent e){
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaStoreMain.class.getResource("MainView.fxml"));

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
