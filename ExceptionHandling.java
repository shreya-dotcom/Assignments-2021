
/*
Use case – Check Swiggy delivery to your area.

• Develop a method that accepts a zip code and validates against non-deliverable zip codes.

• Example – zip codes 123, 456, 789 are non-deliverable.

• If the customer resides at a non-deliverable zip code, throw a custom exception.

• Handle the exception and display an appropriate message to the customer.

• If the customer resides at a deliverable zip code, display a message “Delivery available in your area! “.

• Invoke this method from public static void main(String[] args) which takes the zip code as an input parameter.
 */

package com.target.ignite;
import java.util.Scanner;

class zipException extends Exception {   //user defined class for exception of zip
    public zipException(int code)         //constructor of the class zipException
    {
        super(String.valueOf(code));
    }

    public zipException(String s) {
    }
}
public class ExceptionHandling {

    static int cnt_digit(int zip)
    {
        int cnt=0;
        int code = zip;
        while(code>0)
        {
            code = code/10;
            cnt++;
        }
        return cnt;
    }
    static void chk_zipcode(int zip) throws zipException
    {
        if(cnt_digit(zip)<5 ||
                cnt_digit(zip)>10 )     //invalid zip code
        {
            throw new zipException("No of digits in zip code are incorrect");
        }
        else
        {
            System.out.println("Wait..");
            System.out.println("Searching your address");
        }
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the zip code of your area :");
        int code = sc.nextInt();
        try
        {
            chk_zipcode(code);
        }
        catch (zipException z)
        {
            System.out.println("Your zip code is in incorrect format... ");
            System.out.println(z.getMessage());
            System.out.println("Please try again...");
        }

    }

}
