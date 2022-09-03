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
public class AirthematicOpration 
{
    public static void main(String[] args)
    {
        System.out.println("Enter two number: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter your choice-> 1 for Addition,-> 2 for Subtract,-> 3 for Divide,-> 4 for Multiply ");
        int choice= sc.nextInt();
        switch(choice)
        {
            case 1:
                int sum=a+b;
            System.out.println(sum);
            break;
             case 2:
                 int sub=a-b;
            System.out.println(sub);
            break;
             
             case 3:
                 int div=a/b;
            System.out.println(div);
            break;
             case 4:
                 int multi=a*b;
            System.out.println(multi);
            break;
             
             default:
                 System.out.println("Invalid Number");
            
        }
                    
    }
}
