
package JavaApplication_;

import java.util.Scanner;

/**
 *
 * @author Aryan
 */
public class PrintShortName 
        
{
    public static void main(String[] args) 
    {
        String s= new String();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name: ");
        s=sc.nextLine();
        int i=s.length()-1,j=0;
        char c,d;
        while(s.charAt(i)!=' ')
        {
            i--;
          
        }
        while(j<i)
        {
            if(j==0)
            {
            System.out.print(s.charAt(j)+".");
            }
            else
            {
                c=s.charAt(j);
                d=s.charAt(j+1);
                if(c==' '&&d!=' ')
                {
                    System.out.print(d+".");
                }
                
             }
             j++;
        
                    
        }
        System.out.println(s.substring(i+1));
        
    }
    
}
