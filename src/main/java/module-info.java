module com.mycompany.reto10 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.reto10 to javafx.fxml;
    exports com.mycompany.reto10;
}
