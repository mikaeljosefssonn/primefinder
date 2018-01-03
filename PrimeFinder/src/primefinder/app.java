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
        
        (new Thread(new PrimeFinder(5000, 10000000))).start();
        (new Thread(new PrimeFinder(3, 500000))).start();
    }
}
