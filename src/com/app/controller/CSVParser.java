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
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author darkphoenix
 */
public class CSVParser {
    
    private BufferedReader reader = null;
    
    
    public void fillMap(){
        
    Map<String, String[]> productos=  new HashMap<>();
    productos.put("7503005898571",new String[]{"AR03","[AR03]Asadero Ranchero SJ"});
    productos.put("7503005898007",new String[]{"AS17","[AS17]Asadero SJ"});
    productos.put("7503005898014",new String[]{"AS18","[AS18]Asadero light SJ"});
    productos.put("7503005898557",new String[]{"CV07","[CV07]Cavero SJ"});
    productos.put("7503005898588",new String[]{"FC05","[FC05]Fundido Champiñones SJ"});
    productos.put("7503005898595",new String[]{"FR03","[FR03]Fundido Rajas SJ"});
    productos.put("7503005898601",new String[]{"MG02","[MG02]Manchego SJ"});
    productos.put("7503005898526",new String[]{"MZ17","[MZ17]Mozzarella con Epazote SJ"});
    productos.put("7503005898199",new String[]{"MZ18","[MZ18]Mozzarella Pimiento SJ"});
    productos.put("7503005898618",new String[]{"MZ19","[MZ19]Mozzarella Reducido en Grasa SJ"});
    productos.put("7503005898038",new String[]{"OX23","[OX23]Oaxaca SJ"});
    productos.put("7503005898465",new String[]{"PA08","[AS17]Panela Asada SJ"});
    productos.put("7503005898427",new String[]{"PA09","[PA09]Panela Asada Orégano SJ"});
    productos.put("7503005898410",new String[]{"RE04","[RE04]Requesón SJ"});
    productos.put("7503005898168",new String[]{"RJ09","[RJ09]Rollos de Jamón Serrano SJ"});
    }
    
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
