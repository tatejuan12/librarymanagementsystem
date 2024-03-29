package com.juanitogalaxy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.juanitogalaxy.utils.Helper;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(Helper.loadFXML("main"), 840, 680);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(Helper.loadFXML(fxml));
    }

    public static void main(String[] args) {
        launch();
    }

}