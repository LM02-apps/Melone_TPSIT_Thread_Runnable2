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
public class Decremento implements Runnable{
     Integer c;
    public Decremento(Integer c)
    {
        this.c=c;
        
    }
    public void run()
    {
        do
        {
            
            System.out.println((c--)+"");
        }
          while(c>0);  
    }
    
    
}
