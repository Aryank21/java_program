
package JavaApplication_;

import java.util.Scanner;

public class CountVolCon 
{
    public static void main(String[] args)
    {
       int i,vol=0,cons=0;
        System.out.println("enter strings");
        
       String s=new String();
       Scanner sc= new Scanner(System.in);
       s=sc.nextLine();
       s=s.toUpperCase();
       for(i=0;i<s.length();i++)
       {
           char c=s.charAt(i);
           if(c!=' ')
           {
               if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
               {
                   vol++;
               }
               else
                   cons++;
           }
       }
        System.out.println("consonant="+cons+" "+"vowels="+vol);
        System.out.println("total word ="+(cons+vol));
    }
}
