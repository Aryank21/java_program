/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapkg;

/**
 *
 * @author Aryan
 */
public class TargetNums {
    public static void main(String[] args) {
     int[] a= new int[]{ 10,8,9,5}; 
     int[] b= new int[]{ 2,7,2,1}; 
     int target=2;
     int ans=0;
     for(int i=0;i<3;i++)
     {
         for(int j=0;j<3;j++)
         {
              ans=a[i]-b[j];
             if(target==ans)
             {
            System.out.println("found ");
             System.out.println("found at first array index"+i+" second array"+j);
            break;
            
             }
         }
         
     }
     
    }
    
    
}
         
             
            
            
             
              
         
    
      
    
        
    
    

