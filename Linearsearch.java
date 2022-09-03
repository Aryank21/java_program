
package JavaApplication_;

import java.util.Scanner;

class Lsearch 
{
    
   int key;
   int a[]=new int[10];
    
    
   void getdata()
   { 
       int i;
        Scanner sc= new Scanner(System.in);
         System.out.println("enter Array elememt");
          for(i=0;i<5;i++)
         {
            
             a[i]=sc.nextInt();
             
         }
          System.out.println("enter number to search");
          key=sc.nextInt();
        
   }
 void search()
 {
     int i,pos=1;
      int flag=0;
      
      for(i=0;i<5&&flag==0;i++)
      {
          if(a[i]==key)
              flag=1;
           pos=i+1;
      }
      
      if(flag==1)
          System.out.println("number found postion at"+pos);
     else
          System.out.println("number not found");
 }
}
class Linearsearch 
{
    public static void main(String[] args) {
        Lsearch aa= new Lsearch();
        aa.getdata();
        aa.search();
    }
}

