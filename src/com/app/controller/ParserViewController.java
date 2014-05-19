package com.app.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.app.model.ClientOrderFile;
import java.io.File;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author darkphoenix
 */
public class ParserViewController extends BorderPane implements Initializable {
    
    private Stage primaryStage;
    private FileChooser fileChooser;
    private List<ClientOrderFile> filesList;
    private List<String> invalidFilesList;
    
    @FXML TableView filesTableView;
    
    
    @FXML
    public void processFiles(){
        
    }
    
    //Load files from 
    @FXML
    public void loadFiles(){
        List<File> files = fileChooser.showOpenMultipleDialog(primaryStage);
        
        filesList = new LinkedList<>();
        invalidFilesList = new LinkedList<>();
        
        files.stream().forEach((file) -> {
            if(file.getPath().endsWith(".txt")){
                filesList.add(new ClientOrderFile(file, file.getName()));
            }else{
                invalidFilesList.add(file.getName());
            }
        });
        
        /*for(File file : files){
            if(file.getPath().endsWith(".txt")){
                filesList.add(new ClientOrderFile(file, file.getName()));
            }else{
                invalidFilesList.add(file.getName());
            }
        }*/
        
        addToTable();
        
        showWrongFiles();
        
    }
    
    public void addToTable(){
        
        filesList.stream().forEach((file) -> {
            filesTableView.getItems().add(file);
        });
        
    }
    
    public void showWrongFiles(){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fileChooser = new FileChooser();
        
        TableColumn fileNameCol = new TableColumn("Descripción");
        TableColumn fileStatusCol = new TableColumn("Estado");
        fileNameCol.setCellValueFactory(new PropertyValueFactory<ClientOrderFile, String>("fileName"));
        fileStatusCol.setCellValueFactory(new PropertyValueFactory<ClientOrderFile, String>("status"));
        
        filesTableView.getColumns().addAll(fileNameCol, fileStatusCol);
        filesTableView.setTableMenuButtonVisible(true);
        
    }    

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
}
