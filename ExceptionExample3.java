
package JavaApplication_;

public class ExceptionExample3 
{
    
    public static void main(String[] args) 
    {
        try
        {
            int a= args.length;
            System.out.println("a="+a);
            int b= 42/a;
            int c[]={1};
            c[42]=99;
            
        }
        catch(ArithmeticException e)
        {
            System.out.println("divide by 0:"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("array index oob"+e);
                }
        System.out.println("after try/catch blocks");
    }
}
