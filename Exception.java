
package JavaApplication_;

public class Exception 
{
    public static void main(String[] args) 
    {
        int d,a;
        try
        {
        d=0;
        a=42/d;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println("divison by zero");
            
        }
    }
        
    
}
