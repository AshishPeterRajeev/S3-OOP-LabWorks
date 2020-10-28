/* Program to print first 'n' terms of Fibonacci Series */

import java.util.Scanner;
class Lab_Q7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms of the Fibonacci Series to display: ");
        int n = sc.nextInt();
        int f=0,s=1;
        System.out.print("First " +n+ " terms::   ");

        for(int i=1;i<=n;i++)
        {
            System.out.print(f+"\t");

            int sum = f+s;
            f = s;
            s = sum;
        }
    }
}