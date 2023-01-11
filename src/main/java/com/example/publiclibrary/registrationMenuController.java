package com.example.publictransport;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class registrationMenuController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField surnameField;

    @FXML
    private Button regButton;

    @FXML
    private TextField nameField;

    @FXML
    private TextField patronymicField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField passField;

    @FXML
    private SplitMenuButton daySplitButton;

    @FXML
    private SplitMenuButton monthSplitButton;

    @FXML
    private SplitMenuButton yearSplitButton;

    @FXML
    private CheckBox check;

    @FXML
    public void switchToSuccessRegistration(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("successRegistrationMenu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
