/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefinder;


/**
 *
 * @author josef
 */
public class app {
    public static void main(String [] args) throws InterruptedException{
        //FileHandler out = new FileHandler();
        (new Thread(new PrimeFinder(3, 214748364, "file1"))).start();
        
    }
}
