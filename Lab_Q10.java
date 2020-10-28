/* Program to check whether a number is Armstrong or not */

import java.util.Scanner;
import java.lang.Math;
class Lab_Q10
{
    public void check_Arm()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c=0,d,r=0,n1=n,n2=n;
        while(n1!=0)
        {
            int d1 = n1%10;
            c++;
            n1/= 10;
        }
        while(n!=0)
        {
            d = n%10;
            r+=Math.pow(d,c);
            n/= 10;
        }
        if(r==n2)
          System.out.println("Entered number is Armstrong");
        else
          System.out.println("Entered number is Not Armstrong");
    }
    public static void main(String args[])
    {
        Lab_Q10 l = new Lab_Q10();
        Scanner sc = new Scanner(System.in);
        char c;
        System.out.println("Program to check whether a number is Armstrong or not");
        do
        {
            l.check_Arm();
            System.out.print("\nDo you want to check another number? (Y/N) : ");
            c = sc.next().charAt(0);
            System.out.println();
        }
        while(c=='Y'||c=='y');
    }
}
