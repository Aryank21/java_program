
package JavaApplication_;
import java.util.Scanner;
public class Reverse 
{
    public static void main(String[] args)
    {
        int a,rev=0,rem;
        System.out.println("enter a number");
        Scanner sc= new Scanner (System.in);
        a=sc.nextInt();
               while(a>0)
           {
             rem=a%10;
             rev=(rev*10)+rem;
             a=a/10;
           }
               System.out.println(rev);
    }
    
}
