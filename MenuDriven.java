package JavaApplication_;
import java.util.Scanner;
public class MenuDriven
{
     public static void main(String[] args)
    {
         System.out.println("""
                            what you want to do
                            click
                            -> 1 for Even_ODD
                            -> 2 for Positive,Negative & Zero
                            -> 3 for Aithmetic_opration
                            ->4 for leap_Year
                            -> 5 for reverse 
                            -> 6 for weeks""");
        Scanner sc= new Scanner(System.in);
        int want= sc.nextInt();
        switch(want)
        {
            case 1:
             System.out.println("Enter number for finding even odd");
        int a= sc.nextInt();
        if(a%2==0)
        
            System.out.println("Even");
            else
            System.out.println("Odd");
            
            break;
             case 2:
           System.out.println("Enter number for finding even odd: ");
        int b= sc.nextInt();
        if(b<0)
        {
            System.out.println("negative");
        }
            else if(b>0)
            {
                    System.out.println("Positive");
            }
                            else
            {
                System.out.println("Zero");
            }
           break;
             case 3:
            System.out.println("Enter two number: ");
        
        int c= sc.nextInt();
        int d= sc.nextInt();
        System.out.println("Enter your choice-> 11 for Addition,-> 12 for Subtract,-> 13 for Divide,-> 14 for Multiply ");
        int user= sc.nextInt();
        switch(user)
        {
            case 11:
                int sum=c+d;
            System.out.println(sum);
            break;
             case 12:
                 int sub=c-d;
            System.out.println(sub);
            break;
             case 13:
                 int div=c/d;
            System.out.println(div);
            break;
             case 14:
                 int multi=c*d;
            System.out.println(multi);
            break;
             
             default:
                 System.out.println("Invalid Number");
           
        }
        break;
             case 4:
            System.out.println("Enter year");
      
     int f= sc.nextInt();
        if (f%4==0 && f%100==0 && f>0)
        {
            System.out.println("leap year");
        }
        else if (f<0)
        {
            System.out.println("Invalid Number");
        }
        
        else
        {
            System.out.println("Non leap Year");
        }
          
            break;
             case 5:
            int g,rev=0,rem=0;
        System.out.println("enter a number");
        
        g=sc.nextInt();
               while(g>0)
           {
             rem=g%10;
             rev=(rev*10)+rem;
             g=g/10;
           }
               System.out.println(rev);
            break;
             case 6:
            System.out.println("Enter number according to days");
        
        int me= sc.nextInt();
        switch(me)
        {
            case 1 -> System.out.println("Sunday");
             case 2 -> System.out.println("Monday");
             case 3 -> System.out.println("Tuesday");
             case 4 -> System.out.println("Wednesday");
             case 5 -> System.out.println("Thursday");
             case 6 -> System.out.println("friday");
             case 7 -> System.out.println("Saturday");
             default -> System.out.println("Invalid Number");
            
        }
            break;

        
             default:
                 System.out.println("Invalid Number");
            
        
        }
                     
    }
    }
        


     
    

