/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darkphoenix
 */
public class CSVParser {
    
    private BufferedReader reader = null;
    
    public void parseFile(File file){
        try {
            String currentLine;
            
            reader = new BufferedReader(new FileReader(file));
            
            while((currentLine = reader.readLine()) != null){
                analizeCurrentLine(currentLine);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CSVParser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CSVParser.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try{
                if(reader != null){
                    reader.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
    
    public void analizeCurrentLine(String currentLine){
        
    }
    
}
