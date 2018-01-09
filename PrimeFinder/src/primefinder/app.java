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
    static long startTime;
    
    public static void main(String [] args) throws InterruptedException{
        
        startTime = System.currentTimeMillis();
        //FileHandler out = new FileHandler();
        int n = 8;
        Thread thread1 = new Thread(new PrimeFinder(3, 40000000/n, "file1"));
        Thread thread2 = new Thread(new PrimeFinder((40000000/n)+1, (40000000/n)*2, "file2"));
        Thread thread3 = new Thread(new PrimeFinder((40000000/n)*2+1, (40000000/n)*3, "file3"));
        Thread thread4 = new Thread(new PrimeFinder((40000000/n)*3+1, (40000000/n)*4, "file4"));
        Thread thread5 = new Thread(new PrimeFinder((40000000/n)*4+1, (40000000/n)*5, "file5"));
        Thread thread6 = new Thread(new PrimeFinder((40000000/n)*5+1, (40000000/n)*6, "file6"));
        Thread thread7 = new Thread(new PrimeFinder((40000000/n)*6+1, (40000000/n)*7, "file7"));
        Thread thread8 = new Thread(new PrimeFinder((40000000/n)*7+1, (40000000/n)*8, "file8"));
        thread2.start();
        thread1.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        boolean x = true;
        while(x){
            if (!thread8.isAlive() && !thread7.isAlive() && !thread6.isAlive() && !thread5.isAlive() && !thread4.isAlive() && !thread3.isAlive()&& !thread2.isAlive() && !thread1.isAlive()){
                System.out.println(System.currentTimeMillis()-startTime + "ms runtime");
                x = false;
            }
        }
    }
}
