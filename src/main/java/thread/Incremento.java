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
public class Incremento implements Runnable{
    Integer c;
    public Incremento(Integer c)
    {
        this.c=c;
        
    }
    public void run()
    {
        do
        {
            
            System.out.println((c++)+"");
        }
        while (c<100);  
    }
    
    
}
