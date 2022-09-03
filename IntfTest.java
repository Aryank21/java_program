/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication_;

/**
 *
 * @author Aryan
 */
/* An example Java Program to demontrate the working of an Interface*/


interface Shape

{

     float PI=3.14f;

      float computeArea();

}


class Circle implements Shape

  {

    float radius;

    Circle (float r)

      {

        radius=r;

       }


      public float computeArea()

       {

        return PI*radius*radius;

       }


  }

 





class IntfTest

   {

      public static void main(String args[])

        {

          Circle c1=new Circle(7.0f);

    float ar=0.0f;

     ar=c1.computeArea();

      System.out.println("Area is = "+ar);

  }

    }