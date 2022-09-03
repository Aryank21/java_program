
package JavaApplication_;
import java.util.Scanner;

public class TwoDArrayOpration
{
    public static void main(String[] args) 
    {
        
    
    int a[][]= new int[3][3];
    int b[][]= new int[3][3];
    int c[][]=new int[3][3];
    Scanner sc= new Scanner(System.in);
    int i,j;
      for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.println("enter element of matrix 1:");
            a[i][j]=sc.nextInt();
        }
    }
        for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.println("enter element of matrix 2:");
            b[i][j]=sc.nextInt();
        }
    }
        System.out.println("first matrix");
       for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            
            System.out.print(a[i][j]+" ");
           
        }
        System.out.println("  ");
    }
        System.out.println("second matrix");
     
       
       for(i=0;i<3;i++)
    {
        for(j=0;j<3;j++)
        {
            System.out.print(b[i][j]+" ");
           
        }
        System.out.println("  ");
    }
        System.out.println("Addition of both matrix");
        
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println("  ");
                    
        }
        
        
       
    
    
}
}
       
       
