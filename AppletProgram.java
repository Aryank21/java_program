
package JavaApplication_;
import java.awt.*;
/**
 *
 * @author Aryan
 */
public class AppletProgram extends Frame
{
    public static void main(String[] args) 
    {
        AppletProgram  ap =new AppletProgram ();
        
    }
    AppletProgram ()
    {
    Frame f= new Frame();
    f.setVisible(true);
    f.setSize(600,300);
    f.setBackground(Color.yellow);
    f.setTitle("Applet");
    Button b= new Button();
       add(b);
  
}

}
