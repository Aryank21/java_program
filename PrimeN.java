
package JavaApplication_;

import java.util.*;

public class PrimeN

{

public static void main(String[] args)

{

int num=1, count=0, i;

Scanner sc=new Scanner(System. in);

System.out.println("To find the nth Prime Number: ");

System.out.println("Enter the value of n: ");

int n = sc.nextInt();

while (count < n)

{

num=num+1;

for (i = 2; i <= num; i++)

{

if (num % i == 0)

{

break;

}

}

if (i == num)

{

count = count+1;

}

}

System.out.println("Value of "+n+ "th prime is: " + num);

}

}