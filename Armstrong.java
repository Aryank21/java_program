
package JavaApplication_;

import java.util.Scanner;

public class Armstrong 
{
  public static void main(String[] args)
  {
      int a,n,k,m=0;
  
      System.out.println("enter a number");
      Scanner sc= new Scanner(System.in);
      a=sc.nextInt();
      k=a;
      while(a>0)
      {
          n=a%10;
           m+=(n*n*n);
          a=a/10;
      }
      if(k==m)
      {
      System.out.println("Armstrong number"+m);
      }
      else
      {
          System.out.println("Not an Armstrong number ");
      }
      
  }
}
