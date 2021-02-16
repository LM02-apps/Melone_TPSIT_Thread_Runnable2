/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author informatica
 */
public class Main {
    public static void main (String args[])
    {
        Integer c = 60;
        Runnable cam1=new Incremento(c);
        Runnable cam2=new Decremento(c);
        Thread thr1=new Thread(cam1);
        Thread thr2=new Thread(cam2);
        thr1.start();
        thr2.start();
    }
    
}
