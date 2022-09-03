
package JavaApplication_;
import java.util.Scanner;

public class NegativePositiveZero
{
    
        public static void main(String[] args)
    {
        System.out.println("Enter number for finding even odd: ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a<0)
        {
            System.out.println("negative");
        }
            else if(a>0)
            {
                    System.out.println("Positive");
            }
                            else
            {
                System.out.println("Zero");
            }
       
        }
    }

    

    
        
