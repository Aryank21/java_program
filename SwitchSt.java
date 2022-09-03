
package javapkg;

import java.util.Scanner;


public class SwitchSt 
{
    public static void main(String[] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter: ");
        switch(i=sc.nextInt())
        {
            case 1:
                System.out.println("monday");
                break;
                 case 2:
                System.out.println("Tuesday");
                break;
                 case 3:
                System.out.println("wednesday");
                 case 4:
                System.out.println("Thusday");
                break;
                 case 5:
                System.out.println("friday");
                break;
                 case 6:
                System.out.println("Satday");
                break;
                 case 7:
                System.out.println("sunday");
                break;
                 default:
                     System.out.println("invalid number");
        }
        
    }
    
}
