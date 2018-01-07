/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primefinder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PrimeFinder implements Runnable{
    private ArrayList<Integer> primes = new ArrayList<>();
    private int startNumber;
    private int endNumber;
    FileHandler fileHandler;
    
    PrimeFinder(int startNumber, int endNumber, String fileName) throws InterruptedException {
        System.out.println("Thread: " + startNumber);
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        findPrimesBetween(startNumber, endNumber, fileName);
    }
    
    private void findPrimesBetween(int startNumber, int endNumber, String fileName){
        try {
            fileHandler = new FileHandler(fileName);
        } catch (IOException ex) {
            Logger.getLogger(PrimeFinder.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i = startNumber; i < endNumber; i++){
            loadingBar(i);
            if(isPrime(i)){
                try {
                    fileHandler.writeToFile(i);
                    //primes.add(i);
                } catch (IOException ex) {
                    Logger.getLogger(PrimeFinder.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        fileHandler.closeStream();
    }
    
    public void printPrimes(){
        for(int i = 0; i < primes.size(); i++){
            if(i%5==0){
                System.out.println("");
            }
            System.out.print(primes.get(i) + ", ");
        }
        System.out.println("#"+"\n" + primes.size() +" primes were found");
    }
    
    public void loadingBar(int nr){
        if(nr%(Math.round((endNumber-startNumber)/10)) == 0){
            System.out.print("=");
        }
    }
    public boolean isPrime(int nr){
        int stop;
        if(nr<10){
            stop = nr;
        }
        else{
            stop = (int)Math.sqrt(nr);
        }
        for(int i = 2; i < stop; i++){
            if(nr%i==0){
                return false;
            }
        }
        return true;
    }

    @Override
    public void run() {
        //findPrimesBetween(startNumber, endNumber);
        //printPrimes();
    }
}
