/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication_;
import java.util.Scanner;
/**
 *
 * @author Aryan
 */
public class Main
{
    public static void main(String[] args) 
    {
       
        Scanner sc= new Scanner (System.in);
        
        int m=sc.nextInt();
        pattern1(m);
         pattern2(m);
         pattern3(m);
         pattern4(m);
           pattern5(m);
    }
    

    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
             for(int col=1;col<=row;col++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
        System.out.println();
    } 
       
    static void pattern2(int n)
    {
        for(int row=1;row<=n;row++)
        {
             for(int col=1;col<=n;col++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
        System.out.println();
    } 
    static void pattern3(int n)
    {
        for(int row=0;row<=n;row++)
        {
             for(int col=1;col<=n-row;col++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
         
    }
   
     static void pattern4(int n)
    {
        for(int row=1;row<=n;row++)
        {
             for(int col=1;col<=row;col++)
             {
                 System.out.print(col);
             }
             System.out.println();
        }
        System.out.println();
    } 
     static void pattern5(int n)
    {
        for(int row=0;row<=2*n;row++)
        {
            int TotalCol= row>n ?2*n-row: row;
             for(int col=0;col<TotalCol;col++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
        System.out.println();
    } 
    
    
    
    
    
    
}



