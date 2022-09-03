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
public class StringPalind 
{
    public static void main(String args[])
    {
      
        String s= new String();
        Scanner sc= new Scanner (System.in);
        System.out.println("enter any string");
        s=sc.nextLine();
         int i,j,flag;
  i=0;
  j=s.length()-1;
  flag=0;
      while(i<j&&flag==0)
      {
        if(s.charAt(i)!=s.charAt(j))
        {
            flag=1;
        }
      i++;
      j--;
      }
       if(flag==0)
            System.out.println("palindrom");
       else
            System.out.println("not a plindrom string");
    }
}
