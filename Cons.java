/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication_;


 
 class Box {

  double width;

  double length;

  double depth;


  // default constructor for Box.

  Box() {

    System.out.println("Constructing Box");

    width = 10;

    length = 10;

    depth = 10;

  }


  // compute and return volume

  double volume() {

    return width * length * depth;

  }

}

class BoxDemo7 {

  public static void main(String args[]) {

    // declare, allocate, and initialize Box objects

   Box mybox1 = new Box();

    Box mybox2 = new Box();


    double vol;


    // get volume of first box

    vol = mybox1.volume();

    System.out.println("Volume is " + vol);


    // get volume of second box

    vol = mybox2.volume();

    System.out.println("Volume is " + vol);

  }

}

 