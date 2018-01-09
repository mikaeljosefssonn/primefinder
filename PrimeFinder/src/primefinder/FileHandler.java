/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefinder;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author josef
 */
public class FileHandler {
    //DataOutputStream out;
    FileWriter out;
    public FileHandler(String fileName) throws FileNotFoundException, IOException {
       /* this.out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(fileName+".csv")));
                System.out.println("File Created");*/
        out = new FileWriter(fileName+".csv");
    }
    public void writeToFile(int value) throws IOException{
        out.write(Integer.toString(value) + ", \n");
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
