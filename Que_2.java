/*
Write a Java program to sort a given binary array in linear times.
b_nums[] = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 }
Output: After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */

package com.target.ignite;
import java.util.*;

public class Que_2 {

    static void BinaryArray(int[] a, int n) //for sorting binary array
    {
        int pos = -1; // initializing to store position of zeroes while sorting
        for(int i=0;i<n;i++) //traverse the array
        {
            if(a[i]<1) //Encounters the position where zero ia present
            {
                pos++;
                int temp = a[i];  //for replacement of 0 and 1
                a[i] = a[pos];
                a[pos] = temp;
            }
        }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array :");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Binary Array :");
        for(int i=0;i<size;i++) //accept the array from user
        {
            arr[i] = sc.nextInt();
        }

        BinaryArray(arr,size); // call static method to sort an array

        System.out.println("Binary Array after Sorting : "); // print sorted array
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
