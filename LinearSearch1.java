
package JavaApplication_;

import java.util.Scanner;

public class LinearSearch1 
{
    public static void main(String[] args)
    {
        int n,search,i;
        System.out.println("enter array size");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        for(i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("element of Array are");
         for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
        
         System.out.println("enter element which want to find");
         search=sc.nextInt();
         for(i=0;i<n;i++)
         {
           if(array[i]==search)
           {
            break;
           }
         }
         if(i<n)
            {
            
             System.out.println("array element found at index"+(i+1));
            }
         else
         {
           System.out.println("number not found");
         }
         
         
    }
    
}
