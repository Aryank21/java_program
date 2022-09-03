/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication_;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aryan
 */
public class ThreadMethods 
{
    public static void main(String[] args) 
    {
        A Thread1=new A();
         B Thread2=new B();
          C Thread3=new C();
    }
}
class A extends Thread
{
  
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            if(i==1)
               Thread.yield();
            System.out.println("i= "+i);
        }
    }
  
            
  }
class B extends Thread
{
    public void run()
    {
        for(int j=0;j<=5;j++)
        {
            if(j==3)
                stop();
            System.out.println("j= "+j);
        }
    }
  
            
  }
class C extends Thread
{
    public void run()
    {
        for(int k=0;k<=5;k++)
        {
            if(k==1)
            {
                try {
                    sleep(2000);
                } 
                catch (InterruptedException ex) {
                    Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
            System.out.println("k= "+k);
        }
    }
  
            
  }


