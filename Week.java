
package JavaApplication_;
import java.util.Scanner;
public class Week 
{
    public static void main(String[] args) {
        System.out.println("Enter your choice: ");
        Scanner sc= new Scanner(System.in);
        int choice= sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Sunday");
            break;
             case 2:
            System.out.println("Monday");
            break;
             case 3:
            System.out.println("Tuesday");
            break;
             case 4:
            System.out.println("Wednesday");
            break;
             case 5:
            System.out.println("Thursday");
            break;
             case 6:
            System.out.println("friday");
            break;
             case 7:
            System.out.println("Saturday");
            break;
             default:
                 System.out.println("Invalid Number");
            
        }
                    
    }
}
