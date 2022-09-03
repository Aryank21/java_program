
package JavaApplication_;

import java.util.*;

public class VectorExample
{
    public static void main(String[] args)
    {
        Vector vv=new Vector();
        vv.addElement("Apple");
         vv.addElement("mango");
          vv.addElement("Guava");
           vv.addElement("orange");
            System.out.println("vector list: "+vv);
            vv.insertElementAt("papaya", 1);
            System.out.println("vector list after add: "+vv);
            System.out.println("size of vector"+vv.size());
            vv.removeElement("papaya");
           System.out.println("vector list after remove: "+vv);
           vv.removeAllElements();
           System.out.println("vector list after remove all:"+vv);
    }
}
