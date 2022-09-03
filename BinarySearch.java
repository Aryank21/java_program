
package JavaApplication_;

import java.util.Scanner;


public class BinarySearch {
    public static void main(String[] args) 
    {
        int i=0,j=4,search,flag=0;
        int a[]=new int[5];
        System.out.println("enter 5 array element");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter element want to search");
        search=sc.nextInt();
        while(i<j)
        {
            int mid=(i+j)/2;
           
            if(search==a[mid])
            {
                flag=1;
            }  
            else if(search<a[mid])
            {
                j=mid-1;
            }
            else if(search>a[mid])
            {
                i=mid+1;
            }
            
        }
        if(flag==1)
        {
            System.out.println("element found");
        }
        else
        {
            System.out.println("not found");
        }
        
        
        
    }
    
}
