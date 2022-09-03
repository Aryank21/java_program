/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapkg;

public class Volume {
    
    public static void main(String[] args)
    {
        double weight=20.3;
        Box bb= new Box();
       
    }
    
}
class BoxWeight
{
   
    BoxWeight()
    {
    double weight=20.3;
    }
  
    
}
class Box extends BoxWeight
{
    Box()
    {
    super();
        double weight=4,height=1.0,depth=4.0;
        //System.out.println("volume from parent class: "+(weight*height*depth));
        System.out.println("volume from child class"+(weight*height*depth));
    }
   
    
}