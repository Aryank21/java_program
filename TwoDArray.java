
package JavaApplication_;

import java.util.Scanner;

public class TwoDArray 
{
    public static void main(String[] args) {
        
  
    Scanner sc= new Scanner(System.in);
    int a[][]=new int[3][3];
    int i,j;
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.println("enter array element");
            a[i][j]=sc.nextInt();
        }
    }
    for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.print(a[i][j]+" ");
        }
    
        System.out.println("");
    }
    
    }   
    
}
