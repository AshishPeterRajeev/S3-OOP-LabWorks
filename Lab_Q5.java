/* Program to find and display sum of first 'n' natural numbers */

import java.util.Scanner;
class Lab_Q5
{
    public static void main(String args[])
    {
        int i,n,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as limit: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
            s+=i;
        System.out.println("\nThe sum of first "+n+" natural numbers: "+s);
    }
}