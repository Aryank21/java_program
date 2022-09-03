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
public class Table
{
    public static void main(String args[])
    {
        
        int i,n,m;
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        for (i=1;i<=10;i++)
        {
            m=n*i;
            System.out.println(m);
           
        }
    }
}
  