package com.cse.oop.courseprojects._2110657_2010677_2221555_1722112_group08_apbn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplicationClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplicationClass.class.getResource("fxmlDashBoardSecurityOfficerPushpita.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        //stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}