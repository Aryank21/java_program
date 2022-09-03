
package JavaApplication_;

import java.util.Scanner;

public class Pattern333 {
    public static void main(String[] args) 
    {
        System.out.println("enter n: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
       for(int i=n;i>0;i--)
       {
           temp=n;
           while(temp>0)
           {
          
                for(int j=0;j<i;j++)
                {
                   System.out.print(temp+" ");
                 }
                temp--;
           }        
              System.out.println(" ");
             
       }
    }
    
}
