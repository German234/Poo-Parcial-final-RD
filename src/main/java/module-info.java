module com.parcialfinal.regalodigital {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.parcialfinal.regalodigital to javafx.fxml;
    exports com.parcialfinal.regalodigital;
}