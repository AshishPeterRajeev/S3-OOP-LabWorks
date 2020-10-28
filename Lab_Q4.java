/* Program to check if a number is Prime or not */

import java.util.Scanner;
class Lab_Q4
{
    void primetest()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 2;
        boolean c = false;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                c = true;
                break;
            }
                ++i;
        }
        if (!c)
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is Not a Prime Number.");
    }
    public static void main(String args[])
    {
        Scanner sc1 = new Scanner(System.in);
        Lab_Q4 t = new Lab_Q4();
        char c;
        System.out.println("Program to check if a number is Prime or not!\n");
        do
        {
            t.primetest();
            System.out.print("\nDo you want to check another number? Y/N ::: ");
            c = sc1.next().charAt(0);
            System.out.println();
        }
        while(c=='y'||c=='Y');
    }
}