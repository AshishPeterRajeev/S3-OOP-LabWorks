/* Program to check if a number is odd or even */

import java.util.Scanner;
class Lab_Q3
{
    public void odd_even()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println("\nThe entered number ("+n+") is an even number.");
        else
            System.out.println("\nThe entered number ("+n+") is an odd number.");
    }
    public static void main(String args[])
    {
        Scanner sc1 = new Scanner(System.in);
        Lab_Q3 t = new Lab_Q3();
        char c;
        System.out.println("Program to check if a number is odd or even.\n");
        do
        {
            t.odd_even();
            System.out.print("\n\nDo you want to check another number? Y/N ::: ");
            c = sc1.next().charAt(0);
            System.out.println();
        }
        while(c=='y'||c=='Y');
    }
}