
/*
Q10. Write a program GreatestCommonDivisor that finds the greatest common divisor (gcd) of
two integers using Euclid’s algorithm,
which is an iterative computation based on the following observation:
if x is greater than y, then if y divides x, the gcd of x and y is y;
otherwise, the gcd of x and y is the same as the gcd of x % y and y.
 */

package com.target.ignite;
import java.util.Scanner;

public class Que_10 {

    public static int gcd(int x,int y) //euclidean logic for GCD
    {
        if(x==0)
            return y;
        return gcd(y%x , x);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x = sc.nextInt();
        System.out.println("Enter second number : ");
        int y = sc.nextInt();

        int result = gcd(x,y);                          //call the static method

        System.out.println("GCD of number : "+result);

    }
}


/*

OUTPUT :
"C:\Program Files\Java\jdk-14.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=60928:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\WIN10\IdeaProjects\Edureka\out\production\Edureka com.target.ignite.Que_10
Enter first number :
33
Enter second number :
11
GCD of number : 11

Process finished with exit code 0


 */