
package JavaApplication_;

import java.util.Scanner;
public class PrimeAlter{
    public static void main(String args[])
    {
         Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();

        System.out.println("The alternate prime numbers within "+num+" are :");
        int iter = 2;
        for(int i = 2; i<=num;i++)
        {
            if(isPrime(i))
            {
                if(iter%2==0)
                    System.out.print(i+", ");
                iter++;
            }
        }

    }
     //Function to check for prime
    static boolean isPrime(int num)
    {
        int iter = 2;
        boolean flag = true;
        while (num > iter)
        {
            if (num % iter == 0)
            {
                flag = false;
                break;
            }
            iter++;
        }
        return flag;
    }

}