/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefinder;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josef
 */
public class app {
    public static void main(String [] args) throws InterruptedException{
        //FileHandler out = new FileHandler();
        (new Thread(new PrimeFinder(3, 10000000, "file1"))).start();
        (new Thread(new PrimeFinder(10000001, 20000000, "file2"))).start();
        (new Thread(new PrimeFinder(20000001, 30000000, "file3"))).start();
    }
}
