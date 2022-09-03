
package JavaApplication_;
import java.util.Scanner;

class Demo
{
    
    public static void main(String [] args)
    {
        int m,val;
        Reverse rr=new Reverse();
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        m=sc.nextInt();
        rr.putData(m);
        val=rr.getData();
        System.out.println("Reverse"+val);
        
    }
    
}
class Reverse
{
    int n;
  void putData(int i) 
  {
     n=i;
  }
  int getData()
  {
     int rev=0;
      while(n>0)
      {
          rev=(rev*10)+n%10;
          n=n/10;
          
      }
  
     return(rev);
}
}
