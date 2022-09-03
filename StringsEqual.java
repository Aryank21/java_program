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
public class StringsEqual 
{
    public static void main(String args[])
    {
        String s1= new String();
         String s2= new String();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first string");
        s1=sc.nextLine();
         System.out.println("enter second string");
        s2=sc.nextLine();
        System.out.println("not case sensetive check");
        if(s1.equalsIgnoreCase(s2))
            System.out.println("strings are same");
        else
            System.out.println("strings are diffrent");
        System.out.println(" case sensetive check");
        if(s1.equals(s2))
            System.out.println("strings are same");
        else
            System.out.println("strings are diffrent");
        
    }
    
}
