module com.example.exc_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exc_java to javafx.fxml;
    exports com.example.exc_java;
}