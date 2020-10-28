/* Program to find and display factor(s) of a number */

import java.util.Scanner;
class Lab_Q6
{
    void factor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.print(i+"\t");
        }
    }
    public static void main(String args[])
    {
        Scanner sc1 = new Scanner(System.in);
        Lab_Q6 t = new Lab_Q6();
        char c;
        System.out.println("Program to find the factor of a number.\n");
        do
        {
            t.factor();
            System.out.print("\n\nDo you want to check factor of another number? Y/N ::: ");
            c = sc1.next().charAt(0);
            System.out.println();
        }
        while(c=='y'||c=='Y');
    }
}