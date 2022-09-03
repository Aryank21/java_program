
package JavaApplication_;

public class ArrayExample 
{
    public static void main(String[] args) 
    {
        A aa=new A();
        B bb= new B();
        C cc= new C ();
        aa.AddArray();
        bb.subArray();
        cc.MultiArray();
        
    }
}
class A
{
    int a[]={1,2,3,4,5};
    int sum=0;
    
    int AddArray()
    {
       for(int i=0;i<5;i++)
        {
            sum+=a[i];
        }
       return (sum);
    }
}
class B
{
    int a[]={1,2,3,4,5};
    int sub=0;
    int subArray()
    {
       for(int i=0;i<5;i++)
        {
            sub-=a[i];
        }
       return (sub);
    }
}
class C
{
    int a[]={1,2,3,4,5};
    int multi=1;
    int MultiArray()
    {
       for(int i=0;i<5;i++)
        {
            multi*=a[i];
        }
       return (multi);
    }
}

