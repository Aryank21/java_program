
package javapkg;

import java.util.Scanner;

public class fact 
{
    public static void main(String[] args)
    {
        System.out.println("factorial of: ");
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int fact=1;
        for(int i=1;i<=m;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
