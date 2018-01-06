/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefinder;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author josef
 */
public class FileHandler {
    DataOutputStream out;

    public FileHandler(String fileName) throws FileNotFoundException {
        this.out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(fileName+".csv")));
                System.out.println("File Created");
        
    }
    public void writeToFile(String msg){
        try {
            out.writeUTF(msg + "," + "\n");
        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void closeStream(){
        try {
            out.flush();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
