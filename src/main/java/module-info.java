module com.example.paintermod {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.paintermod to javafx.fxml;
    exports com.example.paintermod;
}