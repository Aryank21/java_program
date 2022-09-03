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
public class ArrayExample2
{
    public static void main(String[] args) 
    {
    
       int sum=0; 
       System.out.println("Enter size of Array");
 Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int array[]= new int[n]; 
    
    for(int i=0;i<n;i++)
    {
        System.out.println("enter element of array");
      array[i]=sc.nextInt();
       sum+=array[i];
    }
        System.out.println("sum of array");
        System.out.println(sum);
    }
    
}

