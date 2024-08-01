package com.cse.oop.courseprojects._2110657_2010677_2221555_1722112_group08_apbn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class fxmlDashBoardSecurityOfficerPushpiController {


    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private AnchorPane welcomeAnchorPane;

    @FXML
    void addLostItemButtonOnAction(ActionEvent event) {



    }

    @FXML
    void authorizationButtonOnAction(ActionEvent event) {
        loadPage("fxmlSecurityOfficerAuthorixationPageScenePushpita");
    }

    @FXML
    void contactInformationButtonOnAction(ActionEvent event) {

    }

    @FXML
    void dutiesListButtonOnAction(ActionEvent event) {

    }

    @FXML
    void incidentReportWrithingButtonOnAction(ActionEvent event) {

    }

    @FXML
    void passengerHistoryButtonOnAction(ActionEvent event) {

    }

    @FXML
    void securityEquipmentCheckButtonOnAction(ActionEvent event) {

    }
    private void loadPage(String page){
        Parent root = null;
        try{
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        }catch(IOException ex){
            Logger.getLogger(fxmlDashBoardSecurityOfficerPushpiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainBorderPane.setCenter(root);
    }

}
