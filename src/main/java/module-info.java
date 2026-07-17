module com.example.simulationofmangogardenestate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulationofmangogardenestate to javafx.fxml;
    exports com.example.simulationofmangogardenestate;
}