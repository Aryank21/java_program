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
public class LeapYear 
{
    public static void main(String[] args) 
            
    {
        
     System.out.println("Enter year");
      Scanner sc= new Scanner(System.in);
     int a= sc.nextInt();
        if (a%4==0 && a%100==0 && a>0)
        {
            System.out.println("leap year");
        }
        else if (a<0)
        {
            System.out.println("Invalid Number");
        }
        
        else
        {
            System.out.println("Non leap Year");
        }
          
            
        }
}
