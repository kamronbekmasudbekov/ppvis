package com.example.publictransport;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Account extends UserCardFile{
    private Stage stage;
    private Scene scene;
    private Parent root;
    private String fio;
    private Date dateOfBirth;
    private Date dateOfRegistration;
    private String placeOfResidence;
    private Map<printedEdition, Date> takenBooks = new HashMap<printedEdition, Date>();





    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    @FXML
    public void switchToCatalogFromReaderCard(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("catalogMenu.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void deleteTransportList () {

    }
    public void checkArrears() {

    }
   public void getTransportOfArrears() {

   }
    public void addToTakenList() {

    }
}
