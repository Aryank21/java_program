
package JavaApplication_;

import java.util.Scanner;


public class StringExample 
{
    public static void main(String []args)
    {
       
       // String s1=new String();
      //  String s2= new String();
        Scanner sc= new Scanner (System.in);
        
      String  s1="Aryan";
        System.out.println(" 1 string: "+s1);
       String s2="kumar";
        System.out.println("2 string: "+s2);
        
        
        System.out.println("compare both strings ");
        System.out.println(s1.compareTo(s2));
       String a= s1.toLowerCase();
        System.out.println("print lower case first string: "+a);
        String b=s2.toUpperCase();
        System.out.println("print upper case second string: "+b);
        
        System.out.println("return substring from 2 index both strings: \n"+"string 1st: "+s1.substring(2)+"\n"+"string 2nd: "+s2.substring(2));
                System.out.println("return substring from 2 to 4 index both strings: \n"+"string 1st: "+s1.substring(2,4)+"\n"+"string 2nd: "+s2.substring(2,4));
                String str3=s1.concat(s2);
                
                System.out.println("s1 and s2 after using concat function: "+str3);
                System.out.println("indexof function in 1st string:"+s1.indexOf('r'));

               
        
        
    }
}
