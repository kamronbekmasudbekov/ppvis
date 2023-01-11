module com.example.publictransport {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.publictransport to javafx.fxml;
    exports com.example.publictransport;
}