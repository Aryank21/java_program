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
public class FrequencyOfArray 
{
    public static void main(String[] args)
    {
        Farray ff= new Farray();
        ff.getdata();
        ff.count();
        
    }
}
class Farray
        {
    int a[]=new int[5];
    int key;
   void getdata()
    {
        int i;
        System.out.println("enter element of array");
        Scanner sc= new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
          System.out.println("enter number for find frequecy of number");
          key=sc.nextInt();
    }
    void count()
    {
        int i,count=0;
        for(i=0;i<5;i++)
        {
            if(a[i]==key)
               count++; 
        }
        System.out.println("Frequecy is "+count);
        
    }
}
