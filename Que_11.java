/*
Q11.Write a program converting to binary
Input - 19 output -10011
Input - 100000000 Output - 101111101011110000100000000
 */


package com.target.ignite;
import java.util.*;

public class Que_11 {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int[] b_array = new int[400];
        System.out.println("Enter decimal number to convert it into binary : ");
        int n = sc.nextInt();

        int i = 0;
        while(n>0)
        {
            n = n/2;
            b_array[i] = n%2;       //binary array for storing remainders or binary numbers
            i++;
        }

        System.out.println("Binary Number : ");
        for(int j=i-1;j>=0;j--)        //print the binary number
        {
            System.out.print(b_array[j]);
        }
    }
}
