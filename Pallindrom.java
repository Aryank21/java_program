
package JavaApplication_;

 import java.util.*;
public class Pallindrom
{  
   public static void main(String[] args) 
   {  
       
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       int num=sc.nextInt();
       int r,sum=0;
       int temp=num;    
       while(num>0)
       {    
       r=num%10;  //1 --> 0 
       sum=(sum*10)+r;    //1---> 10
       num=num/10;   //1 
       }    
        if(temp==sum)    
        System.out.println("The entered number "+temp+" is a palindrome number ");    
        else    
        System.out.println("The entered number "+temp+" is not a palindrome");    
  }  
} 

