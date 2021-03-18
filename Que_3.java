/*
Q3. Write a program that takes an integer command-line argument n
and prints all the positive powers of 2 less than or equal to n.
Make sure that your program works properly for all values of n.
 */


package com.target.ignite;

public class Que_3 {

    public static int Power(int number , int power)  //recursive function to get the power of number
    {
        if(power==0)
        {
            return 1;
        }
        return (number * Power(number,power-1));
    }

    public static void main(String[] args)
    {
        int number = 2;

        int p = Integer.parseInt(args[0]); // get the number

        if(p<0) //if number is negative gives message
        {
            System.out.println("Enter positive number...");
        }

        
        if(p>0) // power of 2 can be calculated iff power is positive
        {
            for(int i=0;i<=p;i++)
            {
                int result = Power(number,i);
                System.out.println(result); //print the power of number
            }
        }

    }
}
