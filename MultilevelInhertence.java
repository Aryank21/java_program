
package JavaApplication_;

public class MultilevelInhertence
{
    public static void main(String[] args)
    {
        C cc=new C();
        cc.add();
    }
    
}
class A
{
   int a=2;
    
}
class B extends A
{
  
    int b=2;

}

class C extends B
{
    void add()
    {
        System.out.println("add "+(a+b));
    }
}