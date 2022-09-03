/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaApplication_;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Readfiles{
  public static void main(String[] args) {
         String userString;
    try {
      File myObj = new File("C:\\Users\\Aryan\\Desktop\\file\\Dictionary.txt");
      Scanner myReader = new Scanner(myObj);
        System.out.println("enter word");
      Scanner sc=new Scanner(System.in);
      userString=sc.nextLine();
      
      while (myReader.hasNextLine())
      {
          if(userString==myReader.toString())
          {
        String data = userString;
              System.out.println("found");
        System.out.println(data);
        break;
          }
          else
          {
              System.out.println("not found");
              break;
          }
      }
      myReader.close();
      
      
      
      
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
     // e.printStackTrace();
    }
  }
}