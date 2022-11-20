package com.softmeth.pizzeria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Launch's the RU Pizza application
 *
 * @author Peter Chen, Jonathon Lopez
 */
public class PizzaStoreMain extends Application {

    /**
     * Shows the initial landing screen and sets the title for the screen
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaStoreMain.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setTitle("RU Pizza");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();   
    }

    /**
     * Launcher of the program
     */
    public static void main(String[] args){
        launch();
    }

}
