
package javapkg;


public class InternalExternal 
{
    public static void main(String[] args)
    {
        External ee= new External();
       External.Internal ii= ee.new Internal();
        System.out.println(ee.x+ee.y+ii.z);
       
    }
    
}



class External
{
    int x=3,y=4;
    class Internal
    {
        
       int z=20;
      
    }
    
}
