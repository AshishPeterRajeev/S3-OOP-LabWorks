/* Program to print the factorial of first 'n' numbers */

import java.util.Scanner;
class Lab_Q8
{
    public static void main(String args[])
    {
        int i=1,n; double f=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a limit: ");
        n = sc.nextInt();
        while(i<n)
        {
        	for(i=1;i<=n;i++)
        	{
        		f*=i;
        		System.out.println("The Factorial of "+i+" is : "+f);
        	}
        }
    }
}



//using for-loop instead of while
/*
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                f*=j;
            }
            System.out.println("The Factorial of "+i+" is: "+f);
            f=1;
        }
*/
