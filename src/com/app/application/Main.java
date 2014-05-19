/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.application;

import com.app.controller.ParserViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author darkphoenix
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("PARSER");
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/com/app/view/ParserView.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        ParserViewController controller = loader.getController();
        controller.setPrimaryStage(stage);
        
        stage.setResizable(false);
        stage.setHeight(600);
        stage.setWidth(600);
        
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
