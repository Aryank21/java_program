/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication_;

/**
 *
 * @author Aryan
 */
class ThreadTest_ {
    public static void main(String[]args)
    {
       new A().start();
       new B().start();
       new C().start();
    }
    
}
class A extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
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
            System.out.println("k= "+k);
            
        }
    }
}


