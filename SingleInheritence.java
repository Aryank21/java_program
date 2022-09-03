
package JavaApplication_;


public class SingleInheritence
{
    
    public static void main(String[] args)
    {
       B bb= new B();
       bb.add();
       //bb.addc();
    }
 
}
class A
{
       
    
    int a=1;
    int b=2;

    void add()
    {
        System.out.println("add a and b "+(a+b));
    }
    
    
}
class B extends A
{
  int c=4 ;
void addc()
{
    System.out.println("add three "+(a+b+c));
}
}

