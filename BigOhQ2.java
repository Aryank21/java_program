/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapkg;

import java.util.Arrays;

/**
 *
 * @author Aryan
 */
public class BigOhQ2 {
    public static void main(String[] args) {
        int []numfirst=new int[]{2,4,7,2};
        
        int []nums=new int[4];
       int []nums1=new int[4];
       int j=0,k=0;
        for(int i=3;i>=0;i--)
        {
            
           int a=numfirst[i];
                nums[j]=a;
                j++;
             
           }
         System.out.print(Arrays.toString(nums)); 
          for(int i=0;i<4;i++)
        {
            
           nums1[i]=nums[i]+numfirst[i];
             
           }
         
         System.out.println(Arrays.toString(nums1));
         
        
        
       
        }
}
        
       
        
 