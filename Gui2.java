/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication_;
import java.awt.*;


class Gui2 extends Frame 
{
    public static void main(String[] args)
    {
        Gui2 g=new Gui2();
        
    }
    
        Gui2()
        {
            
          /*  Button bb=new Button("gguhjh");
          //  bb.setSize(,);
            bb.setBounds(20,30, 20,30);
           bb.setBackground(Color.red);
           Label l = new Label();
           l.setBounds(80,200,150,60);
           add(l);
            add(bb);*/
            setBackground(Color.red);
    	Button b = new Button("SUBMIT");
    	b.setBounds(80,100,200,30);
    	b.setBackground(Color.gray);
    	setVisible(true);
    	setSize(300,400);
    	setTitle("FRAME");
    	Label l =new Label("NAME");
    	l.setBounds(80,200,150,60);
    	add(b);
    	add(l);
            
        }
    
}
