package com.target.ignite;

public class Que_1 {

    public static void main(String[] args){

        //Conversion from String to integer
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if(a==b && a==c) //Checks if nos are equal or not
        {
            System.out.println("All three are equal.");
        }
        else  //if nos are not equal
        {
            System.out.println("All three are not equal.");
        }

    }

}
