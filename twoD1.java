
package JavaApplication_;
import java.util.Scanner;

public class twoD1 
{
    int i,j;
    int a[][]=new int[3][3];
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("enter array element:");
                a[i][j]= sc.nextInt();
            }
        }
       
        }
    void putdata()
    {
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
        {
            System.out.print(a[i][j]+"  ");
        }
            System.out.println("   ");
    }
    }
    public static void main(String[] args) 
    {
      twoD1 tt =new twoD1();
      tt.getData();
      tt.putdata();
        
    }
}

