
package JavaApplication_;

public class NullException {
    public static void main(String[] args) 
    {
        try
        {
            String s= null;
            System.out.println(s.charAt(0));
        }
        catch(NullPointerException e)
        {
            System.out.println("Null pointer exception");
        }
    }
    
    
}
