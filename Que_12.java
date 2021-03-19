
/*
Q12. Write a program Checkerboard that takes an integer command-line argument n and
uses a loop nested within a loop to
print out a two-dimensional n-by-n checkerboard pattern with alternating spaces and asterisks.
 */
package com.target.ignite;


public class Que_12 {

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        System.out.println("The Pattern is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
