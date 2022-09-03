/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapkg;

import java.util.Scanner;

/**
 *
 * @author Aryan
 */
 class IfElse 
{
   
     public static void main(String[] args)
     {
         int a=5,n;
         System.out.println("guess the number of a");
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         if(a==n)
         {
             System.out.println("true");
         }
         else
         {
             System.out.println("false");
         }
     }
}
