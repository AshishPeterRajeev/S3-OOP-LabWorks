/* Program to check whether a number is Palindrome */

import java.util.Scanner;
class Lab_Q9
{
    public void check_Pal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int d,r=0,n1=n;
        while(n!=0)
        {
            d = n%10;
            r = (r*10)+d;
            n/=10;
        }
        if(r==n1)
            System.out.println("Entered number is Palindrome");
        else
            System.out.println("Entered number is Not Palindrome");
    }
    public static void main(String args[])
    {
        Lab_Q9 l = new Lab_Q9();
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("Program to check whether a number is Palindrom or not");
        do
        {
            l.check_Pal();
            System.out.print("\nDo you want to check another number? (Y/N) : ");
            c = sc.next().charAt(0);
            System.out.println();
        }
        while(c=='Y'||c=='y');
    }
}
