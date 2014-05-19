/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.model;

import java.io.File;


/**
 *
 * @author darkphoenix
 */
public class ClientOrderFile {
    
    private File file;
    private boolean status;
    private String fileName;

    public ClientOrderFile(File file, String fileName) {
        this.file = file;
        this.fileName = fileName;
        this.status = false;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
}
