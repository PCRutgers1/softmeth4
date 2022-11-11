module com.softmeth.pizzeria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.softmeth.pizzeria to javafx.fxml;
    exports com.softmeth.pizzeria;
}